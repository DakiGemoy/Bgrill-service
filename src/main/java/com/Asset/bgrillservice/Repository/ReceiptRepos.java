package com.Asset.bgrillservice.Repository;

import com.Asset.bgrillservice.Entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReceiptRepos extends JpaRepository<Receipt, String> {

    @Query("""
            SELECT COUNT(*)
            FROM Receipt as re
            WHERE re.orderCode LIKE %:tgl%
            """)
    public int totalReceiptToday(@Param("tgl") String tgl);

    @Query("""
            SELECT new com.Asset.bgrillservice.Entity.Receipt(re.orderCode, re.cashier, re.order_date, re.is_finish)
            FROM Receipt as re
            WHERE re.orderCode LIKE %:code% AND re.is_finish = :status
            """)
    public List<Receipt> getListReceipt(@Param("code") String orderCode,
                                        @Param("status") Boolean status);

}
