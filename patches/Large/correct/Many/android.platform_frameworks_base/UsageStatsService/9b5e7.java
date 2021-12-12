diff --git a/services/usage/java/com/android/server/usage/UsageStatsService.java b/services/usage/java/com/android/server/usage/UsageStatsService.java
index f9fa336..1fbc27b 100644
--- a/services/usage/java/com/android/server/usage/UsageStatsService.java
+++ b/services/usage/java/com/android/server/usage/UsageStatsService.java
@@ -660,7 +660,7 @@
             if (callingUid == Process.SYSTEM_UID) {
                 return true;
             }
-            final int mode = mAppOps.noteOp(AppOpsManager.OP_GET_USAGE_STATS,
+            final int mode = mAppOps.checkOp(AppOpsManager.OP_GET_USAGE_STATS,
                     callingUid, callingPackage);
             if (mode == AppOpsManager.MODE_DEFAULT) {
                 // The default behavior here is to check if PackageManager has given the app
