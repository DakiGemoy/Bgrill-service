package com.Asset.bgrillservice.Controller;

import com.Asset.bgrillservice.Service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("receipt")
public class ReceiptController {

    @Autowired
    private ReceiptService receiptService;



}
