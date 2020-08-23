package com.exam.codbility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeApi {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TimeApi timeApi = new TimeApi();
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i <num ; i++) {
            String [] line = br.readLine().split(",");
            System.out.println(timeApi.convertZone(line[0],line[1],line[2],line[3]));

        }
    }

    private ZonedDateTime convertZone(String date, String zone1, String zone2, String hours) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        ZoneId firstZone = ZoneId.of(zone1);
        ZoneId secondZone = ZoneId.of(zone2);
        LocalDateTime givenDate  = LocalDateTime.parse(date,dateTimeFormatter);
        ZonedDateTime firstZoneDate = givenDate.atZone(firstZone);
        ZonedDateTime seconZonedDateTime = firstZoneDate.withZoneSameInstant(secondZone).plusHours(Long.parseLong(hours));
        return  seconZonedDateTime;
    }
}
