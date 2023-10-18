package com.Asset.bgrillservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Item")
@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private Long stock;
    private Long price;

    public Item(String Name,String Desc, Long Stock, Long Price){
        this.name = Name;
        this.description = Desc;
        this.stock = Stock;
        this.price = Price;
    }

}
