package com.nordicnordic;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;

import com.facebook.react.turbomodule.core.interfaces.TurboModule;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public interface RNNordicDfuSpec extends TurboModule {
    String getConstants();

    void startDFU(
            String deviceAddress,
            String deviceName,
            String filePath,
            int packetReceiptNotificationParameter,
            ReadableMap options,
            Promise promise);
            
    void addListener(String eventName);
    void removeListeners(double count);
} 