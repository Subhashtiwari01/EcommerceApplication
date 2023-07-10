package com.project.EcommerceApi.Repository;

import com.project.EcommerceApi.Model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepo extends CrudRepository<Product,Long> {
}
