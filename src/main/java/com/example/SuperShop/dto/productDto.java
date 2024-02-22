package com.example.SuperShop.dto;

import lombok.Data;

@Data
public class productDto {

    private String proName;
    private String ProDescriptive;
    private Long proStock;
    private String proBarcode;
    private Long CostPrice;
    private Long SellingPrice;
    private boolean status;
}
