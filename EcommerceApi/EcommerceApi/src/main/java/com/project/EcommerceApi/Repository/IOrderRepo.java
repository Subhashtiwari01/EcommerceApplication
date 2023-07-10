package com.project.EcommerceApi.Repository;

import com.project.EcommerceApi.Model.Order;
import org.springframework.data.repository.CrudRepository;

public interface IOrderRepo extends CrudRepository<Order,Long> {
}
