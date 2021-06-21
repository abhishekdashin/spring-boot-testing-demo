package com.perfios.testingdemo;

import static org.assertj.core.api.Assertions.assertThat;

import com.perfios.testingdemo.controllers.HelloWorldController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestingDemoApplicationTests {

  @Autowired
  private HelloWorldController helloWorldController;
  @Test
  void contextLoads() {
    assertThat(helloWorldController).isNotNull();
  }

}
