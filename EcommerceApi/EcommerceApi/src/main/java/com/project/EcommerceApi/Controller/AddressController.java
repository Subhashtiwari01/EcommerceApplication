package com.project.EcommerceApi.Controller;

import com.project.EcommerceApi.Model.Address;
import com.project.EcommerceApi.Model.User;
import com.project.EcommerceApi.Repository.IAddressRepo;
import com.project.EcommerceApi.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("address")

    public Iterable<Address> getAddress(){
        return addressService.getAddress();

    }

    @PostMapping("createAddress")

    public String createAddress(@RequestBody Address address){
        return addressService.createAddress(address);
    }
}
