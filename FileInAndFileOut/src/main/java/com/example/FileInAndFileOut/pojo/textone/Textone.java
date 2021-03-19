package com.example.FileInAndFileOut.pojo.textone;

/**
 * @author lingwang
 * @date 2021/3/18 14:14
 */
public class Textone {
    private String testName;
    private String textWord;

    public Textone() {
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTextWord() {
        return textWord;
    }

    public void setTextWord(String textWord) {
        this.textWord = textWord;
    }

    @Override
    public String toString() {
        return "Textone{" +
                "testName='" + testName + '\'' +
                ", textWord='" + textWord + '\'' +
                '}';
    }
}
