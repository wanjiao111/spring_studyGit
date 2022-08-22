package com.hotmaxx;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LocalDateTest {
    @Test
    public void  getLocalDate(){
        System.out.println(LocalDate.now());
    }
}
