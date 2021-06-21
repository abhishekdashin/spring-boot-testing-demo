package com.perfios.testingdemo.controllers;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.perfios.testingdemo.services.HelloWorldService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@WebMvcTest(HelloWorldController.class)
class HelloWorldControllerMockitoTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private HelloWorldService helloWorldService;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Test
  void given_whenHittingRootUrl_shouldReturnGreeting() throws Exception{
    when(helloWorldService.welcomeMessage()).thenReturn("Hello World..");

    mockMvc.perform(get("/"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().string(containsString("Hello World..")));
  }
}