package com.data.auto.web.step.base;

import com.data.auto.web.util.Util;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/*
 * @Author: tianyong
 * @Date: 2020/9/8 16:33
 * @Description: 窗口管理
 */
public class Windows {


    /*
     * @Author: tianyong
     * @Date: 2020/9/8 16:33
     * @Description: 最大化窗口
     */
    public static void maxWindow(){
        Util.getBrowserInstance().manage().window().maximize();
    }


    /*
     * @Author: tianyong
     * @Date: 2020/9/8 16:37
     * @Description: 全屏窗口
     */
    public void fullWindow(){
        Util.getBrowserInstance().manage().window().fullscreen();
    }


    /*
     * @Author: tianyong
     * @Date: 2020/9/11 16:08
     * @Description: 页面滚动（上下）
     */
    public static void scrollPageWindow(Integer num){
        ((JavascriptExecutor) Util.getBrowserInstance()).executeScript("window.scrollTo(0,"+num+")");
    }

}
