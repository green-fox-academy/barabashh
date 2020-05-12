package com.greenfoxacademy.backendtest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.awt.PageAttributes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
//@WebMvcTest(Controller.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ArrayHandlerEndPointTests {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      StandardCharsets.UTF_8);

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void arraysEndPointShouldReturn72whenWhatSumAndArray1_2_5_10_54IsSent() throws Exception {
      mockMvc.perform(post("/arrays")
          .contentType(MediaType.APPLICATION_JSON)
          .content("{\n" +
              "  \"what\": \"sum\",\n" +
              "  \"numbers\": [1, 2, 5, 10, 54]\n" +
              "}"
          ))
          .andExpect(status().isOk());
  }
}
