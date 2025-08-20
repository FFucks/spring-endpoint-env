package com.ffucks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);

        // Define "prod" como profile padrão caso nenhum seja informado
        Map<String, Object> defaults = new HashMap<>();
        defaults.put(AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME, "prod"); // "spring.profiles.default"
        app.setDefaultProperties(defaults);
        var ctx = app.run(args);

        // Apenas para conferência em console
        ConfigurableEnvironment env = ctx.getEnvironment();
        System.out.println("Active profiles: " + Arrays.toString(env.getActiveProfiles()));
    }
}
