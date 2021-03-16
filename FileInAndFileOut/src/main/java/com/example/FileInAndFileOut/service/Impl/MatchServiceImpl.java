package com.example.FileInAndFileOut.service.Impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.FileInAndFileOut.mapper.MatchMapper;
import com.example.FileInAndFileOut.pojo.MatchTable;
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
    public List<MatchTable> findList() {
        return mapper.findList(1);
    }
}
