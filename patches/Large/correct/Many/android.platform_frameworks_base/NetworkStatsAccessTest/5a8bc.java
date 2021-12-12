diff --git a/tests/net/java/com/android/server/net/NetworkStatsAccessTest.java b/tests/net/java/com/android/server/net/NetworkStatsAccessTest.java
index b870bbd..23318c2 100644
--- a/tests/net/java/com/android/server/net/NetworkStatsAccessTest.java
+++ b/tests/net/java/com/android/server/net/NetworkStatsAccessTest.java
@@ -176,7 +176,7 @@
     }
 
     private void setHasAppOpsPermission(int appOpsMode, boolean hasPermission) {
-        when(mAppOps.noteOp(AppOpsManager.OP_GET_USAGE_STATS, TEST_UID, TEST_PKG))
+        when(mAppOps.checkOp(AppOpsManager.OP_GET_USAGE_STATS, TEST_UID, TEST_PKG))
                 .thenReturn(appOpsMode);
         when(mContext.checkCallingPermission(Manifest.permission.PACKAGE_USAGE_STATS)).thenReturn(
                 hasPermission ? PackageManager.PERMISSION_GRANTED
