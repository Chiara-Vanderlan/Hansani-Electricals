package com.HansaniElectricals.product_service.service;

import com.HansaniElectricals.product_service.model.Product;
import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
}