diff --git a/services/core/java/com/android/server/am/ActivityRecord.java b/services/core/java/com/android/server/am/ActivityRecord.java
index 8eea00f..2651ef5 100755
--- a/services/core/java/com/android/server/am/ActivityRecord.java
+++ b/services/core/java/com/android/server/am/ActivityRecord.java
@@ -513,7 +513,7 @@
         configDestroy = false;
         keysPaused = false;
         inHistory = false;
-        visible = true;
+        visible = false;
         nowVisible = false;
         idle = false;
         hasBeenLaunched = false;
