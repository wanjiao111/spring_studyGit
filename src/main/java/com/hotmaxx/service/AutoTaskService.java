package com.hotmaxx.service;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class AutoTaskService {
    public void getWeekDate(LocalDate startDate,LocalDate endDate,Integer i){
        System.out.println("总相差的天数:" + startDate.until(endDate, ChronoUnit.DAYS));

    }
}
