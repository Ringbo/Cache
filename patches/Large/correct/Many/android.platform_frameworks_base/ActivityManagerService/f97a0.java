diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index ec54116..264a495 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -18857,7 +18857,7 @@
             for (int j = 0; j < activitiesSize; j++) {
                 final ActivityRecord r = app.activities.get(j);
                 if (r.app != app) {
-                    Log.wtf(TAG, "Found activity " + r + " in proc activity list using " + r.app
+                    Log.e(TAG, "Found activity " + r + " in proc activity list using " + r.app
                             + " instead of expected " + app);
                     if (r.app == null || (r.app.uid == app.uid)) {
                         // Only fix things up when they look sane
