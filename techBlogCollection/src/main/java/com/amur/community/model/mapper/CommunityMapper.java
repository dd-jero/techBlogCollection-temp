package com.amur.community.model.mapper;

import com.amur.community.model.CommunityDto;

import java.sql.SQLException;

public interface CommunityMapper {
    void writeArticle(CommunityDto communityDto)  throws SQLException;;
}
