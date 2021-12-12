diff --git a/services/usage/java/com/android/server/usage/UsageStatsService.java b/services/usage/java/com/android/server/usage/UsageStatsService.java
index 64a72ee..4ba457d 100644
--- a/services/usage/java/com/android/server/usage/UsageStatsService.java
+++ b/services/usage/java/com/android/server/usage/UsageStatsService.java
@@ -1466,7 +1466,7 @@
 
         @Override
         protected void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
-            if (!DumpUtils.checkDumpPermission(getContext(), TAG, pw)) return;
+            if (!DumpUtils.checkDumpAndUsageStatsPermission(getContext(), TAG, pw)) return;
             UsageStatsService.this.dump(args, pw);
         }
 
