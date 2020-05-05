package com.greenfoxacademy.backendtest.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Log {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer logId;
  private Date createdAt;
  private String endpoint;
  private String data;

  public Log() {
  }

  public Log(String endpoint, String data) {
    this.createdAt = new Date();
    this.endpoint = endpoint;
    this.data = data;
  }

}
