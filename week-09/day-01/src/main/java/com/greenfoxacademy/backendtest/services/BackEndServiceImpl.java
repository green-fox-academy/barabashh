package com.greenfoxacademy.backendtest.services;

import com.greenfoxacademy.backendtest.models.ArrayHandler;
import com.greenfoxacademy.backendtest.models.Doubling;
import com.greenfoxacademy.backendtest.models.ErrorHandler;
import com.greenfoxacademy.backendtest.models.Greeting;
import com.greenfoxacademy.backendtest.models.NumberObject;
import com.greenfoxacademy.backendtest.models.ResultObject;
import com.greenfoxacademy.backendtest.models.ResultObjectWithStringResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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

  @Override
  public ResponseEntity<?> greeter(String name, String title) {
    if (name == null && title == null) {
      return new ResponseEntity<>(
          new ErrorHandler("Please provide a name and a title!"), HttpStatus.BAD_REQUEST);
    } else if (name == null) {
      return new ResponseEntity<>(
          new ErrorHandler("Please provide a name!"), HttpStatus.BAD_REQUEST);
    } else if (title == null) {
      return new ResponseEntity<>(
          new ErrorHandler("Please provide a title!"), HttpStatus.BAD_REQUEST);
    } else {
      return new ResponseEntity<>(
          new Greeting("Oh, hi there " + name + ", my dear " + title + "!")
          , HttpStatus.OK);
    }
  }

  @Override
  public ResponseEntity<com.greenfoxacademy.backendtest.models.Appendable>
  appendA(String appendable) {
    return new ResponseEntity<>(
        new com.greenfoxacademy.backendtest.models.Appendable(appendable + "a"),
        HttpStatus.OK);
  }

  @Override
  public ResponseEntity<?> dountil(String action, NumberObject number) {
    if (action.equals("sum")) {
      int sumOfNumbers = IntStream
          .range(1, number.until + 1)
          .reduce(0, Integer::sum);
      ResultObject resultObject = new ResultObject(sumOfNumbers);
      return new ResponseEntity<>(resultObject, HttpStatus.OK);
    } else if (action.equals("factor")) {
      int factorOfNumbers = IntStream
          .range(1, number.until + 1)
          .reduce(1, (a, b) -> a * b);
      ResultObject resultObject = new ResultObject(factorOfNumbers);
      return new ResponseEntity<>(resultObject, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(new ErrorHandler("Please provide a number!")
          , HttpStatus.BAD_REQUEST);
    }
  }

  @Override
  public ResponseEntity<?> arrayHandler(ArrayHandler arrayHandler) {
    if (arrayHandler.what == null || arrayHandler.what.equals("") || arrayHandler.numbers == null) {
      return new ResponseEntity<>(new ErrorHandler("Please provide what to do with the numbers!"),
          HttpStatus.BAD_REQUEST);
    }
    switch (arrayHandler.what) {
      case "sum":
        Integer sum = arrayHandler.numbers
            .stream()
            .reduce(0, Integer::sum);
        return new ResponseEntity<>(new ResultObject(sum), HttpStatus.OK);
      case "multiply": {
        Integer result = arrayHandler.numbers
            .stream()
            .reduce(1, (a, b) -> a * b);
        return new ResponseEntity<>(new ResultObject(result), HttpStatus.OK);
      }
      case "double": {
        List<Integer> result =
            arrayHandler.numbers
                .stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        return new ResponseEntity<>(new ResultObjectWithStringResult(result.toString()), HttpStatus.OK);
      }
      default:
        return new ResponseEntity<>(new ErrorHandler("Please provide what to do with the numbers!"),
            HttpStatus.BAD_REQUEST);
    }
  }
}
