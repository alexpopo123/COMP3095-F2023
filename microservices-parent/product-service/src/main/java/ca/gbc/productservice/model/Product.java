package ca.gbc.productservice.model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public class Product {
    @Id
    private String Id;
    private String name;
    private String description;
    private BigDecimal price;
}
