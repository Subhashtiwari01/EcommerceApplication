package com.project.EcommerceApi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productId;
    private String name;
    private Integer price;
    private String description;
    private String category;
}



