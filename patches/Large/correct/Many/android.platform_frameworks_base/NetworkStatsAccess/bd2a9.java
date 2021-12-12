diff --git a/services/core/java/com/android/server/net/NetworkStatsAccess.java b/services/core/java/com/android/server/net/NetworkStatsAccess.java
index 98fe770..cebc472 100644
--- a/services/core/java/com/android/server/net/NetworkStatsAccess.java
+++ b/services/core/java/com/android/server/net/NetworkStatsAccess.java
@@ -174,7 +174,7 @@
             AppOpsManager appOps = (AppOpsManager) context.getSystemService(
                     Context.APP_OPS_SERVICE);
 
-            final int mode = appOps.checkOp(AppOpsManager.OP_GET_USAGE_STATS,
+            final int mode = appOps.noteOp(AppOpsManager.OP_GET_USAGE_STATS,
                     callingUid, callingPackage);
             if (mode == AppOpsManager.MODE_DEFAULT) {
                 // The default behavior here is to check if PackageManager has given the app
