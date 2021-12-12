diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index e1e53b3..cd132b4 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -2030,7 +2030,9 @@
                 synchronized (ActivityManagerService.this) {
                     for (int i = mLruProcesses.size() - 1 ; i >= 0 ; i--) {
                         ProcessRecord r = mLruProcesses.get(i);
-                        if (r.thread != null) {
+                        // Don't dispatch to isolated processes as they can't access
+                        // ConnectivityManager and don't have network privileges anyway.
+                        if (r.thread != null && !r.isolated) {
                             try {
                                 r.thread.setHttpProxy(host, port, exclList, pacFileUrl);
                             } catch (RemoteException ex) {
