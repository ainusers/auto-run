package com.data.auto;

import com.data.auto.web.core.CoreOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoApplication {

    static {
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\lib\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\lib\\chromedriver.exe");
        System.setProperty("webdriver.ie.driver", "src\\main\\resources\\lib\\iedriver.exe");
    }


    public static void main(String[] args) throws InterruptedException {
        CoreOperation.CreateAPI2Subscribe();

        SpringApplication.run(AutoApplication.class, args);
    }

}
