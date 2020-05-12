package com.greenfoxacademy.urlaliaser.services;

import com.greenfoxacademy.urlaliaser.models.Aliaser;
import org.springframework.stereotype.Service;

@Service
public interface AliasService {
  int generateSecretCode();

  void saveAlias(Aliaser aliaser);

  boolean checkWhetherAliasExists(String alias);
}
