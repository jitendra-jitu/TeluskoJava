package com.jitu.StockService.service;

import org.springframework.http.ResponseEntity;

public interface StockServiceInterface {
        ResponseEntity<Integer> getStockPrice(String company);
}
