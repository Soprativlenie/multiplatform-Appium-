package com.multiplatformtest.demo.driverfactory;

public enum PlatformType {
    PLATFORM_ANDROID("android"),
    PLATFORM_IOS("ios");

    private String name;

    PlatformType(String name) {
        this.name = name;
    }
}
