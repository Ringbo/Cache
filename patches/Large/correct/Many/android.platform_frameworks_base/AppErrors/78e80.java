diff --git a/services/core/java/com/android/server/am/AppErrors.java b/services/core/java/com/android/server/am/AppErrors.java
index 7ee20fa..d5bb7ed 100644
--- a/services/core/java/com/android/server/am/AppErrors.java
+++ b/services/core/java/com/android/server/am/AppErrors.java
@@ -1041,7 +1041,15 @@
         }
 
         StatsLog.write(StatsLog.ANR_OCCURRED, app.uid, app.processName,
-                activity == null ? "unknown": activity.shortComponentName, annotation);
+                activity == null ? "unknown": activity.shortComponentName, annotation,
+                (app.info != null) ? (app.info.isInstantApp()
+                        ? StatsLog.ANROCCURRED__IS_INSTANT_APP__TRUE
+                        : StatsLog.ANROCCURRED__IS_INSTANT_APP__FALSE)
+                        : StatsLog.ANROCCURRED__IS_INSTANT_APP__UNAVAILABLE,
+                app != null ? (app.isInterestingToUserLocked()
+                        ? StatsLog.ANROCCURRED__FOREGROUND_STATE__FOREGROUND
+                        : StatsLog.ANROCCURRED__FOREGROUND_STATE__BACKGROUND)
+                        : StatsLog.ANROCCURRED__FOREGROUND_STATE__UNKNOWN);
         mService.addErrorToDropBox("anr", app, app.processName, activity, parent, annotation,
                 cpuInfo, tracesFile, null);
 
