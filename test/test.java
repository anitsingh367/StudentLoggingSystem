
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author strom
 */
public class test {
    public static void getCurrentTimeWithTimeZone(){
    System.out.println("-----Current time of a different time zone using LocalTime-----");
    ZoneId zoneId = ZoneId.of("America/Los_Angeles");
    LocalTime localTime=LocalTime.now(zoneId);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    String formattedTime=localTime.format(formatter);
    System.out.println("Current time of the day in Los Angeles: " + formattedTime);
}
    
}
