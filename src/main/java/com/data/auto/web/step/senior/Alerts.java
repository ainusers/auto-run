package com.data.auto.web.step.senior;

import org.openqa.selenium.Alert;

/*
 * @Author: tianyong
 * @Date: 2020/9/8 17:30
 * @Description: 提示框事件
 */
public class Alerts {


    /*
     * @Author: tianyong
     * @Date: 2020/9/8 17:30
     * @Description: 默认提示框
     * @Description: 如果status为0则确认，其他则取消
     */
    public void DefaultAlert(Alert alert,Integer status){
        if (status == 0) {
            alert.accept();
        } else {
            alert.dismiss();
        }
    }


}
