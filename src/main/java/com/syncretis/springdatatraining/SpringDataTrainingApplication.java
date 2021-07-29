package com.syncretis.springdatatraining;

import com.syncretis.springdatatraining.service.Runner;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataTrainingApplication {

    public static void main(String[] args) {
        //initialize zone
        SpringApplication application = new SpringApplication(SpringDataTrainingApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext run = application.run(args);
        Runner runner = run.getBean("runner", Runner.class);
        //end of initialize zone

        runner.run();

    }
}