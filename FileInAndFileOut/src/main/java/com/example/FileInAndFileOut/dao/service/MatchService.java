package com.example.FileInAndFileOut.dao.service;

import com.example.FileInAndFileOut.dao.pojo.manager.MatchTable;
import com.example.FileInAndFileOut.dao.respository.manager.MatchRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lingwang
 * @date 2021/3/16 17:36
 */
@Service
public class MatchService {

    @Autowired
    private MatchRespository respository;

    public List<MatchTable> findAll(){
        return respository.findAll();
    }
}
