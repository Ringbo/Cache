diff --git a/services/java/com/android/server/am/ActivityManagerService.java b/services/java/com/android/server/am/ActivityManagerService.java
index 6c6cc98..aae4cb8 100644
--- a/services/java/com/android/server/am/ActivityManagerService.java
+++ b/services/java/com/android/server/am/ActivityManagerService.java
@@ -7555,7 +7555,7 @@
                         // Use existing process if already started
                         ProcessRecord proc = getProcessRecordLocked(
                                 cpi.processName, cpr.appInfo.uid, false);
-                        if (proc != null) {
+                        if (proc != null && proc.thread != null) {
                             if (DEBUG_PROVIDER) {
                                 Slog.d(TAG, "Installing in existing process " + proc);
                             }
