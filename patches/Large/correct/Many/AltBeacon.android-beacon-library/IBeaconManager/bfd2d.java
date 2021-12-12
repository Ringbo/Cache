diff --git a/src/main/java/com/radiusnetworks/ibeacon/IBeaconManager.java b/src/main/java/com/radiusnetworks/ibeacon/IBeaconManager.java
index f9f9a41..a3609e3 100644
--- a/src/main/java/com/radiusnetworks/ibeacon/IBeaconManager.java
+++ b/src/main/java/com/radiusnetworks/ibeacon/IBeaconManager.java
@@ -134,9 +134,7 @@
      * Sets the duration in milliseconds of each Bluetooth LE scan cycle to look for iBeacons
      * @param p
      */
-    public void setForegroundScanPeriod(long p) {
-        foregroundBetweenScanPeriod = p;
-    }
+    public void setForegroundScanPeriod(long p) { foregroundScanPeriod = p; }
     /**
      * Sets the duration in milliseconds to wait between each bluetooth scan cycle used to look for iBeacons
      * @param p
