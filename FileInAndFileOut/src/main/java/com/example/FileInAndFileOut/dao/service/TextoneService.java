package com.example.FileInAndFileOut.dao.service;

import com.example.FileInAndFileOut.dao.pojo.dbtext.textone;
import com.example.FileInAndFileOut.dao.respository.dbtext.TextoneRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lingwang
 * @date 2021/3/17 10:00
 */
@Service
public class TextoneService {

    @Autowired
    private TextoneRespository respository;

    public List<textone> findtextone(){
        return respository.findtextone();
    }

}
