package com.greenfoxacademy.di;

import com.greenfoxacademy.di.coloringaround.MyColor;
import com.greenfoxacademy.di.hellodi.Printer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication implements CommandLineRunner {

  private Printer printer;
  private MyColor myColor;

  @Autowired
  public DiApplication(Printer printer, MyColor myColor){
    this.printer = printer;
    this.myColor = myColor;
  }
  public static void main(String[] args) {
    SpringApplication.run(DiApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Logger tcpLogger = Logger.getLogger("sun.rmi.transport.tcp");
    tcpLogger.setLevel(Level.SEVERE);

    myColor.printColor();
    printer.log("Calling the printer from Main");
  }
}
