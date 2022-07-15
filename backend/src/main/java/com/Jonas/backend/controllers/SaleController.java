package com.Jonas.backend.controllers;

import com.Jonas.backend.entities.Sale;
import com.Jonas.backend.services.SaleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "sales")
public class SaleController {
    
    @Autowired
    private SaleService service;
    
    @GetMapping
    public List<Sale> findSales(){
        return service.findSales();
    }
    
}
