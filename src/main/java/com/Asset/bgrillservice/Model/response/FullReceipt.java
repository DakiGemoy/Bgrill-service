package com.Asset.bgrillservice.Model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class FullReceipt {

    private String receiptCode;
    private String cashierName;
    private String receiptDate;
    private List<ReceiptDetailModel> listItem;
    private Boolean isFinish;

}
