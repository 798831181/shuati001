package com.sunqc.javacore.date;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 打印日历
 */
public class TestCalendar {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int monthValue = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        date = date.minusDays(dayOfMonth-1);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int value = dayOfWeek.getValue();
//        date = date.minusMonths(dayOfMonth-1);
        System.out.println("Mon Teu Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == monthValue){
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == dayOfMonth){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1){
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1){
            System.out.println();
        }
    }
}
