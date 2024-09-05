package com.micfro.greetingservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "guest-person-service", url = "http://localhost:8082")
public interface GuestPersonClient {

  @GetMapping("/guestperson")
  String getGuestPerson();
}