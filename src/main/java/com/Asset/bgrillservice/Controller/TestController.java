package com.Asset.bgrillservice.Controller;

import com.Asset.bgrillservice.Entity.Receipt;
import com.Asset.bgrillservice.Service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping
    public String test(){
        return "OK";
    }

}
