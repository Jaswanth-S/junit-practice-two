package com.stackroute;

import java.text.*;
import java.util.*;
public class FirstLastDayOfWeek {
    public String[] printFLDayOfWeek()
    {
        String[] days= new String[2];
        Calendar c = Calendar.getInstance();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        days[0]=df.format(c.getTime()).trim();
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        days[1]=df.format(c.getTime()).trim();
        return days;

    }
}
