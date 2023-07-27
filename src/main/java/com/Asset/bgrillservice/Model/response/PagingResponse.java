package com.Asset.bgrillservice.Model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
public class PagingResponse<T> {
    private List<T> data;
    private int filteringData;
    private int totalData;
}
