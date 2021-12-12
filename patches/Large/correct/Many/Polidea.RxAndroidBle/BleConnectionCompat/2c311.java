diff --git a/rxandroidble/src/main/java/com/polidea/rxandroidble/internal/util/BleConnectionCompat.java b/rxandroidble/src/main/java/com/polidea/rxandroidble/internal/util/BleConnectionCompat.java
index 516ba81..2a05651 100644
--- a/rxandroidble/src/main/java/com/polidea/rxandroidble/internal/util/BleConnectionCompat.java
+++ b/rxandroidble/src/main/java/com/polidea/rxandroidble/internal/util/BleConnectionCompat.java
@@ -31,7 +31,14 @@
             return null;
         }
 
-        if (!autoConnect) {
+        /**
+         * Issue that caused a race condition mentioned below was fixed in 7.0.0_r1
+         * https://android.googlesource.com/platform/frameworks/base/+/android-7.0.0_r1/core/java/android/bluetooth/BluetoothGatt.java#649
+         * compared to
+         * https://android.googlesource.com/platform/frameworks/base/+/android-6.0.1_r72/core/java/android/bluetooth/BluetoothGatt.java#739
+         * issue: https://android.googlesource.com/platform/frameworks/base/+/d35167adcaa40cb54df8e392379dfdfe98bcdba2%5E%21/#F0
+          */
+        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N || !autoConnect) {
             return connectGattCompat(bluetoothGattCallback, remoteDevice, false);
         }
 
