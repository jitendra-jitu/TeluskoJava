package com.jitu.StockService.service;

//import com.jitu.StockService.StockRepository;
import com.jitu.StockService.model.Stock;
import com.jitu.StockService.repo.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    StockRepository stockRepository;

    public Integer getStockPrice(String company) {

        Stock stock = stockRepository.findByCompanyName(company);
        return stock.getStockPrice();
    }
}
