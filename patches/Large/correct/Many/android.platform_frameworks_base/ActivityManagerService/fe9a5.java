diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index 8282b94..c27fa1b 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -2657,7 +2657,7 @@
 
         @Override
         protected void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
-            if (!DumpUtils.checkDumpPermission(mActivityManagerService.mContext,
+            if (!DumpUtils.checkDumpAndUsageStatsPermission(mActivityManagerService.mContext,
                     "meminfo", pw)) return;
             mActivityManagerService.dumpApplicationMemoryUsage(fd, pw, "  ", args, false, null);
         }
@@ -2671,7 +2671,7 @@
 
         @Override
         protected void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
-            if (!DumpUtils.checkDumpPermission(mActivityManagerService.mContext,
+            if (!DumpUtils.checkDumpAndUsageStatsPermission(mActivityManagerService.mContext,
                     "gfxinfo", pw)) return;
             mActivityManagerService.dumpGraphicsHardwareUsage(fd, pw, args);
         }
@@ -2685,7 +2685,7 @@
 
         @Override
         protected void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
-            if (!DumpUtils.checkDumpPermission(mActivityManagerService.mContext,
+            if (!DumpUtils.checkDumpAndUsageStatsPermission(mActivityManagerService.mContext,
                     "dbinfo", pw)) return;
             mActivityManagerService.dumpDbInfo(fd, pw, args);
         }
@@ -2699,7 +2699,7 @@
 
         @Override
         protected void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
-            if (!DumpUtils.checkDumpPermission(mActivityManagerService.mContext,
+            if (!DumpUtils.checkDumpAndUsageStatsPermission(mActivityManagerService.mContext,
                     "cpuinfo", pw)) return;
             synchronized (mActivityManagerService.mProcessCpuTracker) {
                 pw.print(mActivityManagerService.mProcessCpuTracker.printCurrentLoad());
@@ -14735,7 +14735,7 @@
 
     @Override
     protected void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
-        if (!DumpUtils.checkDumpPermission(mContext, TAG, pw)) return;
+        if (!DumpUtils.checkDumpAndUsageStatsPermission(mContext, TAG, pw)) return;
 
         boolean dumpAll = false;
         boolean dumpClient = false;
