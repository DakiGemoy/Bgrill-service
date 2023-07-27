package com.Asset.bgrillservice.Service;

import com.Asset.bgrillservice.Entity.Receipt;
import com.Asset.bgrillservice.Repository.ReceiptDetailRepos;
import com.Asset.bgrillservice.Repository.ReceiptRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiptService {

    @Autowired
    private ReceiptRepos receiptRepos;

    @Autowired
    private ReceiptDetailRepos detailRepos;

}
