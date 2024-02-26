package com.tutorial.env;

public class SystemPropertyConfiguration implements Configuration {

    @Override
    public String getValue(String key, String defaultValue) {
        return System.getProperty(key, defaultValue);
    }

    @Override
    public String getValue(String key) {
        return System.getProperty(key);
    }
}
