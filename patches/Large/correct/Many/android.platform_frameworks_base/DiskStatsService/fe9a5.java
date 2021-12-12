diff --git a/services/core/java/com/android/server/DiskStatsService.java b/services/core/java/com/android/server/DiskStatsService.java
index 7c51aa0..800081e 100644
--- a/services/core/java/com/android/server/DiskStatsService.java
+++ b/services/core/java/com/android/server/DiskStatsService.java
@@ -63,7 +63,7 @@
 
     @Override
     protected void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
-        if (!DumpUtils.checkDumpPermission(mContext, TAG, pw)) return;
+        if (!DumpUtils.checkDumpAndUsageStatsPermission(mContext, TAG, pw)) return;
 
         // Run a quick-and-dirty performance test: write 512 bytes
         byte[] junk = new byte[512];
