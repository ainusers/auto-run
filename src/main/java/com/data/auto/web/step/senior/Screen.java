package com.data.auto.web.step.senior;

import com.data.auto.web.util.Util;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 * @Author: tianyong
 * @Date: 2020/9/8 16:30
 * @Description: 浏览器事件
 */
public class Screen {


    /*
     * @Author: tianyong
     * @Date: 2020/9/8 16:39
     * @Description: 屏幕截图
     */
    public static void screenCapture(){
        try {
            File scrFile = ((TakesScreenshot) Util.getBrowserInstance()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("./"+ new Date().getTime() +".png"));
        } catch (IOException e) {
            Util.getLogInstance().info("屏幕截图操作失败！");
            e.printStackTrace();
        }
    }


    /*
     * @Author: tianyong
     * @Date: 2020/9/8 17:08
     * @Description: 元素屏幕截图
     */
    public void ElementScreenCapture(String elements){
        try {
            WebElement element = Util.getBrowserInstance().findElement(By.cssSelector(elements));
            File scrFile = element.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("./"+ new Date() +".png"));
        } catch (IOException e) {
            Util.getLogInstance().info("元素屏幕截图操作失败！");
            e.printStackTrace();
        }
    }


}
