diff --git a/core/java/android/bluetooth/le/PeriodicAdvertisingReport.java b/core/java/android/bluetooth/le/PeriodicAdvertisingReport.java
index 51b93cb..6fc8d55 100644
--- a/core/java/android/bluetooth/le/PeriodicAdvertisingReport.java
+++ b/core/java/android/bluetooth/le/PeriodicAdvertisingReport.java
@@ -71,7 +71,7 @@
     @Override
     public void writeToParcel(Parcel dest, int flags) {
         dest.writeInt(syncHandle);
-        dest.writeLong(txPower);
+        dest.writeInt(txPower);
         dest.writeInt(rssi);
         dest.writeInt(dataStatus);
         if (data != null) {
