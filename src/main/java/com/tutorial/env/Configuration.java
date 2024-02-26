package com.tutorial.env;

import org.springframework.core.env.SystemEnvironmentPropertySource;

public interface Configuration {

    static Configuration create() {
//        return new SystemPropertyConfiguration();
        return new EnvConfiguration();
    }

    String getValue(String key, String defaultValue);

    String getValue(String key);

}
