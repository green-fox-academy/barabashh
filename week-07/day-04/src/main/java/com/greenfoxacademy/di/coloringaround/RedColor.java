package com.greenfoxacademy.di.coloringaround;

import com.greenfoxacademy.di.hellodi.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
public class RedColor implements MyColor {

  private Printer printer;

  @Autowired
  public RedColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("printing in red");
  }
}
