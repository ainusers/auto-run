package com.data.auto.web.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * @Author: tianyong
 * @Date: 2020/9/8 14:00
 * @Description: 单例创建driver对象
 */
public class SingleDriver {

    // 私有构造
    private SingleDriver() {}

    // 创建driver承载变量
    private static final ThreadLocal<WebDriver> tl = new ThreadLocal<>();

    /*
     * @Author: tianyong
     * @Date: 2020/9/8 14:04
     * @Description: 创建driver对象
     */
    public static WebDriver getInstance(){
        if(tl.get() == null){
            synchronized (SingleDriver.class){
                if(tl.get() == null){
                    tl.set(new FirefoxDriver());
                }
            }
        }
        return tl.get();
    }

}
