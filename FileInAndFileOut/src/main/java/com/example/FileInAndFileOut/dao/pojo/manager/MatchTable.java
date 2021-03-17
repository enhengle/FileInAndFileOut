package com.example.FileInAndFileOut.dao.pojo.manager;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author lingwang
 * @date 2021/3/16 17:30
 */
@Entity
@Table(name = "match_table",schema = "my_manager_wl")
public class MatchTable {
    @Id
    @Column(name = "match_id")
    @GeneratedValue
    private int matchId;
    @Column(name = "match_parent_id")
    private int matchParentId;
    @Column(name = "match_name")
    private String matchName;
    @Column(name = "match_content")
    private String matchContent;
    @Column(name = "match_type")
    private int matchType;
    @Column(name = "match_user_id")
    private int matchUserId;
    @Column(name = "match_user_name")
    private String matchUserName;
    @Column(name = "is_deleted")
    private int isDeleted=1;
    @Column(name = "remarks")
    private String remarks;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "UTF-8")
    @Column(name = "created_time")
    private Timestamp createdTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "UTF-8")
    @Column(name = "updated_time")
    private Timestamp updatedTime;

    public MatchTable() {
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public int getMatchParentId() {
        return matchParentId;
    }

    public void setMatchParentId(int matchParentId) {
        this.matchParentId = matchParentId;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public String getMatchContent() {
        return matchContent;
    }

    public void setMatchContent(String matchContent) {
        this.matchContent = matchContent;
    }

    public int getMatchType() {
        return matchType;
    }

    public void setMatchType(int matchType) {
        this.matchType = matchType;
    }

    public int getMatchUserId() {
        return matchUserId;
    }

    public void setMatchUserId(int matchUserId) {
        this.matchUserId = matchUserId;
    }

    public String getMatchUserName() {
        return matchUserName;
    }

    public void setMatchUserName(String matchUserName) {
        this.matchUserName = matchUserName;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public Timestamp getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Timestamp updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return "MatchTable{" +
                "matchId=" + matchId +
                ", matchParentId=" + matchParentId +
                ", matchName='" + matchName + '\'' +
                ", matchContent='" + matchContent + '\'' +
                ", matchType=" + matchType +
                ", matchUserId=" + matchUserId +
                ", matchUserName='" + matchUserName + '\'' +
                ", isDeleted=" + isDeleted +
                ", remarks='" + remarks + '\'' +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                '}';
    }
}
