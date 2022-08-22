package com.wan.LocalDateTime;

import cn.hutool.core.date.DateTime;

import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {

    public static void main(String[] args) throws InterruptedException {



//        System.out.println(today);
//        System.out.println(today.getDayOfMonth());
//        System.out.println(today.getDayOfWeek().getValue());
//        System.out.println(today.atStartOfDay());
//        System.out.println(today.getDayOfYear());
//        System.out.println(today.withDayOfMonth(1));
//        Temporal temporal = today.adjustInto(LocalDate.of(2021, 1, 1));
//
//        System.out.println(temporal);
//        System.out.println(today.with(TemporalAdjuster.firstInMonth(DayOfWeek.MONDAY)));
//
//        System.out.println(LocalDateTime.now());
//
//        System.out.println(  LocalDateTime.of(20121,1,5,5,5));
////        System.out.println(LocalDateTime.ofEpochSecond(00,00,));
//        System.out.println("解析：");
//        System.out.println(LocalDateTime.parse("2022-12-12T00:00:00"));
//        LocalDateTime dateTime= LocalDateTime.now();
//        System.out.println(  dateTime.getDayOfYear());
//        System.out.println(  dateTime.getMinute());
//        System.out.println(  dateTime.getDayOfWeek());
//        System.out.println(  dateTime.getNano());
//        System.out.println(  dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//        System.out.println("格式化");
//
//        System.out.println(  LocalDateTime.parse("2012-12-12T00:00:00"));
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM--dd HH:mm:ss");
//        LocalDateTime.now(ZoneOffset.of("+8"));
//        System.out.println(LocalDateTime.now(ZoneOffset.of("+8")).format(formatter));
//
//        System.out.println(LocalDateTime.now());
//        String dateTimeStr = "19-11-01 11:11:11";
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
//        LocalDateTime dateTimee = LocalDateTime.parse(dateTimeStr, df);
//        System.out.println(dateTimee);
//
//        System.out.println( LocalDateTime.now().format(DateTimeFormatter.ofPattern("yy-mm-dd HH:mm:ss")));
//        OffsetDateTime offsetDateTime = LocalDateTime.now().atOffset(ZoneOffset.of("+8"));
//        System.out.println(offsetDateTime);
//        LocalDateTime date1 = LocalDateTime.now();
//        LocalDateTime date2 = LocalDateTime.of(2018, 1, 1, 11, 11, 11);
//        Duration between = Duration.between(date2, date1);
//        System.out.println(between.toDays()+"天"+ between.toHours()+"时"+between.toMinutes()+"分");
//        LocalDate date3 = LocalDate.now();
//        LocalDate date4 = LocalDate.of(2018, 11, 2);
//        Period between1 = Period.between(date3, date4);
//        System.out.println(between1.getDays());
//        System.out.println(between1.getYears());
//        int dayOfMonth = LocalDate.now().getDayOfMonth();
//        System.out.println(dayOfMonth);
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
//        String format = LocalDateTime.now().format(dateTimeFormatter);
//        System.out.println(format);
//        String timeStr="20-01--24 11:11:11";
//        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yy-MM--dd HH:mm:ss");
//        LocalDateTime parse = LocalDateTime.parse(timeStr, dateTimeFormatter1);
//        System.out.println(parse);
//        StringBuilder stringBuilder=new StringBuilder();
//        StringBuilder sb = stringBuilder.append("ajkl");
//        stringBuilder.append("hhhk");
//        System.out.println(sb);
//        String jjj = String.valueOf("jjj");
//        System.out.println(jjj);
//        sb.delete(1,4);
//        System.out.println(sb);
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//        LocalDateTime of = LocalDateTime.of(2022, 3, 15, 18, 00);
//        Duration between2 = Duration.between(now, of);
//        System.out.println(between2.getSeconds());
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入截至时间：");
//        String endTime = scanner.next();
//        System.out.println();
//        System.out.println(endTime);

        for (int i = 0; i < 10; i++) {
            System.out.println( timeLag("10:00"));
            Thread.sleep(1000);
        }

    }
    public  static  long timeLag(String time){
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(time);
//        LocalDateTime endTime = LocalDateTime.parse(time, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        Duration between = Duration.between(now,endTime);
//        long seconds = between.getSeconds();
//        System.out.println(seconds);
//        return  seconds;
        LocalTime now = LocalTime.now();
        LocalTime endTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
        Duration between = Duration.between(now, endTime);
        long seconds = between.getSeconds();
//       if(seconds>=0){
//        System.out.println(seconds);
//       }else{
//           System.out.println("已截至");
        Long along = seconds >= 0 ? seconds : Long.valueOf("已截止");
        return along;
    }
    }






