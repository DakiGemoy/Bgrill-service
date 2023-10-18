package com.Asset.bgrillservice.Model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class UpsertItem {

    private int id;
    private String name;
    private String description;
    private Long stock;
    private Long price;

}
