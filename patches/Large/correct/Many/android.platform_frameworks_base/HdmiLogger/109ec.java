diff --git a/services/core/java/com/android/server/hdmi/HdmiLogger.java b/services/core/java/com/android/server/hdmi/HdmiLogger.java
index 7f6971f..0b201710 100644
--- a/services/core/java/com/android/server/hdmi/HdmiLogger.java
+++ b/services/core/java/com/android/server/hdmi/HdmiLogger.java
@@ -83,7 +83,7 @@
     }
 
     private void debugInternal(String logMessage) {
-        if (IS_USER_BUILD) {
+        if (true || IS_USER_BUILD) {
             return;
         }
         Slog.d(TAG, logMessage);
