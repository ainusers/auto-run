package com.data.auto.web.util;

import com.data.auto.web.common.Constants;
import com.data.auto.web.driver.SingleDriver;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import java.util.Map;

/*
 * @Author: tianyong
 * @Date: 2020/9/8 15:55
 * @Description: 工具类
 */
public class Util {


    /*
     * @Author: tianyong
     * @Date: 2020/9/8 15:56
     * @Description: 获得浏览器对象实例
     */
    public static WebDriver getBrowserInstance(){
        return SingleDriver.getInstance();
    }


    /*
     * @Author: tianyong
     * @Date: 2020/9/8 16:58
     * @Description: 获取log对象
     */
    public static Logger getLogInstance(){
        return LoggerFactory.getLogger(Util.class);
    }


    /*
     * @Author: tianyong
     * @Date: 2020/9/10 16:15
     * @Description: 请求地址映射
     */
    public static String getAccessUrlMapping(Integer index){
        Map<Integer,String> data = new HashMap<>(3);
        data.put(1, Constants.ACCESS_STORE_URL);
        data.put(2, Constants.ACCESS_PUBLISHER_URL);
        data.put(3, Constants.ACCESS_ADMIN_URL);
        return data.get(index);
    }

}
