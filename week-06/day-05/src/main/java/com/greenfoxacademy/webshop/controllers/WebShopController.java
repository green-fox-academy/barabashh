package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.models.ShopItem;
import com.greenfoxacademy.webshop.models.Store;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebShopController {
  Store store;

  WebShopController() {
    store = new Store();
    store.createInitialList();
    ShopItem shopItem = new ShopItem("bottled water",
        "0.5 l standard mineral water", 40.0, 10);
    store.add(shopItem);
  }

  @RequestMapping(value = "/webshop")
  public String index(Model model) {
    model.addAttribute("shopItems", store.getShopItemList());
    return "webshop";
  }

  @RequestMapping(value = "/only-available")
  public String onlyAvailable(Model model) {
    model.addAttribute("shopItems", store.getOnlyAvailableItems());
    return "webshop";
  }

  @RequestMapping(value = "/cheapest-first")
  public String cheapestFirst(Model model) {
    model.addAttribute("shopItems", store.getItemsOrderedByDisplayingTheCheapestFirst());
    return "webshop";
  }

  @RequestMapping(value = "/contains-nike")
  public String containsNike(Model model) {
    model.addAttribute("shopItems", store.getOnlyItemsContainingNike());
    return "webshop";
  }

  @RequestMapping(value = "/average-stock")
  public String averageStock(Model model) {
    model.addAttribute("singleSentence",
        "Average stock: " + store.getAverageStockQuantity());
    return "webshop";
  }

  @RequestMapping(value = "/most-expensive")
  public String mostExpensiveItem(Model model) {
    model.addAttribute("singleSentence",
        "The most expensive item is: " + store.getMostExpensiveItem().getName());
    return "webshop";
  }

}
