package com.example.demo.Config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${app.name}")
    String appName;
    @Value("${app.version}")
    String appVersion;

    public AppConfig() {
        
    }
    public AppConfig(String appName, String appVersion) {
        this.appName = appName;
        this.appVersion = appVersion;
    }
    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }
    public String getAppVersion() {
        return appVersion;
    }
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
    
}