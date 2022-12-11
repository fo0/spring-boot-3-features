package com.example.httpexchange;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface HttpBinClient {

  @GetExchange("/uuid")
  String getUuid();

  @GetExchange("/base64/{value}")
  String base64Decode(@PathVariable String value);

}
