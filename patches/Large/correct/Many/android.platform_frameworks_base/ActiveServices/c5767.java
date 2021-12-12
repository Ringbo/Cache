diff --git a/services/core/java/com/android/server/am/ActiveServices.java b/services/core/java/com/android/server/am/ActiveServices.java
index 1f537be..34d7cb3 100755
--- a/services/core/java/com/android/server/am/ActiveServices.java
+++ b/services/core/java/com/android/server/am/ActiveServices.java
@@ -2351,7 +2351,7 @@
     void serviceTimeout(ProcessRecord proc) {
         String anrMessage = null;
 
-        synchronized(this) {
+        synchronized(mAm) {
             if (proc.executingServices.size() == 0 || proc.thread == null) {
                 return;
             }
@@ -2647,7 +2647,7 @@
             int opti, boolean dumpAll) {
         ArrayList<ServiceRecord> services = new ArrayList<ServiceRecord>();
 
-        synchronized (this) {
+        synchronized (mAm) {
             int[] users = mAm.getUsersLocked();
             if ("all".equals(name)) {
                 for (int user : users) {
@@ -2721,7 +2721,7 @@
     private void dumpService(String prefix, FileDescriptor fd, PrintWriter pw,
             final ServiceRecord r, String[] args, boolean dumpAll) {
         String innerPrefix = prefix + "  ";
-        synchronized (this) {
+        synchronized (mAm) {
             pw.print(prefix); pw.print("SERVICE ");
                     pw.print(r.shortName); pw.print(" ");
                     pw.print(Integer.toHexString(System.identityHashCode(r)));
