package com.geekster.restaurantmanagementservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @NotNull
    private  String productTitle;

    private  String description;

    @NotNull
    private  String price;

    @NotNull
    private LocalDate purchaseDate;

    @ManyToOne
    @JoinColumn(name = "fk_user_userId")
    private User user;



}
