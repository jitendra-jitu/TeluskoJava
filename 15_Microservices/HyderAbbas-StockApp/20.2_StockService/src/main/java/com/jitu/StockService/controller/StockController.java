package com.jitu.StockService.controller;

import com.jitu.StockService.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("/stockprice/{company}")
    public Integer getStockPrice(@PathVariable String company) {

        return stockService.getStockPrice(company);
    }

}
