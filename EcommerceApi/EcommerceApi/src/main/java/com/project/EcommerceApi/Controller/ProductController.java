package com.project.EcommerceApi.Controller;

import com.project.EcommerceApi.Model.Address;
import com.project.EcommerceApi.Model.Product;
import com.project.EcommerceApi.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("product")

    public Iterable<Product> getProduct(){
        return productService.getProduct();

    }
    @GetMapping("product/{productId}")

    public Optional<Product> getProductByProductId(@PathVariable Long productId){
        return productService.getProductByProductId(productId);

    }
    @PostMapping("createProduct")

    public String createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
    @DeleteMapping("product/{productId}")
    public String deleteProductById(@PathVariable Long productId){
        return productService.deleteProductById(productId);
    }


}
