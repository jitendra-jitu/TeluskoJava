package com.jitu.StockFeignMicroservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("STOCKSERVICE")
public interface StockFeignClient {

    @GetMapping("/stockprice/{company}")
    public ResponseEntity<Integer> getStockPrice(@PathVariable String company);


}
