package com.greenfoxacademy.urlaliaser.services;

import com.greenfoxacademy.urlaliaser.models.Aliaser;
import com.greenfoxacademy.urlaliaser.repositories.AliasRepository;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class AliasServiceImpl implements AliasService{

  private AliasRepository aliasRepository;

  public AliasServiceImpl(AliasRepository aliasRepository) {
    this.aliasRepository = aliasRepository;
  }

  @Override
  public int generateSecretCode() {
    Random r = new Random();
    return r.nextInt(10000);
  }

  @Override
  public void saveAlias(Aliaser aliaser){
    aliasRepository.save(aliaser);
  }

  @Override
  public boolean checkWhetherAliasExists(String alias) {
    List<Aliaser> matchingAliasers = aliasRepository.findByAlias(alias);
    return (matchingAliasers.size() > 0);
  }
}
