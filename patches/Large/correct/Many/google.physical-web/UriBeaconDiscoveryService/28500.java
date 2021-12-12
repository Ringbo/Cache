diff --git a/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/UriBeaconDiscoveryService.java b/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/UriBeaconDiscoveryService.java
index 9df8771..77899cc 100644
--- a/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/UriBeaconDiscoveryService.java
+++ b/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/UriBeaconDiscoveryService.java
@@ -332,7 +332,7 @@
       UriBeacon uriBeacon = UriBeacon.parseFromBytes(scanResult.getScanRecord().getBytes());
       if (uriBeacon != null) {
         String url = uriBeacon.getUriString();
-        if (url != null && url.isEmpty()) {
+        if (url != null && !url.isEmpty()) {
           String address = scanResult.getDevice().getAddress();
           int rssi = scanResult.getRssi();
           int txPower = uriBeacon.getTxPowerLevel();
