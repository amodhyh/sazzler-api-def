 package org.example;
public record ProductDTO(
        String id,
        String name,
        String description,
        double price,
        int quantity) {

}