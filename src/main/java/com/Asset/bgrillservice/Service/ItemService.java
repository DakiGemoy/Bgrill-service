package com.Asset.bgrillservice.Service;

import com.Asset.bgrillservice.Entity.Item;
import com.Asset.bgrillservice.Handler.BaseExceptionHandler;
import com.Asset.bgrillservice.Model.request.UpsertItem;
import com.Asset.bgrillservice.Model.response.PagingResponse;
import com.Asset.bgrillservice.Repository.ItemRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepos itemRepos;

    public PagingResponse<Item> getList(String name) throws BaseExceptionHandler {

        PagingResponse<Item> back = new PagingResponse<>();
        back.setData(itemRepos.getListItemByName(name));
        back.setFilteringData(itemRepos.getTotalDataFiltered(name));
        back.setTotalData(itemRepos.getTotalData());
        return back;
    }

    public Boolean postUpsert(UpsertItem item) throws  BaseExceptionHandler {
        try {
            if(item.getId() == 0){
                itemRepos.save(new Item(item.getName(), item.getDescription(), item.getStock(), item.getPrice()));
            }
            else {
                itemRepos.save(new Item(item.getId(), item.getName(), item.getDescription(), item.getStock(), item.getPrice()));
            }
            return true;
        } catch (Exception ex){
            return false;
        }
    }

    public Item getUpdate(Integer id) throws BaseExceptionHandler {
        return itemRepos.findById(id).get();
    }

    public int countItemByName(String itemName) throws BaseExceptionHandler {
        return itemRepos.countByName(itemName);
    }

}
