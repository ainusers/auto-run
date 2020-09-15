package com.data.auto.web.manager;

import com.data.auto.web.common.Constants;
import com.data.auto.web.step.base.Windows;
import com.data.auto.web.step.senior.Screen;
import com.data.auto.web.util.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
 * @Author: tianyong
 * @Date: 2020/9/10 14:22
 * @Description: API管理
 */
public class APIManager {


    /*
     * @Author: tianyong
     * @Date: 2020/9/10 14:23
     * @Description: 创建rest-API
     */
    public static void createRestAPI() throws InterruptedException {
        // driver
        WebDriver driver = Util.getBrowserInstance();

        // 点击创建API
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("top-menu-api-add")));
        driver.findElement(By.id("top-menu-api-add")).click();
        // 创建rest-api
        driver.findElement(By.id("headingThree")).click();
        // 点击创建API
        driver.findElement(By.id("designNewAPI")).click();

        // 填写创建API信息
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("name")));
        driver.findElement(By.id("name")).sendKeys(Constants.REST_API_NAME);
        driver.findElement(By.id("context")).sendKeys(Constants.REST_API_CONTEXT);
        driver.findElement(By.id("version")).sendKeys(Constants.REST_API_VERSION);
        driver.findElement(By.id("description")).sendKeys(Constants.REST_API_DESCRIPTION);
        driver.findElement(By.id("resource_url_pattern")).sendKeys(Constants.REST_API_RESOURCE_URL_PATTERN);
        // 添加在线测试访问接口
        driver.findElement(By.id("get")).click();
        driver.findElement(By.id("add_resource")).click();
        // 下一步
        driver.findElement(By.id("go_to_implement")).click();

        // 延时加载正式服务
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("select-managed-api")));
        // 选择正式服务
        driver.findElement(By.id("select-managed-api")).click();
        // 演示加载网关URL地址
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("endpoint-input")));
        // 填写网关URL地址
        driver.findElement(By.id("endpoint-input")).sendKeys(Constants.REST_API_ACCESS_URL);
        // 下一步
        driver.findElement(By.id("go_to_manage")).click();

        // 选择不限流策略
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("Unlimited")));
        driver.findElement(By.id("Unlimited")).click();
        // 点击保存并发布
        driver.findElement(By.id("publish_api")).click();
        // 发布成功截屏
        Thread.sleep(3000);
        Screen.screenCapture();

        // 向下滚动
        Windows.scrollPageWindow(300);
        // 跳转服务门户
        driver.findElement(By.id("goToStore-btn")).click();
    }


}
