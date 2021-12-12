diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index 7656453..5f8e6cf 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -20591,8 +20591,7 @@
             BroadcastFilter bf = new BroadcastFilter(filter, rl, callerPackage,
                     permission, callingUid, userId, instantApp, visibleToInstantApps);
             if (rl.containsFilter(filter)) {
-                // STOPSHIP: To track if apps are doing this a lot for b/70677313. Change to Slog.w
-                Slog.wtf(TAG, "Receiver with filter " + filter
+                Slog.w(TAG, "Receiver with filter " + filter
                         + " already registered for pid " + rl.pid
                         + ", callerPackage is " + callerPackage);
             } else {
