package com.amur.community.model.service;

import com.amur.community.model.CommunityDto;
import org.springframework.stereotype.Service;


public interface CommunityService {
    void writeArticle(CommunityDto communityDto) throws Exception;
}
