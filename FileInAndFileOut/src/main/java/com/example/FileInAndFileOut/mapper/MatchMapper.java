package com.example.FileInAndFileOut.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.FileInAndFileOut.pojo.MatchTable;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lingwang
 * @date 2021/3/16 10:50
 */
@Repository
public interface MatchMapper{

    @Select("select * from match_table where is_deleted=#{isDeleted}")
    List<MatchTable> findList(@Param("isDeleted")int isDeleted);

}
