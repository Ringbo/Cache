diff --git a/services/core/java/com/android/server/GraphicsStatsService.java b/services/core/java/com/android/server/GraphicsStatsService.java
index 7283dec..d3f77b6 100644
--- a/services/core/java/com/android/server/GraphicsStatsService.java
+++ b/services/core/java/com/android/server/GraphicsStatsService.java
@@ -347,7 +347,7 @@
 
     @Override
     protected void dump(FileDescriptor fd, PrintWriter fout, String[] args) {
-        if (!DumpUtils.checkDumpPermission(mContext, TAG, fout)) return;
+        if (!DumpUtils.checkDumpAndUsageStatsPermission(mContext, TAG, fout)) return;
         boolean dumpProto = false;
         for (String str : args) {
             if ("--proto".equals(str)) {
