diff --git a/packages/MtpDocumentsProvider/tests/src/com/android/mtp/TestMtpManager.java b/packages/MtpDocumentsProvider/tests/src/com/android/mtp/TestMtpManager.java
index 9a81489..30d529a 100644
--- a/packages/MtpDocumentsProvider/tests/src/com/android/mtp/TestMtpManager.java
+++ b/packages/MtpDocumentsProvider/tests/src/com/android/mtp/TestMtpManager.java
@@ -74,7 +74,7 @@
     }
 
     @Override
-    MtpDeviceRecord[] getDevices() {
+    synchronized MtpDeviceRecord[] getDevices() {
         final MtpDeviceRecord[] result = new MtpDeviceRecord[mDevices.size()];
         for (int i = 0; i < mDevices.size(); i++) {
             final MtpDeviceRecord device = mDevices.valueAt(i);
@@ -90,7 +90,7 @@
     }
 
     @Override
-    MtpDeviceRecord openDevice(int deviceId) throws IOException {
+    synchronized MtpDeviceRecord openDevice(int deviceId) throws IOException {
         final MtpDeviceRecord device = mDevices.get(deviceId);
         if (device == null) {
             throw new IOException();
@@ -103,7 +103,7 @@
     }
 
     @Override
-    void closeDevice(int deviceId) throws IOException {
+    synchronized void closeDevice(int deviceId) throws IOException {
         final MtpDeviceRecord device = mDevices.get(deviceId);
         if (device == null) {
             throw new IOException();
