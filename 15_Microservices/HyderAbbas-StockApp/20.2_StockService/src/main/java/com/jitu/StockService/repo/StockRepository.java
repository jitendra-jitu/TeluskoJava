package com.jitu.StockService.repo;

import com.jitu.StockService.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

    // Define custom query methods if needed
    // For example, to find stock by company name:
    Stock findByCompanyName(String companyName);
}
