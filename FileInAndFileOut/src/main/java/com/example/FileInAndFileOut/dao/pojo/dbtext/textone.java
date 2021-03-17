package com.example.FileInAndFileOut.dao.pojo.dbtext;

import javax.persistence.*;

/**
 * @author lingwang
 * @date 2021/3/17 9:56
 */
@Entity
@Table(name = "textone",schema = "dbtext")
public class textone {
    @Id
    @GeneratedValue
    @Column(name = "test_name")
    private String testName;
    @Column(name = "test_word")
    private String testWord;

    public textone() {
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestWord() {
        return testWord;
    }

    public void setTestWord(String testWord) {
        this.testWord = testWord;
    }

    @Override
    public String toString() {
        return "textone{" +
                "testName='" + testName + '\'' +
                ", testWord='" + testWord + '\'' +
                '}';
    }
}
