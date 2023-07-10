package com.project.EcommerceApi.Service;

import com.project.EcommerceApi.Model.Address;
import com.project.EcommerceApi.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
    public Iterable<Address> getAddress() {
        return addressRepo.findAll();
    }

    public String createAddress(Address address) {
        addressRepo.save(address);
        return "Address Created";
    }
}
