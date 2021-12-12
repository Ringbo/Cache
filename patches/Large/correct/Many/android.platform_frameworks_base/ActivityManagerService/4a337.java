diff --git a/services/java/com/android/server/am/ActivityManagerService.java b/services/java/com/android/server/am/ActivityManagerService.java
index 0f8d151..dceacb5 100644
--- a/services/java/com/android/server/am/ActivityManagerService.java
+++ b/services/java/com/android/server/am/ActivityManagerService.java
@@ -11049,7 +11049,7 @@
                     updateOomAdjLocked(r.app);
                 }
                 int flags = 0;
-                if (si.deliveryCount > 0) {
+                if (si.deliveryCount > 1) {
                     flags |= Service.START_FLAG_RETRY;
                 }
                 if (si.doneExecutingCount > 0) {
