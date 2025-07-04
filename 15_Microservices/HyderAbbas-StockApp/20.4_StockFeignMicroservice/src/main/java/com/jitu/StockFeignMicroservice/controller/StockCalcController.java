package com.jitu.StockFeignMicroservice.controller;

import com.jitu.StockFeignMicroservice.service.StockCalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockCalcController {

    @Autowired
    StockCalcService stockCalcService;

    @GetMapping("/stockcalc/{company}/{quantity}")
    public ResponseEntity<String> calculateStockValue(@PathVariable String company,@PathVariable Integer quantity) {

        return stockCalcService.getStockPrice(company,quantity);

    }


}
