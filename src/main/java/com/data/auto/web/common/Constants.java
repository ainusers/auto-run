package com.data.auto.web.common;

import java.util.Date;

/*
 * @Author: tianyong
 * @Date: 2020/9/8 15:48
 * @Description: 项目静态变量
 */
public class Constants {

    // common-content
    public static final String ACCESS_STORE_URL = "https://192.168.2.122:9443/store/";
    public static final String ACCESS_PUBLISHER_URL = "https://192.168.2.122:9443/publisher/";
    public static final String ACCESS_ADMIN_URL = "https://192.168.2.122:9443/admin/";
    public static final String ACCESS_CARBON_URL = "https://192.168.2.122:9443/carbon/";
    public static final String USERNAME = "admin";
    public static final String PASSWORD = "admin";

    // rest-api
    public static final String REST_API_NAME = "name-"+new Date().getHours()+new Date().getMinutes()+new Date().getMinutes();
    public static final String REST_API_CONTEXT = "context-"+new Date().getHours()+new Date().getMinutes()+new Date().getMinutes();
    public static final String REST_API_VERSION = "version-"+new Date().getTime();
    public static final String REST_API_DESCRIPTION = "description-"+new Date().getYear()+new Date().getMonth()+new Date().getDay()+new Date().getHours()+new Date().getMinutes()+new Date().getMinutes();
    public static final String REST_API_RESOURCE_URL_PATTERN = "resource_url_pattern-"+new Date().getTime();
    public static final String REST_API_ACCESS_URL = "http://www.webxml.com.cn/webservices/chinatvprogramwebservice.asmx?wsdl";

    // create-application
    public static final String CREATE_APPLICATION_NAME = "application-name"+new Date().getHours()+new Date().getMinutes()+new Date().getMinutes();
    public static final String CREATE_APPLICATION_DESCRIPTION = "description-"+new Date().getYear()+new Date().getMonth()+new Date().getDay()+new Date().getHours()+new Date().getMinutes()+new Date().getMinutes();

}
