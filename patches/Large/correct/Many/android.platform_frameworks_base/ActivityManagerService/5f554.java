diff --git a/services/java/com/android/server/am/ActivityManagerService.java b/services/java/com/android/server/am/ActivityManagerService.java
index 0514c79..cb2ae73 100644
--- a/services/java/com/android/server/am/ActivityManagerService.java
+++ b/services/java/com/android/server/am/ActivityManagerService.java
@@ -6053,7 +6053,7 @@
                     && (mHomeProcess.info.flags & ApplicationInfo.FLAG_SYSTEM) == 0) {
             Iterator it = mHomeProcess.activities.iterator();
             while (it.hasNext()) {
-                HistoryRecord r = (HistoryRecord)it.next();
+                ActivityRecord r = (ActivityRecord)it.next();
                 if (r.isHomeActivity) {
                     Log.i(TAG, "Clearing package preferred activities from " + r.packageName);
                     try {
