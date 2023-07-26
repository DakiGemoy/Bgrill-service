package com.Asset.bgrillservice.Service;

import com.Asset.bgrillservice.Entity.Receipt;
import com.Asset.bgrillservice.Repository.ReceiptRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiptService {

    @Autowired
    private ReceiptRepos receiptRepos;

    public Receipt getData(String receiptCode){
        return receiptRepos.findById(receiptCode).get();
    }

}
