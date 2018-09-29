package com.langchuan.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: kevin.xiong
 * @description:
 * @date:2018/9/29 14:24
 */
public class TestDate {

  public static void main(String[] args) {
    Date date = null;
    try {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      date = sdf.parse("2018-08-01 13:59:58");
    } catch (ParseException e) {
      e.printStackTrace();
    }
    System.out.println(date);

    Date nextDay = getNextDay2(date);
    System.out.println(nextDay);
  }

  /** 修改use_begin_end字段加1秒至次日凌晨*/
  public static Date getNextDay(Date date) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    //+1秒至次日凌晨
    calendar.add(Calendar.SECOND, +1);
    date = calendar.getTime();
    return date;
  }

  /** 将传入时间改成次日凌晨*/
  public static Date getNextDay2(Date date) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(Calendar.DAY_OF_MONTH, +1);
    calendar.set(Calendar.HOUR_OF_DAY, 0);
    calendar.set(Calendar.MINUTE, 0);
    calendar.set(Calendar.SECOND, 0);
    date = calendar.getTime();
    return date;
  }
}