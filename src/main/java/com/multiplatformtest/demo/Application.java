package com.multiplatformtest.demo;

import com.multiplatformtest.demo.config.CapabilityConfig;
import com.multiplatformtest.demo.model.Capability;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
//@EnableConfigurationProperties(Capability.class)
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CapabilityConfig.class);
        SpringApplication.run(Application.class, args);

        Capability bean = context.getBean("mobileCapability", Capability.class);
        System.out.println(bean.toString());


    }

//    @Bean
//    ApplicationRunner applicationRunner(Capability capability) {
//        return args -> {
//            System.out.println(capability);
//        };
//    }

}
