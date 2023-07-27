package com.Asset.bgrillservice.Controller;

import com.Asset.bgrillservice.Entity.Item;
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

    @GetMapping
    public PagingResponse<Item> getListItem(@RequestParam(defaultValue = "") String itemName){
        return itemService.getList(itemName);
    }

    @PostMapping("/upsert")
    public Boolean upsertItem(@RequestBody UpsertItem item){
        return itemService.postUpsert(item);
    }

    @GetMapping("/{id}")
    public Item getUpdate(@PathVariable Integer id){
        return itemService.getUpdate(id);
    }

    @GetMapping("/cek-item-name")
    public Boolean validationCekItemName(@RequestParam String itemName){
        if(itemService.countItemByName(itemName)>0){
            return false;
        } else {
            return true;
        }
    }

}
