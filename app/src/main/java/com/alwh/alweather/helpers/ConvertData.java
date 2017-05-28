package com.alwh.alweather.helpers;

/**
 * Created by abelov on 11.05.2017.
 */

import android.content.Context;
import android.media.Image;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ConvertData {
    public static String passedMin(Date oldDate) {
        Date now = new Date();
        return ("" + ((now.getTime() - oldDate.getTime()) / 1000) / 60);
    }

    public static String getLongDate(Date date) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm z");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+3"));
        return sdf.format(date);
    }

    public static String getDay(Date date) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+3"));
        return sdf.format(date);
    }

    public static String getTime(Date date) {

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm z");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+3"));
        return sdf.format(date);
    }

    public static String getStandartDate(Date date) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+3"));
        return sdf.format(date);
    }


    public static int getIconWeatherL(String wIcon, Context context){
        String uri = "@drawable/l" + wIcon;
        int icon = context.getResources().getIdentifier(uri, null, context.getPackageName());

        return icon;
    }
    public static int getWeatherInfo(String wInfo, Context context){
        String uri = "@string/w" + wInfo;
        int info = context.getResources().getIdentifier(uri, null, context.getPackageName());

        return info;
    }

}
