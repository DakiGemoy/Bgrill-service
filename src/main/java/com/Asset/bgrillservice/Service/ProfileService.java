package com.Asset.bgrillservice.Service;

import com.Asset.bgrillservice.Entity.Profile;
import com.Asset.bgrillservice.Repository.ProfileRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepos profileRepos;

}
