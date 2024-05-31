package com.amur.community.model.service;

import com.amur.community.model.CommunityDto;
import com.amur.community.model.mapper.CommunityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class CommunityServiceImpl implements CommunityService {

    @Autowired
    CommunityMapper dao;


    @Override
    public void writeArticle(CommunityDto communityDto) throws Exception{
        dao.writeArticle(communityDto);
    }
}
