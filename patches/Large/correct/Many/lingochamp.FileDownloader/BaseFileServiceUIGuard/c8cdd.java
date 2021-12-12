diff --git a/library/src/main/java/com/liulishuo/filedownloader/services/BaseFileServiceUIGuard.java b/library/src/main/java/com/liulishuo/filedownloader/services/BaseFileServiceUIGuard.java
index b6048fe..5c57616 100644
--- a/library/src/main/java/com/liulishuo/filedownloader/services/BaseFileServiceUIGuard.java
+++ b/library/src/main/java/com/liulishuo/filedownloader/services/BaseFileServiceUIGuard.java
@@ -94,7 +94,7 @@
     }
 
     private void releaseConnect(final boolean isLost) {
-        if (this.service != null) {
+        if (!isLost && this.service != null) {
             try {
                 unregisterCallback(this.service, this.callback);
             } catch (RemoteException e) {
