package com.Asset.bgrillservice.Repository;

import com.Asset.bgrillservice.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepos extends JpaRepository<Item, Integer> {

    @Query("""
            SELECT new com.Asset.bgrillservice.Entity.Item(it.id, it.name, it.description, it.stock, it.price)
            FROM Item as it
            WHERE it.name LIKE %:name%
            """)
    public List<Item> getListItemByName(@Param("name") String name);

    @Query("""
            SELECT COUNT(*)
            FROM Item as it
            WHERE it.name LIKE %:name%
            """)
    public int getTotalDataFiltered(@Param("name") String name);

    @Query("""
            SELECT COUNT(*)
            FROM Item as it
            """)
    public int getTotalData();

    public int countByName(String name);

}
