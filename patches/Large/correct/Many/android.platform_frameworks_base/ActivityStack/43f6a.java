diff --git a/services/core/java/com/android/server/am/ActivityStack.java b/services/core/java/com/android/server/am/ActivityStack.java
index d83a750..2393089 100644
--- a/services/core/java/com/android/server/am/ActivityStack.java
+++ b/services/core/java/com/android/server/am/ActivityStack.java
@@ -1820,7 +1820,8 @@
             boolean stackVisibleBehind, ActivityRecord visibleBehind,
             boolean behindFullscreenActivity) {
 
-        if (!okToShowLocked(r)) {
+        if (!okToShowLocked(r)
+                || (mService.isSleepingOrShuttingDown() && r.voiceSession == null)) {
             return false;
         }
 
