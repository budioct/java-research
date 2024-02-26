package com.tutorial.env;

public class EnvConfiguration implements Configuration {

    @Override
    public String getValue(String key, String defaultValue) {
        return System.getenv().getOrDefault(key, defaultValue);
    }

    @Override
    public String getValue(String key) {
        return System.getenv(key);
    }

}
