diff --git a/source/com/intellij/openapi/vfs/newvfs/RefreshQueueImpl.java b/source/com/intellij/openapi/vfs/newvfs/RefreshQueueImpl.java
index 4456573..2e6d0ee 100644
--- a/source/com/intellij/openapi/vfs/newvfs/RefreshQueueImpl.java
+++ b/source/com/intellij/openapi/vfs/newvfs/RefreshQueueImpl.java
@@ -34,12 +34,12 @@
     else {
       final Application app = ApplicationManager.getApplication();
       boolean isEDT = app.isDispatchThread();
-      if (isEDT) {
+      if (isEDT || app.isWriteAccessAllowed()) {
         session.scan();
         session.fireEvents();
       }
       else {
-        if (app.isReadAccessAllowed() && !app.isWriteAccessAllowed()) {
+        if (app.isReadAccessAllowed()) {
           LOG.error("Do not call synchronous refresh from inside read action except for event dispatch thread. This will eventually cause deadlock if there are events to fire");
           return;
         }
