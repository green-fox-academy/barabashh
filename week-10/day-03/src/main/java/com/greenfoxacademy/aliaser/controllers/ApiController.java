package com.greenfoxacademy.aliaser.controllers;

import com.greenfoxacademy.aliaser.DTOs.AliaserDTO;
import com.greenfoxacademy.aliaser.models.Aliaser;
import com.greenfoxacademy.aliaser.services.AliasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

  private AliasService aliasService;

  @Autowired
  public ApiController(AliasService aliasService) {
    this.aliasService = aliasService;
  }

  @GetMapping("/api/links")
  public List<Aliaser> returnAliaserListInSpecificFormat() {
    return aliasService.returnAllAliasersInSpecificFormat();
  }

  @DeleteMapping("/api/links/{id}")
  public ResponseEntity<?> deleteLinks(@PathVariable Long id, @RequestBody AliaserDTO aliaserDTO) {
    int statusCode = aliasService
        .deleteLinkByIdAndSecretCodeAndReturnStatusCode(id, aliaserDTO.getSecretCode());
    if (statusCode == 204) {
      return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    if (statusCode == 403) {
      return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }
    if (statusCode == 404) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    } else {
      return null;
    }
  }
}
