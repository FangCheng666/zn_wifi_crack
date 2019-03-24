package com.znkeji.zn_wifi_carck.utils;

import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: fangcheng
 * Date: 2019/3/24
 * Time: 13:16
 * Description: WiFi工具类
 */
public class WiFiUtils {

    /**
     * 获得wifi配置文件字符串
     * @param WIFI_NAME
     * @param hex
     * @param WIFI_PASSWORD
     * @return
     */
    public static String getWifiStr(String WIFI_NAME, String hex, String WIFI_PASSWORD) {
        return "<?xml version=\"1.0\"?>\n" +
                "<WLANProfile xmlns=\"http://www.microsoft.com/networking/WLAN/profile/v1\">\n" +
                "\t<name>"+WIFI_NAME+"</name>\n" +
                "\t<SSIDConfig>\n" +
                "\t\t<SSID>\n" +
                "\t\t\t<hex>"+hex+"</hex>\n" +
                "\t\t\t<name>"+WIFI_NAME+"</name>\n" +
                "\t\t</SSID>\n" +
                "\t</SSIDConfig>\n" +
                "\t<connectionType>ESS</connectionType>\n" +
                "\t<connectionMode>auto</connectionMode>\n" +
                "\t<MSM>\n" +
                "\t\t<security>\n" +
                "\t\t\t<authEncryption>\n" +
                "\t\t\t\t<authentication>WPA2PSK</authentication>\n" +
                "\t\t\t\t<encryption>AES</encryption>\n" +
                "\t\t\t\t<useOneX>false</useOneX>\n" +
                "\t\t\t</authEncryption>\n" +
                "\t\t\t<sharedKey>\n" +
                "\t\t\t\t<keyType>passPhrase</keyType>\n" +
                "\t\t\t\t<protected>false</protected>\n" +
                "\t\t\t\t<keyMaterial>"+WIFI_PASSWORD+"</keyMaterial>\n" +
                "\t\t\t</sharedKey>\n" +
                "\t\t</security>\n" +
                "\t</MSM>\n" +
                "\t<MacRandomization xmlns=\"http://www.microsoft.com/networking/WLAN/profile/v3\">\n" +
                "\t\t<enableRandomization>false</enableRandomization>\n" +
                "\t</MacRandomization>\n" +
                "</WLANProfile>\n";
    }
}
