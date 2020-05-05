package com.greenfoxacademy.backendtest.services;

import com.greenfoxacademy.backendtest.models.NumberObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface BackEndService {
  ResponseEntity<?> doubleNumber(Integer inputNumber);

  ResponseEntity<?> greeter(String name, String title);

  ResponseEntity<com.greenfoxacademy.backendtest.models.Appendable> appendA(String appendable);

  ResponseEntity<?> dountil(String action, NumberObject number);
}
