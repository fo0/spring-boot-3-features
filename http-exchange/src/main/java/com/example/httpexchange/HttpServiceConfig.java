package com.example.httpexchange;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class HttpServiceConfig {

  @Bean
  public HttpBinClient createHttpClient(HttpServiceProxyFactory factory) {
    return factory.createClient(HttpBinClient.class);
  }

  @Bean
  public HttpServiceProxyFactory createHttpBinProxyFactory() {
    return HttpServiceProxyFactory
        //
        .builder()
        .clientAdapter(WebClientAdapter.forClient(WebClient.create("https://httpbin.org")))
        .build();
  }

}
