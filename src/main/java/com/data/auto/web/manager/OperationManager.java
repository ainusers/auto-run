package com.data.auto.web.manager;

import com.data.auto.web.step.senior.Screen;
import com.data.auto.web.util.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * @Author: tianyong
 * @Date: 2020/9/11 14:15
 * @Description: 事件操作
 */
public class OperationManager {


    /*
     * @Author: tianyong
     * @Date: 2020/9/11 14:16
     * @Description: API订阅服务操作
     */
    public static void apiSubscribeDefaultApplication() throws InterruptedException {
        // driver
        WebDriver driver = Util.getBrowserInstance();

        // 切换标签 (获取当前页面句柄)
        String handle = driver.getWindowHandle();
        // 获取所有句柄，循环判断是否等于当前句柄
        for (String handles:driver.getWindowHandles()) {
            if (handles.equals(handle))
                continue;
            driver.switchTo().window(handles);
        }

        // 跳转到服务门户登录
        LoginManager.login(1);
        // 订阅默认应用程序
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("subscribe-button")));
        driver.findElement(By.id("subscribe-button")).click();

        // 发布成功截屏
        Thread.sleep(3000);
        Screen.screenCapture();
    }



}
