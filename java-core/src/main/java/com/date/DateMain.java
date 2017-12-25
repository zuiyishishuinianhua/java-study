package com.date;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * @author chenyao
 * @date 2017/10/16 11:22
 */
public class DateMain {





    @Test
    public void test1() {
        //LocalDate、 LocalTime、 Instant、 Duration 以及 Period
        //LocalDate 和 LocalTime
        LocalDate date = LocalDate.of(2014, 3, 23);
        int year = date.getYear();
        Month month = date.getMonth();
        int day = date.getDayOfMonth();
        DayOfWeek dow = date.getDayOfWeek();
        int len = date.lengthOfMonth();
        boolean leap = date.isLeapYear();

        /*int year = date.get(ChronoField.YEAR);
        int month = date.get(ChronoField.MONTH_OF_YEAR);
        int day = date.get(ChronoField.DAY_OF_MONTH);

        System.out.println(year + "," + month + "," + day);*/



    }
    @Test
    public void test2() {
        LocalTime now = LocalTime.now();
        System.out.println(now.get(ChronoField.SECOND_OF_MINUTE));
    }

    @Test
    public void test3() {
        Instant.ofEpochSecond(3);
        Instant.ofEpochSecond(3, 0);
        Instant.ofEpochSecond(2, 1_000_000_000);    //2秒之后再加上100万纳秒（1秒）
        Instant.ofEpochSecond(4, -1_000_000_000);   //2秒之后再减去100万纳秒（1秒）
    }

    @Test
    public void test4() {
        LocalDateTime dateTime = LocalDateTime.now();
        String s1 = dateTime.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日HHmmss", Locale.CHINESE));
        System.out.println(s1);
    }

    @Test
    public void test5() {
        DateTimeFormatter chineseFormatter = new DateTimeFormatterBuilder()
                .appendText(ChronoField.YEAR)
                .appendLiteral("年")
                .appendValue(ChronoField.MONTH_OF_YEAR)
                .appendLiteral("月")
                .appendText(ChronoField.DAY_OF_MONTH)
                .appendLiteral("日")
                .parseCaseInsensitive()
                .toFormatter();

        LocalDate date1 = LocalDate.of(2014, 3, 18);
        String formattedDate = date1.format(chineseFormatter);
        System.out.println(formattedDate);
    }

    @Test
    public void test6() {
        List<Object> list = new ArrayList<>();
        list.add(1);

    }





}
