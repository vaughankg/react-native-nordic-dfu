package com.nordicnordic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

import com.facebook.react.turbomodule.core.interfaces.TurboModule;

@ReactModule(name = RNNordicDfuModule.NAME)
public class RNNordicDfuModule extends NativeRNNordicDfuSpec {
    public static final String NAME = "RNNordicDfu";
    private final RNNordicDfu legacyModule;

    public RNNordicDfuModule(ReactApplicationContext reactContext) {
        super(reactContext);
        legacyModule = new RNNordicDfu(reactContext);
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }

    @Override
    public String getConstants() {
        return legacyModule.getConstants();
    }

    @Override
    public void startDFU(
            String deviceAddress,
            String deviceName,
            String filePath,
            int packetReceiptNotificationParameter,
            ReadableMap options,
            Promise promise) {
        legacyModule.startDFU(deviceAddress, deviceName, filePath, packetReceiptNotificationParameter, options, promise);
    }

    @Override
    public void addListener(String eventName) {
        legacyModule.addListener(eventName);
    }

    @Override
    public void removeListeners(double count) {
        legacyModule.removeListeners((int) count);
    }
} 