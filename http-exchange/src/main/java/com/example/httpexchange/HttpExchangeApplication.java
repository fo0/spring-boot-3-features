package com.example.httpexchange;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Log4j2
public class HttpExchangeApplication {

  public static void main(String[] args) {
    SpringApplication.run(HttpExchangeApplication.class, args);
  }

  @Bean
  public CommandLineRunner runner(HttpBinClient client) {
    return args -> {
      log.info("UUID: {}", client.getUuid());
      log.info("Base64: {}", client.base64Decode("SGVsbG8sIFdvcmxkIQ=="));
    };
  }

}
