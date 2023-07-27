package com.Asset.bgrillservice.Repository;

import com.Asset.bgrillservice.Entity.ReceiptDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReceiptDetailRepos extends JpaRepository<ReceiptDetail, Integer> {

    @Query("""
            SELECT new com.Asset.bgrillservice.Entity.ReceiptDetail(
                det.id, det.order_code, det.item_code, det.qty
            )
            FROM ReceiptDetail as det
            WHERE det.order_code = :code
            """)
    public List<ReceiptDetail> getListByOrderCode(@Param("code") String ordercode);

}
