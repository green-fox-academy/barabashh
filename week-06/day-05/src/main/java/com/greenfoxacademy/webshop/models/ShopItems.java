package com.greenfoxacademy.webshop.models;

import java.util.ArrayList;
import java.util.List;

public class ShopItems {
  private List<ShopItem> shopItemList = new ArrayList<>();

  ShopItems(){
    shopItemList.add(new ShopItem("Running shoes",
        "Nike running shoes for everyday sport",1000.0,5));

    shopItemList.add(new ShopItem("Printer",
        "Some HP printer that will print pages",3000.0,2));

    shopItemList.add(new ShopItem("Coca cola",
        "0.5l standard coke",25.0,0));

    shopItemList.add(new ShopItem("Wokin",
        "Chicken with fried rice and WOKIN sauce",119.0,100));

    shopItemList.add(new ShopItem("T-shirt",
        "Blue with a corgi on a bike",300.0,1));
  }
}
