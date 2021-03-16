package com.example.FileInAndFileOut.dao.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import java.sql.Timestamp;

/**
 * @author lingwang
 * @date 2021/3/16 17:30
 */
@Entity
public class MatchTable {
    @Id
    @GeneratedValue
    private int matchId;
    private int matchParentId;
    private String matchName;
    private String matchContent;
    private int matchType;
    private int matchUserId;
    private String matchUserName;
    private int isDeleted=1;
    private String remarks;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "UTF-8")
    private Timestamp createdTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "UTF-8")
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
