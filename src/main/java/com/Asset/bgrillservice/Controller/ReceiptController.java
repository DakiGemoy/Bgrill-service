package com.Asset.bgrillservice.Controller;

import com.Asset.bgrillservice.Entity.Receipt;
import com.Asset.bgrillservice.Model.request.ReceiptAddItem;
import com.Asset.bgrillservice.Model.request.ReceiptQueryParam;
import com.Asset.bgrillservice.Model.response.FullReceipt;
import com.Asset.bgrillservice.Service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("receipt")
public class ReceiptController {

    @Autowired
    private ReceiptService receiptService;

    @GetMapping("/new-receipt")
    public Receipt newReceipt(@RequestParam Integer cashierID){
        return receiptService.saveNewReceipt(cashierID);
    }

    @PostMapping("/receipt-add-item")
    public FullReceipt postNewItem(@RequestBody ReceiptAddItem addItem){
        receiptService.saveItemToReceipt(addItem);
        return receiptService.getDetailReceipt(addItem.getOrder_code());
    }

    @GetMapping("/detail-receipt/{receiptCode}")
    public FullReceipt getReceipt(@PathVariable String receiptCode){
        return receiptService.getDetailReceipt(receiptCode);
    }

    @PostMapping("/listReceipt")
    public List<Receipt> getListReceipt(@RequestBody ReceiptQueryParam receiptParam){
        return receiptService.getReceiptSearch(receiptParam);
    }

    @GetMapping("/finishReceipt/{orderCode}")
    public FullReceipt finishReceipt(@PathVariable String orderCode){
        receiptService.finishReceipt(orderCode);
        return receiptService.getDetailReceipt(orderCode);
    }


}
