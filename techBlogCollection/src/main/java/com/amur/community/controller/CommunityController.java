package com.amur.community.controller;

import com.amur.community.model.CommunityDto;
import com.amur.community.model.service.CommunityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin("*")
@RequestMapping("/community")
public class CommunityController {
    @Autowired
    private CommunityService communityService;

    @PostMapping
    public ResponseEntity<?> writeArticle(@RequestBody CommunityDto communityDto){
        try {
            communityService.writeArticle(communityDto);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }
        catch (Exception e){
            return exceptionHandling(e);
        }
    }


    private ResponseEntity<String> exceptionHandling(Exception e) {
        e.printStackTrace();
        return new ResponseEntity<String>("Error : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
