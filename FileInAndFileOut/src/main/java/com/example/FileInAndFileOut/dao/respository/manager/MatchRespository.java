package com.example.FileInAndFileOut.dao.respository.manager;

import com.example.FileInAndFileOut.dao.pojo.manager.MatchTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author lingwang
 * @date 2021/3/16 17:35
 */
public interface MatchRespository extends JpaRepository<MatchTable,String> {
    @Query(value = "select * from match_table where is_deleted=1",nativeQuery = true)
    List<MatchTable> findAll();
}
