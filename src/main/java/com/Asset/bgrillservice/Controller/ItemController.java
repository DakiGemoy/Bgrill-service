package com.Asset.bgrillservice.Controller;

import com.Asset.bgrillservice.Entity.Item;
import com.Asset.bgrillservice.Handler.BaseExceptionHandler;
import com.Asset.bgrillservice.Model.request.UpsertItem;
import com.Asset.bgrillservice.Model.response.PagingResponse;
import com.Asset.bgrillservice.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/getPaging")
    public PagingResponse<Item> getListItem(@RequestParam(defaultValue = "") String itemName) throws BaseExceptionHandler {
        return itemService.getList(itemName);
    }

    @PostMapping("/upsert")
    public Boolean upsertItem(@RequestBody UpsertItem item) throws BaseExceptionHandler {
        return itemService.postUpsert(item);
    }

    @GetMapping("/{id}")
    public Item getUpdate(@PathVariable Integer id) throws BaseExceptionHandler {
        return itemService.getUpdate(id);
    }

    @GetMapping("/cek-item-name")
    public Boolean validationCekItemName(@RequestParam String itemName) throws BaseExceptionHandler{
        if(itemService.countItemByName(itemName)>0){
            return false;
        } else {
            return true;
        }
    }

}
