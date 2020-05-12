package com.greenfoxacademy.urlaliaser.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aliaser {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String url;
  private String alias;
  private int secretCode;

  public Aliaser() {
  }

  public Aliaser(String url, String alias, int secretCode) {
    this.url = url;
    this.alias = alias;
    this.secretCode = secretCode;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public int getSecretCode() {
    return secretCode;
  }

  public void setSecretCode(int secretCode) {
    this.secretCode = secretCode;
  }
}
