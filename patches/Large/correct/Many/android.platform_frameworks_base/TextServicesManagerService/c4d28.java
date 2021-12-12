diff --git a/services/core/java/com/android/server/TextServicesManagerService.java b/services/core/java/com/android/server/TextServicesManagerService.java
index 7cd3406..39fc019 100644
--- a/services/core/java/com/android/server/TextServicesManagerService.java
+++ b/services/core/java/com/android/server/TextServicesManagerService.java
@@ -701,7 +701,8 @@
     protected void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
         if (!DumpUtils.checkDumpPermission(mContext, TAG, pw)) return;
 
-        if (args.length == 0) {  // Dump all users' data
+        if (args.length == 0 || (args.length == 1 && args[0].equals("-a"))) {
+            // Dump all users' data
             synchronized (mLock) {
                 pw.println("Current Text Services Manager state:");
                 pw.println("  Users:");
