diff --git a/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/bars/Config.java b/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/bars/Config.java
index 645634f..09937bc 100644
--- a/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/bars/Config.java
+++ b/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/bars/Config.java
@@ -74,7 +74,7 @@
     }
 
     public static String getTime(int platformVersion) {
-        if (isGreaterOrEqual(platformVersion, MNC)) {
+        if (isGreaterOrEqual(platformVersion, M)) {
             return "6:00";
         }
         if (platformVersion < GINGERBREAD) {
@@ -95,7 +95,7 @@
         if (platformVersion < LOLLIPOP_MR1) {
             return "5:00";
         }
-        if (platformVersion < MNC) {
+        if (platformVersion < M) {
             return "5:10";
         }
         // Should never happen.
