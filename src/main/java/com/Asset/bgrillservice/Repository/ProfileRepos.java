package com.Asset.bgrillservice.Repository;

import com.Asset.bgrillservice.Entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepos extends JpaRepository<Profile, Integer> {
}
