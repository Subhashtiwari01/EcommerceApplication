package com.project.EcommerceApi.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer AddressId;

    private String name;
    private String phoneNumber;
    private String zipCode;

    @OneToOne
    User user;

}
