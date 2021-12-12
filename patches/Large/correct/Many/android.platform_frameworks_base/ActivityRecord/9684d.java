diff --git a/services/core/java/com/android/server/am/ActivityRecord.java b/services/core/java/com/android/server/am/ActivityRecord.java
index 5c57be2..f13dad7 100644
--- a/services/core/java/com/android/server/am/ActivityRecord.java
+++ b/services/core/java/com/android/server/am/ActivityRecord.java
@@ -2180,7 +2180,7 @@
 
     void setRequestedOrientation(int requestedOrientation) {
         if (ActivityInfo.isFixedOrientation(requestedOrientation) && !fullscreen
-                && appInfo.targetSdkVersion >= O) {
+                && appInfo.targetSdkVersion > O) {
             throw new IllegalStateException("Only fullscreen activities can request orientation");
         }
 
