package com.greenfoxacademy.springstart;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpringstartApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(SpringstartApplication.class, args);
  }

  @RequestMapping(value="/hello")
  @ResponseBody
  public String hello() {
    return "Hello World!";
  }

  @Override
  public void run(String... args) throws Exception {
    Logger tcpLogger = Logger.getLogger("sun.rmi.transport.tcp");
    tcpLogger.setLevel(Level.SEVERE);
  }
}
