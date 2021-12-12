diff --git a/services/core/java/com/android/server/AppOpsService.java b/services/core/java/com/android/server/AppOpsService.java
index 422fe35..dcf6fd7 100644
--- a/services/core/java/com/android/server/AppOpsService.java
+++ b/services/core/java/com/android/server/AppOpsService.java
@@ -2029,7 +2029,7 @@
 
     @Override
     protected void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
-        if (!DumpUtils.checkDumpPermission(mContext, TAG, pw)) return;
+        if (!DumpUtils.checkDumpAndUsageStatsPermission(mContext, TAG, pw)) return;
 
         if (args != null) {
             for (int i=0; i<args.length; i++) {
