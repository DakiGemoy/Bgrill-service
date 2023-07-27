package com.Asset.bgrillservice.Repository;

import com.Asset.bgrillservice.Entity.ReceiptDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptDetailRepos extends JpaRepository<ReceiptDetail, Integer> {
}
