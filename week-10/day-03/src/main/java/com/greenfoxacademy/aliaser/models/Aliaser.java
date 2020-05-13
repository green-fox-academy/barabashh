package com.greenfoxacademy.aliaser.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Random;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aliaser {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @JsonProperty("url")
  private String link;
  private String alias;

  @JsonIgnore
  private String secretCode;

  @JsonProperty("hitCount")
  private int hitNumber;

  public Aliaser(String link, String alias, String secretCode, int hitNumber) {
    this.link = link;
    this.alias = alias;
    this.secretCode = secretCode;
    this.hitNumber = hitNumber;
  }

  public Aliaser() {

  }

  public Long getId() {
    return id;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public String getSecretCode() {
    return secretCode;
  }

  public void setSecretCode(String secretCode) {
    this.secretCode = secretCode;
  }

  public int getHitNumber() {
    return hitNumber;
  }

  public void setHitNumber(int hitNumber) {
    this.hitNumber = hitNumber;
  }

  public static String generateSecreCode() {
    String code = "";
    Random random = new Random();
    for (int i = 0; i < 4; i++) {
      code += random.nextInt(10);
    }
    return code;
  }
}
