package com.project.EcommerceApi.Service;

import com.project.EcommerceApi.Model.Product;
import com.project.EcommerceApi.Repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;
    public Iterable<Product> getProduct() {
        return productRepo.findAll();
    }

    public String createProduct(Product product) {
        productRepo.save(product);
        return "product created";
    }

    public String deleteProductById(Long productId) {
        productRepo.deleteById(productId);
        return "Deleted";
    }

    public Optional<Product> getProductByProductId(Long productId) {
        return productRepo.findById(productId);
    }
}
