diff --git a/services/core/java/com/android/server/DropBoxManagerService.java b/services/core/java/com/android/server/DropBoxManagerService.java
index 894bca3..9d3d531 100644
--- a/services/core/java/com/android/server/DropBoxManagerService.java
+++ b/services/core/java/com/android/server/DropBoxManagerService.java
@@ -351,7 +351,7 @@
     }
 
     public synchronized void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
-        if (!DumpUtils.checkDumpPermission(getContext(), TAG, pw)) return;
+        if (!DumpUtils.checkDumpAndUsageStatsPermission(getContext(), TAG, pw)) return;
 
         try {
             init();
