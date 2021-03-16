package com.example.FileInAndFileOut.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.FileInAndFileOut.pojo.MatchTable;

import java.util.List;

/**
 * @author lingwang
 * @date 2021/3/16 10:52
 */
public interface MatchService {
    IPage<MatchTable> findList();
}
