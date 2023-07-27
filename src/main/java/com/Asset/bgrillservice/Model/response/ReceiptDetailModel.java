package com.Asset.bgrillservice.Model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class ReceiptDetailModel {

    private int id;
    private String orderCode;
    private String productName;
    private Long qty;

}
