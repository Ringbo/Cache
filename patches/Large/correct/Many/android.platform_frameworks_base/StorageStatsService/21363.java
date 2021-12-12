diff --git a/services/usage/java/com/android/server/usage/StorageStatsService.java b/services/usage/java/com/android/server/usage/StorageStatsService.java
index 2fec20a..9934514 100644
--- a/services/usage/java/com/android/server/usage/StorageStatsService.java
+++ b/services/usage/java/com/android/server/usage/StorageStatsService.java
@@ -138,7 +138,7 @@
     }
 
     private void enforcePermission(int callingUid, String callingPackage) {
-        final int mode = mAppOps.checkOp(AppOpsManager.OP_GET_USAGE_STATS,
+        final int mode = mAppOps.noteOp(AppOpsManager.OP_GET_USAGE_STATS,
                 callingUid, callingPackage);
         switch (mode) {
             case AppOpsManager.MODE_ALLOWED:
