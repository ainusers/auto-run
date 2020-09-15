package com.data.auto.web.manager;

import com.data.auto.web.common.Constants;
import com.data.auto.web.step.senior.Screen;
import com.data.auto.web.util.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * @Author: tianyong
 * @Date: 2020/9/11 11:22
 * @Description: 应用操作
 */
public class ApplicationManager {


    /*
     * @Author: tianyong
     * @Date: 2020/9/11 11:23
     * @Description: 创建应用程序
     */
    public static void createApplication() throws InterruptedException {
        // driver
        WebDriver driver = Util.getBrowserInstance();

        // 点击左侧菜单应用程序
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[title='Applications']")));
        driver.findElement(By.cssSelector("a[title='Applications']")).click();

        // 点击添加应用程序
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[title='添加应用程序']")));
        driver.findElement(By.cssSelector("a[title='添加应用程序']")).click();

        // 输入应用程序信息
        // 应用名称
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("application-name")));
        driver.findElement(By.id("application-name")).sendKeys(Constants.CREATE_APPLICATION_NAME);
        // 应用程序描述
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("description")));
        driver.findElement(By.id("application-name")).sendKeys(Constants.CREATE_APPLICATION_DESCRIPTION);

        // 生成应用程序
        driver.findElement(By.id("application-add-button")).click();

        // 生产Key选项标签
        driver.findElement(By.id("actionLink-productionKeys")).click();

        // 生产环境生成token
        driver.findElement(By.cssSelector("input[id^=generatekeys]")).click();

        // 生成成功截屏
        Thread.sleep(3000);
        Screen.screenCapture();
    }


}
