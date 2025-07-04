package com.jitu.StockService.service;

//import com.jitu.StockService.StockRepository;
import com.jitu.StockService.exception.StockNotFoundException;
import com.jitu.StockService.model.Stock;
import com.jitu.StockService.repo.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StockService implements StockServiceInterface {

    @Autowired
    StockRepository stockRepository;

    public ResponseEntity<Integer> getStockPrice(String company) {

        Stock stock = stockRepository.findByCompanyName(company);
        if (stock == null) {
            throw new StockNotFoundException(company);
        }

        return new ResponseEntity<>(stock.getStockPrice(), HttpStatus.OK);


    }
}
