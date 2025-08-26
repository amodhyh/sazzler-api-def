package com.sazzler.ecommerce.sazzler_api_def.Product;

public class ProductDTO {
   private final int productId;
 private final String name;
 private final int weight;
 private final String serviceAddress;

 public ProductDTO(int productId, String name, int weight, String serviceAddress) {
    this.productId = productId;
    this.name = name;
    this.weight = weight;
    this.serviceAddress = serviceAddress;
 }

 public String getName() {
     return name;
 }
 public int getProductId() {
     return productId;
 }
 public String getServiceAddress() {
     return serviceAddress;
 }
 public int getWeight() {
     return weight;
 }
}
