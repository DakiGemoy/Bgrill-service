package com.Asset.bgrillservice.Repository;

import com.Asset.bgrillservice.Entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptRepos extends JpaRepository<Receipt, String> {
}
