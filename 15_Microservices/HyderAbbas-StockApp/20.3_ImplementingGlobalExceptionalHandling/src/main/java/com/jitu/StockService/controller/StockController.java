package com.jitu.StockService.controller;

import com.jitu.StockService.service.StockService;
import com.jitu.StockService.service.StockServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    @Autowired
    private StockServiceInterface stockService;

    @GetMapping("/stockprice/{company}")
    public ResponseEntity<Integer> getStockPrice(@PathVariable String company) {

        return stockService.getStockPrice(company);
    }

}
