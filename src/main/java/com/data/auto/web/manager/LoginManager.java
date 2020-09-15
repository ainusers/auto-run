package com.data.auto.web.manager;

import com.data.auto.web.common.Constants;
import com.data.auto.web.step.base.Browser;
import com.data.auto.web.step.base.Windows;
import com.data.auto.web.util.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
 * @Author: tianyong
 * @Date: 2020/9/8 17:45
 * @Description: 登录操作
 */
public class LoginManager {


    /*
     * @Author: tianyong
     * @Date: 2020/9/11 16:19
     * @Description: 打开指定网址
     */
    public static void openBrowser(Integer go){
        // driver
        WebDriver driver = Util.getBrowserInstance();
        // 最大化浏览器
        Windows.maxWindow();
        // 打开指定的网址
        Browser.startBrowser(Util.getAccessUrlMapping(go));
    }


    /*
     * @Author: tianyong
     * @Date: 2020/9/8 17:45
     * @Description: login-manager
     */
    public static void login(Integer go) throws InterruptedException {
        // driver
        WebDriver driver = Util.getBrowserInstance();
        // 点击登入
        if(go == 1){
            // 延迟加载
            new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("btn-login")));
            // 用户登录
            driver.findElement(By.id("btn-login")).click();
        }
        // 输入用户名、密码
        driver.findElement(By.id("username")).sendKeys(Constants.USERNAME);
        driver.findElement(By.cssSelector("input[id^=pass]")).sendKeys(Constants.PASSWORD);
        driver.findElement(By.cssSelector("Button[type='button']")).click();
    }


}
