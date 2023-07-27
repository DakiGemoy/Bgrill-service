package com.Asset.bgrillservice.Model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class ReceiptQueryParam {

    private String orderCode;
    private Boolean isFinish;

}
