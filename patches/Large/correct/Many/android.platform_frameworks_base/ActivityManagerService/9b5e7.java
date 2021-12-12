diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index 2b13359..b4db6f2 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -4718,7 +4718,7 @@
     }
 
     private boolean hasUsageStatsPermission(String callingPackage) {
-        final int mode = mAppOpsService.noteOperation(AppOpsManager.OP_GET_USAGE_STATS,
+        final int mode = mAppOpsService.checkOperation(AppOpsManager.OP_GET_USAGE_STATS,
                 Binder.getCallingUid(), callingPackage);
         if (mode == AppOpsManager.MODE_DEFAULT) {
             return checkCallingPermission(Manifest.permission.PACKAGE_USAGE_STATS)
