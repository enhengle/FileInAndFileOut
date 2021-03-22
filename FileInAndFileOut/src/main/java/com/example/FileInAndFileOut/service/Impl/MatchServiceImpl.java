package com.example.FileInAndFileOut.service.Impl;

import com.example.FileInAndFileOut.mapper.managerWl.MatchMapper;
import com.example.FileInAndFileOut.pojo.managerWl.MatchTable;
import com.example.FileInAndFileOut.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lingwang
 * @date 2021/3/16 10:52
 */
@Service
public class MatchServiceImpl implements MatchService {

    @Autowired
    private MatchMapper mapper;

    @Override
//    @DS("db1")
    public List<MatchTable> findList() {
        return mapper.findList(1);
    }
}
