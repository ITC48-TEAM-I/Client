package com.example.user.travellog.utiles;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by user on 2016/12/02.
 */
public class Point {
    private Location location;
    private Time transitTime;

    Point(Location location, Date date){
        this.location = location;

        Calendar _date = Calendar.getInstance();
        _date.setTime(date);
        this.transitTime = new Time(_date.getTimeInMillis());
    }

    Point(Location location, Calendar date){
        this.location = location;
        this.transitTime = new Time(date.getTimeInMillis());
    }

    Point(Location location, long time){
        this.location = location;
        this.transitTime = new Time(time);
    }

    public long timeDiff(Point p){
        return transitTime.getTime() - p.getTransitTime().getTime();
    }

    public Location getLocation() {
        return location;
    }

    public Time getTransitTime() {
        return transitTime;
    }
}
