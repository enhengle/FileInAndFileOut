package com.example.FileInAndFileOut.mapper.dbtext;

import com.example.FileInAndFileOut.pojo.textone.Textone;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lingwang
 * @date 2021/3/18 14:12
 */
@Repository
public interface TextoneMapper {

    @Select("select * from textone")
    List<Textone> findAl();
}
