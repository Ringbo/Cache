diff --git a/bundles/binding/org.openhab.binding.netatmo/src/main/java/org/openhab/binding/netatmo/internal/weather/GetStationsDataResponse.java b/bundles/binding/org.openhab.binding.netatmo/src/main/java/org/openhab/binding/netatmo/internal/weather/GetStationsDataResponse.java
index c697033..f815f51 100644
--- a/bundles/binding/org.openhab.binding.netatmo/src/main/java/org/openhab/binding/netatmo/internal/weather/GetStationsDataResponse.java
+++ b/bundles/binding/org.openhab.binding.netatmo/src/main/java/org/openhab/binding/netatmo/internal/weather/GetStationsDataResponse.java
@@ -599,13 +599,13 @@
             int level = this.rfStatus.intValue();
             int result;
 
-            if (level <= RF_STATUS_FULL_SIGNAL) {
+            if (level < RF_STATUS_FULL_SIGNAL) {
                 result = 5;
-            } else if (level <= RF_STATUS_HIGH_SIGNAL) {
+            } else if (level < RF_STATUS_HIGH_SIGNAL) {
                 result = 4;
-            } else if (level <= RF_STATUS_MEDIUM_SIGNAL) {
+            } else if (level < RF_STATUS_MEDIUM_SIGNAL) {
                 result = 3;
-            } else if (level <= RF_STATUS_LOW_SIGNAL) {
+            } else if (level < RF_STATUS_LOW_SIGNAL) {
                 result = 2;
             } else {
                 result = 1;
@@ -643,13 +643,13 @@
 
             int batteryVp = this.batteryVp;
             int result;
-            if (batteryVp >= full) {
+            if (batteryVp > full) {
                 result = 5;
-            } else if (batteryVp >= high) {
+            } else if (batteryVp > high) {
                 result = 4;
-            } else if (batteryVp >= medium) {
+            } else if (batteryVp > medium) {
                 result = 3;
-            } else if (batteryVp >= low) {
+            } else if (batteryVp > low) {
                 result = 2;
             } else { /* very low */
                 result = 1;
