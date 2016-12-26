package com.whty.coolweather.gson;

/**
 * Created by wulimin on 2016/12/25.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
