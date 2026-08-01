package com.sazzler.ecommerce.sazzler_api_def.product_service.DTO;

public class ProductDTO {
   private final String productId;
 private final String name;
 private final int weight;
 private final String serviceAddress;

 public ProductDTO(String productId, String name, int weight, String serviceAddress) {
    this.productId = productId;
    this.name = name;
    this.weight = weight;
    this.serviceAddress = serviceAddress;
 }

 public String getName() {
     return name;
 }
 public String getProductId() {
     return productId;
 }
 public String getServiceAddress() {
     return serviceAddress;
 }
 public int getWeight() {
     return weight;
 }
}
