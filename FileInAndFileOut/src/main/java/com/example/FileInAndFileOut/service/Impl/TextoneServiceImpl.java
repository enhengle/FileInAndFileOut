package com.example.FileInAndFileOut.service.Impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.FileInAndFileOut.mapper.dbtext.TextoneMapper;
import com.example.FileInAndFileOut.pojo.textone.Textone;
import com.example.FileInAndFileOut.service.TextoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lingwang
 * @date 2021/3/18 14:16
 */
@Service
public class TextoneServiceImpl implements TextoneService {

    @Autowired
    private TextoneMapper mapper;

    @Override
    @DS("db2")
    public List<Textone> findAl() {
        return mapper.findAl();
    }
}
