package com.boder.diary_dto;

public class DiaryDto {
    private int diary_pk;
    private String diary_id;
    private String diary_num;
    private String diary_title;
    private String diary_content;
    private String diary_date;

    public int getDiary_pk() {
        return diary_pk;
    }

    public void setDiary_pk(int diary_pk) {
        this.diary_pk = diary_pk;
    }

    public String getDiary_id() {
        return diary_id;
    }

    public void setDiary_id(String diary_id) {
        this.diary_id = diary_id;
    }

    public String getDiary_num() {
        return diary_num;
    }

    public void setDiary_num(String diary_num) {
        this.diary_num = diary_num;
    }

    public String getDiary_title() {
        return diary_title;
    }

    public void setDiary_title(String diary_title) {
        this.diary_title = diary_title;
    }

    public String getDiary_content() {
        return diary_content;
    }

    public void setDiary_content(String diary_content) {
        this.diary_content = diary_content;
    }

    public String getDiary_date() {
        return diary_date;
    }

    public void setDiary_date(String diary_date) {
        this.diary_date = diary_date;
    }
}
