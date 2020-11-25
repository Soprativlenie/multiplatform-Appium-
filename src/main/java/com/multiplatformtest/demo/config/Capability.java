package com.multiplatformtest.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "capability")
public class Capability {


    private String platformName;

    private String deviceName;

    private String platformVersion;

    private String appPackage;

    private String appActivity;

    private String automationName;

    private String app;

    private String autoAcceptAlerts;

    public String getAutoAcceptAlerts(){
        return autoAcceptAlerts;
    }
    public void setAutoAcceptAlerts(String autoAcceptAlerts){
        this.autoAcceptAlerts = autoAcceptAlerts;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public void setAppPackage(String appPackage) {
        this.appPackage = appPackage;
    }

    public String getAppActivity() {
        return appActivity;
    }

    public void setAppActivity(String appActivity) {
        this.appActivity = appActivity;
    }

    public String getAutomationName() {
        return automationName;
    }

    public void setAutomationName(String automationName) {
        this.automationName = automationName;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    @Override
    public String toString() {
        return platformName + deviceName + platformVersion + appPackage + appActivity + app + automationName;
    }
}
