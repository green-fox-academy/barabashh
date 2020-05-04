package com.greenfoxacademy.backendtest.services;

import com.greenfoxacademy.backendtest.models.Doubling;
import com.greenfoxacademy.backendtest.models.ErrorHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BackEndServiceImpl implements BackEndService {

  @Override
  public ResponseEntity<?> doubleNumber(Integer inputNumber) {
    if (inputNumber == null) {
      ErrorHandler errHandler;
      errHandler = new ErrorHandler("Please provide an input!");
      return new ResponseEntity<>(errHandler, HttpStatus.OK);
    } else {
      Doubling doubling = new Doubling(inputNumber, inputNumber * 2);
      return new ResponseEntity<>(doubling, HttpStatus.OK);
    }
  }
}
