package com.example.FileInAndFileOut.dao.respository.dbtext;

import com.example.FileInAndFileOut.dao.pojo.dbtext.textone;
import com.example.FileInAndFileOut.dao.pojo.manager.MatchTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author lingwang
 * @date 2021/3/17 9:58
 */
public interface TextoneRespository extends JpaRepository<textone,String> {
    @Query(value = "select * from textone",nativeQuery = true)
    List<textone> findtextone();
}
