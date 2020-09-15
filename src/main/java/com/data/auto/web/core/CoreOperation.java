package com.data.auto.web.core;

import com.data.auto.web.manager.APIManager;
import com.data.auto.web.manager.LoginManager;
import com.data.auto.web.manager.OperationManager;
/*
 * @Author: tianyong
 * @Date: 2020/9/11 16:42
 * @Description: 核心控制器
 */
public class CoreOperation {


    /*
     * @Author: tianyong
     * @Date: 2020/9/11 16:44
     * @Description: 创建API到订阅
     */
    public static void CreateAPI2Subscribe() throws InterruptedException {
        // 登录发布门户
        LoginManager.openBrowser(2);
        LoginManager.login(2);
        // 创建API
        APIManager.createRestAPI();
        // 服务门户登录
        OperationManager.apiSubscribeDefaultApplication();
    }


}
