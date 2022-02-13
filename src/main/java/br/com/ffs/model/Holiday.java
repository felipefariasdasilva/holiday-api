package br.com.ffs.model;

import lombok.Data;

@Data
public class Holiday {

    private String day;
    private String month;
    private String year;
    private String dayOfWeek;
    private String date;
    private String name;
    private String comments;
    private String type;
    private String state;
    private String city;
}
