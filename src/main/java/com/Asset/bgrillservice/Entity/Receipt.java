package com.Asset.bgrillservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "HistoryOrder")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Receipt {

    @Id
    private String orderCode;
    private int cashier;
    private LocalDateTime order_date;
    private Boolean is_finish;

}
