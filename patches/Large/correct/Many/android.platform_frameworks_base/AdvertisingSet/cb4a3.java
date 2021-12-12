diff --git a/core/java/android/bluetooth/le/AdvertisingSet.java b/core/java/android/bluetooth/le/AdvertisingSet.java
index 5524a2b..7355b0d 100644
--- a/core/java/android/bluetooth/le/AdvertisingSet.java
+++ b/core/java/android/bluetooth/le/AdvertisingSet.java
@@ -65,7 +65,7 @@
      */
     public void enableAdvertising(boolean enable, int timeout) {
         try {
-            gatt.enableAdverisingSet(this.advertiserId, enable, timeout);
+            gatt.enableAdvertisingSet(this.advertiserId, enable, timeout);
         } catch (RemoteException e) {
             Log.e(TAG, "remote exception - ", e);
         }
@@ -143,9 +143,9 @@
      * Used to enable/disable periodic advertising. This method returns immediately, the operation
      * status is delivered through {@code callback.onPeriodicAdvertisingEnable()}.
      */
-    public void periodicAdvertisingEnable(boolean enable) {
+    public void setPeriodicAdvertisingEnable(boolean enable) {
         try {
-            gatt.periodicAdvertisingEnable(this.advertiserId, enable);
+            gatt.setPeriodicAdvertisingEnable(this.advertiserId, enable);
         } catch (RemoteException e) {
             Log.e(TAG, "remote exception - ", e);
         }
