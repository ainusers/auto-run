package com.data.auto.web.step.base;

import com.data.auto.web.util.Util;

/*
 * @Author: tianyong
 * @Date: 2020/9/8 15:15
 * @Description: 浏览器操作
 */
public class Browser {


    /*
     * @Author: tianyong
     * @Date: 2020/9/8 15:21
     * @Description: 打开浏览器
     */
    public static void startBrowser(String url){
        Util.getBrowserInstance().get(url);
    }


    /*
     * @Author: tianyong
     * @Date: 2020/9/8 15:29
     * @Description: 获取当前浏览器URL
     */
    public String getCurrentURL(){
        return Util.getBrowserInstance().getCurrentUrl();
    }


    /*
     * @Author: tianyong
     * @Date: 2020/9/8 15:32
     * @Description: 浏览器后退
     */
    public void browserGoBack(){
        Util.getBrowserInstance().navigate().back();
    }


    /*
     * @Author: tianyong
     * @Date: 2020/9/8 15:33
     * @Description: 浏览器前进
     */
    public void browserGoNext(){
        Util.getBrowserInstance().navigate().forward();
    }


    /*
     * @Author: tianyong
     * @Date: 2020/9/8 15:34
     * @Description: 刷新当前页面
     */
    public void freshBrowser(){
        Util.getBrowserInstance().navigate().refresh();
    }


    /*
     * @Author: tianyong
     * @Date: 2020/9/8 15:36
     * @Description: 获取浏览器标题
     */
    public void getBrowserTitle(){
        Util.getBrowserInstance().getTitle();
    }


    /*
     * @Author: tianyong
     * @Date: 2020/9/8 15:40
     * @Description: 获取浏览器当前窗口的窗口句柄
     * @Description: 获取当前窗口的唯一标识
     */
    public static String getBrowserHandle(){
        return Util.getBrowserInstance().getWindowHandle();
    }


    /*
     * @Author: tianyong
     * @Date: 2020/9/8 16:04
     * @Description: 关闭标签或窗口
     */
    public void closeTabOrWindow(){
        Util.getBrowserInstance().close();
    }

}
