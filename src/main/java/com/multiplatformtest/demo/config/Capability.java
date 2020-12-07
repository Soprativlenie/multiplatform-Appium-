package com.multiplatformtest.demo.config;

import org.openqa.selenium.remote.DesiredCapabilities;
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

    private String udid;

    private String noReset;

    public String getUdid() {
        return udid;
    }

    public void setUdid(String udid) {
        this.udid = udid;
    }

    public String getNoReset() {
        return noReset;
    }

    public void setNoReset(String noReset) {
        this.noReset = noReset;
    }

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
        return "Capability{" +
                "platformName='" + platformName + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", platformVersion='" + platformVersion + '\'' +
                ", appPackage='" + appPackage + '\'' +
                ", appActivity='" + appActivity + '\'' +
                ", automationName='" + automationName + '\'' +
                ", app='" + app + '\'' +
                ", autoAcceptAlerts='" + autoAcceptAlerts + '\'' +
                ", udid='" + udid + '\'' +
                ", noReset='" + noReset + '\'' +
                '}';
    }

    public DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, getPlatformName());
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, getDeviceName());
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, getPlatformVersion());
        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, getAppPackage());
        capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, getAppActivity());
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, getAutomationName());
        capabilities.setCapability(MobileCapabilityType.APP, getApp());
        capabilities.setCapability(MobileCapabilityType.AUTO_ACCEPT_ALERTS, getAutoAcceptAlerts());
        capabilities.setCapability(MobileCapabilityType.UDID, getUdid());
        capabilities.setCapability(MobileCapabilityType.NO_RESET, getNoReset());
        return capabilities;
    }
}
