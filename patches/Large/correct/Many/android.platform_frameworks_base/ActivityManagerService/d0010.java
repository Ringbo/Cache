diff --git a/services/java/com/android/server/am/ActivityManagerService.java b/services/java/com/android/server/am/ActivityManagerService.java
index 3b655fa..bc26fa0 100644
--- a/services/java/com/android/server/am/ActivityManagerService.java
+++ b/services/java/com/android/server/am/ActivityManagerService.java
@@ -1369,7 +1369,7 @@
                         return;
                     }
                 } else {
-                    procs = service.mLruProcesses;
+                    procs = new ArrayList<ProcessRecord>(service.mLruProcesses);
                 }
             }
             dumpApplicationMemoryUsage(fd, pw, procs, "  ", args);
@@ -10202,7 +10202,7 @@
         return numPers;
     }
 
-    private static final void dumpApplicationMemoryUsage(FileDescriptor fd,
+    static final void dumpApplicationMemoryUsage(FileDescriptor fd,
             PrintWriter pw, List list, String prefix, String[] args) {
         final boolean isCheckinRequest = scanArgs(args, "--checkin");
         long uptime = SystemClock.uptimeMillis();
