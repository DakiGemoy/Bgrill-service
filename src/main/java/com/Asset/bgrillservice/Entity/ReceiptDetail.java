package com.Asset.bgrillservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "OrderDetail")
@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
public class ReceiptDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String order_code;
    private int item_code;
    private Long qty;

    public ReceiptDetail(String OrderCode, int Item_Code, Long Qty){
        this.order_code = OrderCode;
        this.item_code = Item_Code;
        this.qty = Qty;
    }

}
