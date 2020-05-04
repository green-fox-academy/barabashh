package com.greenfoxacademy.backendtest.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface BackEndService {
  ResponseEntity<?> doubleNumber (Integer inputNumber);
}
