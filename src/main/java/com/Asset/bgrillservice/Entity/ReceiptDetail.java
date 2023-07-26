package com.Asset.bgrillservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OrderDetail")
@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
public class ReceiptDetail {

    @Id
    private int id;
    private String order_code;
    private int item_code;
    private Long qty;

}
