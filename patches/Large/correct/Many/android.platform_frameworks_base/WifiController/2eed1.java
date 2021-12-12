diff --git a/services/java/com/android/server/wifi/WifiController.java b/services/java/com/android/server/wifi/WifiController.java
index 10f7f5a..8e2bdaa 100644
--- a/services/java/com/android/server/wifi/WifiController.java
+++ b/services/java/com/android/server/wifi/WifiController.java
@@ -426,7 +426,7 @@
 
         private boolean doDeferEnable(Message msg) {
             long delaySoFar = SystemClock.elapsedRealtime() - mDisabledTimestamp;
-            if (delaySoFar > mReEnableDelayMillis) {
+            if (delaySoFar >= mReEnableDelayMillis) {
                 return false;
             }
 
@@ -550,7 +550,7 @@
 
         private boolean doDeferEnable(Message msg) {
             long delaySoFar = SystemClock.elapsedRealtime() - mDisabledTimestamp;
-            if (delaySoFar > mReEnableDelayMillis) {
+            if (delaySoFar >= mReEnableDelayMillis) {
                 return false;
             }
 
