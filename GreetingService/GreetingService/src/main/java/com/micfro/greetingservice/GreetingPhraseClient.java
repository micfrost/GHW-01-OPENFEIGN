package com.micfro.greetingservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "greeting-phrase-service", url = "http://localhost:8081")
public interface GreetingPhraseClient {

  @GetMapping("/greetingprhrase")
  String getGreetingPhrase();
}