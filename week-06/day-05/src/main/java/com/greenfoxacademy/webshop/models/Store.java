package com.greenfoxacademy.webshop.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Store {
  private List<ShopItem> shopItemList = new ArrayList<>();

  public void createInitialList() {
    shopItemList.add(new ShopItem("Running shoes",
        "Nike running shoes for everyday sport", 1000.0, 5));

    shopItemList.add(new ShopItem("Printer",
        "Some HP printer that will print pages", 3000.0, 2));

    shopItemList.add(new ShopItem("Coca cola",
        "0.5l standard coke", 25.0, 0));

    shopItemList.add(new ShopItem("Wokin",
        "Chicken with fried rice and WOKIN sauce", 119.0, 100));

    shopItemList.add(new ShopItem("T-shirt",
        "Blue with a corgi on a bike", 300.0, 1));
  }

  public List<ShopItem> getShopItemList() {
    return shopItemList;
  }

  public void add(ShopItem shopItem) {
    shopItemList.add(shopItem);
  }

  public List<ShopItem> getOnlyAvailableItems() {
    List<ShopItem> shopItemList = getShopItemList()
        .stream()
        .filter(i -> i.getQuantityOfStock() > 0)
        .collect(Collectors.toList());
    return shopItemList;
  }

  public List<ShopItem> getItemsOrderedByDisplayingTheCheapestFirst() {
    List<ShopItem> shopItemList = getShopItemList()
        .stream()
        .sorted(Comparator.comparingDouble(ShopItem::getPrice))
        .collect(Collectors.toList());
    return shopItemList;
  }

  public List<ShopItem> getOnlyItemsContainingNike() {
    List<ShopItem> shopItemList = getShopItemList()
        .stream()
        .filter(i -> i.getName().toLowerCase().contains("nike") ||
            i.getDescription().toLowerCase().contains("nike"))
        .collect(Collectors.toList());
    return shopItemList;
  }

  public ShopItem getMostExpensiveItem() {
    Optional<ShopItem> singleShopItem = getShopItemList()
        .stream()
        .sorted(Comparator.comparingDouble(ShopItem::getPrice).reversed())
        .findFirst();
    if (singleShopItem.isPresent()) {
      return singleShopItem.get();
    } else {
      return null;
    }
  }

  public double getAverageStockQuantity() {
    OptionalDouble avg = getShopItemList()
        .stream()
        .mapToInt(i -> i.getQuantityOfStock())
        .average();
    if (avg.isPresent()) {
      return avg.getAsDouble();
    } else {
      return -1;
    }
  }
}
