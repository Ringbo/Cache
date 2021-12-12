diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index 072249f..1506524 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -5337,7 +5337,8 @@
                             // We don't kill persistent processes.
                             continue;
                         }
-                        if (targetSdkVersion > 0 && app.info.targetSdkVersion < targetSdkVersion) {
+                        if (targetSdkVersion > 0
+                                && app.info.targetSdkVersion >= targetSdkVersion) {
                             continue;
                         }
                         if (app.removed) {
