package com.example.FileInAndFileOut.service;

import com.example.FileInAndFileOut.pojo.managerWl.MatchTable;

import java.util.List;

/**
 * @author lingwang
 * @date 2021/3/16 10:52
 */
public interface MatchService {
    List<MatchTable> findList();
}
