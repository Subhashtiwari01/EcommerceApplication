package com.project.EcommerceApi.Repository;

import com.project.EcommerceApi.Model.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepo extends CrudRepository<Address,Long> {
}
