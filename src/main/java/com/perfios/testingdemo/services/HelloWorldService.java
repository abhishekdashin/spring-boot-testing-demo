package com.perfios.testingdemo.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

  public String welcomeMessage() {
    return "Hello World..";
  }

}
