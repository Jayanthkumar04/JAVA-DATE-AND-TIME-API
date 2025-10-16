package com.jay.java8.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTime1 {

	
 public static void main(String args[])
 {
	LocalDate date = LocalDate.now();
	
	System.out.println(date);
	
	LocalTime time = LocalTime.now();
	
	System.out.println(time);
 
    System.out.println("**************************************************");
   
    int day = date.getDayOfMonth();
    int month = date.getMonthValue();
    int year = date.getYear();
    
    System.out.printf("%d:%d:%d",day,month,year);
  
    int hour = time.getHour();
    int minute = time.getMinute();
    int seconds = time.getSecond();
    int nano = time.getNano();
    
    System.out.printf("\n%d:%d:%d:%d",hour,minute,seconds,nano);
  
    System.out.println("*****************************************************");
    
    
    LocalDateTime dt = LocalDateTime.now();
    
    System.out.println(dt);
    
    
    System.out.println("******************************************************");
    
    LocalDateTime dt2 = LocalDateTime.of(2001,Month.AUGUST,04,3,15);
    
    System.out.println(dt2);
    
    System.out.println(dt2.minusMonths(2));
    
    System.out.println(dt2.minusMinutes(120));
    
    System.out.println("*******************************************************");
    
    LocalDate ld = LocalDate.of(2001,Month.AUGUST,04);
    
    LocalDate ln = LocalDate.now();
    
    Period p = Period.between(ld, ln);
    
    System.out.printf("jayanth ur age is %d :%d months :and %d days",p.getYears(),p.getMonths(),p.getDays());
    
    LocalDate now = LocalDate.now();
    LocalDate examCraked = LocalDate.of(now.getYear()+2,Month.AUGUST, 04);
    
    Period p1 = Period.between(ln, examCraked);
    
    
    
    System.out.println("you will crack sbi po exam in %d days"+(p1.getYears()*365+p1.getMonths()*30+p1.getDays()));
    
    System.out.println("*****************************************************");
    
    Year year2 = Year.of(2000);
    
    System.out.println("is it leap year?"+year2.isLeap());
    
    
    
    ZoneId zone = ZoneId.systemDefault();
    System.out.println("zone id");
    System.out.println(zone);
    
    
    ZonedDateTime zt = ZonedDateTime.now();
    System.out.println();
    System.out.println(zt);
    
    ZoneId losangeles = ZoneId.of("America/Los_Angeles");
    ZonedDateTime zt2 = ZonedDateTime.now(losangeles);
    
    System.out.println(zt2);
    
 }  
	
}
