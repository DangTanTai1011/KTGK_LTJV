package com.example.NhanVien.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String name1;
    private double price;
    private String description;

//    private String imageUrl;
    private String thumnail;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}

