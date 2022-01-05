package com.ebig;

import org.junit.Test;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTest {
    //获得时分秒
    @Test
    public void printAlltime(){
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("获得时分秒");
        System.out.println(dt.getYear());
        System.out.println(dt.getMonth());
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getHour());
        System.out.println(dt.getMinute());
        System.out.println(dt.getSecond());
    }

    //获得毫秒数
    @Test
    public void printMills(){
        Calendar.getInstance().getTimeInMillis();
        System.currentTimeMillis();
        Clock.systemDefaultZone().millis();	// Java 8
    }

    //如何取得某月的最后一天？
    @Test
    public void printLastDay(){
        Calendar time = Calendar.getInstance();
        time.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    //如何格式化日期？
    @Test
    public void formatDate(){
        // Java 8 线程安全
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate ld = LocalDate.now();
        System.out.println(dtf.format(ld));
    }

    //打印昨天的当前时刻。
    @Test
    public void YesterdayCurrent (){
        // Java 8 线程安全
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ydt = ldt.minusDays(1);
        System.out.println(ydt);
    }


}
