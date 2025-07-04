package com.jitu.StockService.exception;

public class StockNotFoundException extends RuntimeException {

    public StockNotFoundException(String company) {
        super("Stock not found for company: " + company);
    }
}
