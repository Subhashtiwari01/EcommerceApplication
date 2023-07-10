package com.project.EcommerceApi.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
@Entity

public class Order {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long orderId;

    private Integer productQuantity;

    @OneToOne
    @JoinColumn(name="fk_userId")
    User user;

    @OneToOne
    @JoinColumn(name="fk_productId")
    Product product;


    @OneToOne
    @JoinColumn(name="fk_addressId")
    Address address;





}
