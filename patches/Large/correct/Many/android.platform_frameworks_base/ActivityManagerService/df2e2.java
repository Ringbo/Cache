diff --git a/services/java/com/android/server/am/ActivityManagerService.java b/services/java/com/android/server/am/ActivityManagerService.java
index 8857c5f..0c11940 100644
--- a/services/java/com/android/server/am/ActivityManagerService.java
+++ b/services/java/com/android/server/am/ActivityManagerService.java
@@ -5583,7 +5583,7 @@
 
         // See if the top visible activity is waiting to run in this process...
         HistoryRecord hr = topRunningActivityLocked(null);
-        if (hr != null) {
+        if (hr != null && normalMode) {
             if (hr.app == null && app.info.uid == hr.info.applicationInfo.uid
                     && processName.equals(hr.processName)) {
                 try {
