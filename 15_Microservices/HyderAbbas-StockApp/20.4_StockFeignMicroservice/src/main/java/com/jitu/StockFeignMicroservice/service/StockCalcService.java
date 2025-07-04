package com.jitu.StockFeignMicroservice.service;

import com.jitu.StockFeignMicroservice.feign.StockFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StockCalcService {

    @Autowired
    StockFeignClient stockFeignClient;

    public ResponseEntity<String> getStockPrice(String company, Integer quantity) {

        ResponseEntity<String> response = null;

        try{
            ResponseEntity<Integer> stockPrice = stockFeignClient.getStockPrice(company);
            if(stockPrice.getStatusCode().value()==200){
                 response= new ResponseEntity<>("Total StockPrice is "+stockPrice.getBody() * quantity, HttpStatus.OK);
            }


        } catch (Exception e) {

             response=new ResponseEntity<>("Company stock 404 not found...",HttpStatus.BAD_REQUEST);
        }
        return response;

    }
}
