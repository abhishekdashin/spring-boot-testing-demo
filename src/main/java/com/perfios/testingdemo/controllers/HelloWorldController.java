package com.perfios.testingdemo.controllers;

import com.perfios.testingdemo.services.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  final HelloWorldService helloWorldService;

  public HelloWorldController(
      HelloWorldService helloWorldService) {
    this.helloWorldService = helloWorldService;
  }

  @GetMapping
  public @ResponseBody String givenHomePageURI_whenMockMVC_thenReturnsWelcomeMessage(){
    return helloWorldService.welcomeMessage();
  }

}
