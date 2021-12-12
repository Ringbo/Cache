diff --git a/services/core/java/com/android/server/job/JobSchedulerService.java b/services/core/java/com/android/server/job/JobSchedulerService.java
index 5e05738..7c231ff 100644
--- a/services/core/java/com/android/server/job/JobSchedulerService.java
+++ b/services/core/java/com/android/server/job/JobSchedulerService.java
@@ -1791,7 +1791,7 @@
          */
         @Override
         public void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
-            if (!DumpUtils.checkDumpPermission(getContext(), TAG, pw)) return;
+            if (!DumpUtils.checkDumpAndUsageStatsPermission(getContext(), TAG, pw)) return;
 
             long identityToken = Binder.clearCallingIdentity();
             try {
