package com.Asset.bgrillservice.Model.request;

import lombok.*;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class ReceiptAddItem {

   private String order_code;
   private int id_item;
   private Long qty;

}
