diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index fd8998b..7eb4f36 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -15209,7 +15209,17 @@
                 Binder.getCallingUid(),
                 eventType,
                 processName,
-                Binder.getCallingPid());
+                Binder.getCallingPid(),
+                (r != null && r.info != null) ? r.info.packageName : "",
+                (r != null && r.info != null) ? (r.info.isInstantApp()
+                        ? StatsLog.APP_CRASH_OCCURRED__IS_INSTANT_APP__TRUE
+                        : StatsLog.APP_CRASH_OCCURRED__IS_INSTANT_APP__FALSE)
+                        : StatsLog.APP_CRASH_OCCURRED__IS_INSTANT_APP__UNAVAILABLE,
+                r != null ? (r.isInterestingToUserLocked()
+                        ? StatsLog.APP_CRASH_OCCURRED__FOREGROUND_STATE__FOREGROUND
+                        : StatsLog.APP_CRASH_OCCURRED__FOREGROUND_STATE__BACKGROUND)
+                        : StatsLog.APP_CRASH_OCCURRED__FOREGROUND_STATE__UNKNOWN
+        );
 
         addErrorToDropBox(eventType, r, processName, null, null, null, null, null, crashInfo);
 
