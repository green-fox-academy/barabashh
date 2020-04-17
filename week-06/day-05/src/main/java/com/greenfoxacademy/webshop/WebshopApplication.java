package com.greenfoxacademy.webshop;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebshopApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(WebshopApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Logger tcpLogger = Logger.getLogger("sun.rmi.transport.tcp");
    tcpLogger.setLevel(Level.SEVERE);
  }
}
