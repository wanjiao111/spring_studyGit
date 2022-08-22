package com.wan.LocalDateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TestLocalDateTime {
    public static void main(String[] args) {
//        LocalDate of = LocalDate.of(2022, 02, 31);
//        System.out.println(of.plusMonths(1));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy___MM--dd");
        LocalDate now = LocalDate.now();
        System.out.println(now.format(dateTimeFormatter));
        LocalDate parse = LocalDate.parse("2011___11--11", dateTimeFormatter);
        System.out.println(parse);
        LocalDate today = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMdd");
        String format = today.format(fmt);
        System.out.println(format);


//        LocalDateTime today = LocalDateTime.now();
//        System.out.println(today);
//        System.out.println(today.withDayOfMonth(1));
//
//        String date = "2021-01-01";
//        LocalDate parse = LocalDate.parse(date);
//        System.out.println(parse.toString());
//        System.out.println(date);
//
//        String date1 = "2022/2/2";
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/M/d");
//        LocalDate parse1 = LocalDate.parse(date1, dateTimeFormatter);
//        System.out.println(parse1);
//
//        LocalDateTime start = LocalDateTime.now();
//        long time = start.toEpochSecond(ZoneOffset.of("+8"));
//        System.out.println(time);
//
//        LocalTime now = LocalTime.now();
//        System.out.println(now);
//        LocalDateTime end= LocalDateTime.parse("2022-07-05 19:00:00");
//        end.toEpochSecond(ZoneOffset.of("+8"));

//        timeLap("23:30:00");
//        System.out.println(DateTools.dateToWeek("2017-01-01"));

    }




    public static void timeLap(String time) {

        LocalTime now = LocalTime.now();
        LocalTime endTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm:ss"));
        Duration between = Duration.between(now, endTime);
        long seconds = between.getSeconds();
//        long along = seconds >= 0 ? seconds : Long.valueOf("已截止");
        // 判断是否超过当前时间
        if (seconds < 0) {
            System.out.println("已截止");
            return;
        }


        long h = seconds / 60 / 60;
        long m = (seconds - h * 60 * 60) / 60;
        long s = seconds - h * 60 * 60 - m * 60;
        System.out.println("距截止还剩:" + "\t" + h + "时" + m + "分" + s + "秒");

        long h1 = seconds / 3600;
        long h2 = seconds % 3600;

        System.out.println(h1);
        System.out.println(h2);
        long m1 = h2 / 60;
        long s1 = h2 % 60;
        System.out.println(m1);
        System.out.println(s1);

        A ev = ev(seconds, 3600);
        A ev1 = ev(ev.getY(), 60);
        System.out.println(ev.getS());
        System.out.println(ev1.getS());
        System.out.println(ev1.getY());

    }

    public static A ev(long value, long c)
    {
        A a = new A();
        a.setS(value/ c);
        a.setY(value%c);
        return a;
    }

    /**
     *
     */
    public static class A{
        private long s;

        private long y;

        public long getS() {
            return s;
        }

        public void setS(long s) {
            this.s = s;
        }

        public long getY() {
            return y;
        }

        public void setY(long y) {
            this.y = y;
        }
    }
}
