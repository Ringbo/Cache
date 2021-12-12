diff --git a/src/main/java/com/radiusnetworks/ibeacon/IBeaconManager.java b/src/main/java/com/radiusnetworks/ibeacon/IBeaconManager.java
index 3eec272..20824e6 100644
--- a/src/main/java/com/radiusnetworks/ibeacon/IBeaconManager.java
+++ b/src/main/java/com/radiusnetworks/ibeacon/IBeaconManager.java
@@ -412,7 +412,7 @@
         synchronized (rangedRegions) {
             Region regionToRemove = null;
             for (Region rangedRegion : rangedRegions) {
-                if (region.getUniqueId().equals(rangedRegion.getProximityUuid())) {
+                if (region.getUniqueId().equals(rangedRegion.getUniqueId())) {
                     regionToRemove = rangedRegion;
                 }
             }
@@ -474,7 +474,7 @@
         synchronized (monitoredRegions) {
             Region regionToRemove = null;
             for (Region monitoredRegion : monitoredRegions) {
-                if (region.getUniqueId().equals(monitoredRegion.getProximityUuid())) {
+                if (region.getUniqueId().equals(monitoredRegion.getUniqueId())) {
                     regionToRemove = monitoredRegion;
                 }
             }
