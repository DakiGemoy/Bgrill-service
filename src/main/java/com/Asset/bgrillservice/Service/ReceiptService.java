package com.Asset.bgrillservice.Service;

import com.Asset.bgrillservice.Entity.Receipt;
import com.Asset.bgrillservice.Entity.ReceiptDetail;
import com.Asset.bgrillservice.Model.request.ReceiptAddItem;
import com.Asset.bgrillservice.Model.request.ReceiptQueryParam;
import com.Asset.bgrillservice.Model.response.FullReceipt;
import com.Asset.bgrillservice.Model.response.ReceiptDetailModel;
import com.Asset.bgrillservice.Repository.ReceiptDetailRepos;
import com.Asset.bgrillservice.Repository.ReceiptRepos;
import com.Asset.bgrillservice.Utility.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReceiptService {

    @Autowired
    private ReceiptRepos receiptRepos;

    @Autowired
    private ReceiptDetailRepos detailRepos;

    @Autowired
    private ItemService itemService;

    @Autowired
    private ProfileService profileService;

    public Receipt saveNewReceipt(Integer cashierId){
        LocalDateTime tgl = LocalDateTime.now();
        String code = String.valueOf(tgl.getYear())+
                String.valueOf(tgl.getMonthValue())+
                String.valueOf(tgl.getDayOfMonth());
        code = code+String.valueOf(receiptRepos.totalReceiptToday(code)+1);

        Receipt baru = new Receipt(code, cashierId, tgl, false);

        receiptRepos.save(baru);

        return baru;
    }

    public void saveItemToReceipt(ReceiptAddItem item){
        ReceiptDetail baru = new ReceiptDetail(item.getOrder_code(), item.getId_item(), item.getQty());
        detailRepos.save(baru);
    }

    public FullReceipt getDetailReceipt(String receiptCode){
        var receipt = receiptRepos.findById(receiptCode).get();

        var listItem = detailRepos.getListByOrderCode(receiptCode);
        List<ReceiptDetailModel> items = new ArrayList<>();

        for(var a : listItem){
            var receipDetail = new ReceiptDetailModel(a.getId(), a.getOrder_code(),
                    itemService.getUpdate(a.getId()).getName(), a.getQty());
            items.add(receipDetail);
        }

        var cashier = profileService.getProfile(receipt.getCashier());

        var cashierName = cashier.getFirst_name()+" "+cashier.getLast_name();

        return new FullReceipt(receiptCode, cashierName, Helper.convertDateTime(receipt.getOrder_date()),
                items, receipt.getIs_finish());
    }

    public List<Receipt> getReceiptSearch(ReceiptQueryParam receiptParam){
        return receiptRepos.getListReceipt(receiptParam.getOrderCode(), receiptParam.getIsFinish());
    }

    public void finishReceipt(String orderCode){
        var receipt = receiptRepos.findById(orderCode).get();
        receipt.setIs_finish(true);
        receiptRepos.save(receipt);
    }

}
