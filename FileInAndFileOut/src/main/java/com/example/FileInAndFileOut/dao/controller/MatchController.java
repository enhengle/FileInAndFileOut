package com.example.FileInAndFileOut.dao.controller;

import com.example.FileInAndFileOut.dao.pojo.manager.MatchTable;
import com.example.FileInAndFileOut.dao.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lingwang
 * @date 2021/3/16 17:37
 */
@RestController
public class MatchController {

    @Autowired
    private MatchService service;

    @RequestMapping(path = "findAll",method = RequestMethod.POST)
    public List<MatchTable> findAll(){
        return service.findAll();
    }

}
