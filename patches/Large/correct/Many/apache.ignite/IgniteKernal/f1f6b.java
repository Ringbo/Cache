diff --git a/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java b/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java
index ad4940a..70cd56f 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java
@@ -821,7 +821,7 @@
                     updateNtfTimer = new Timer("ignite-update-notifier-timer", true);
 
                     // Setup periodic version check.
-                    updateNtfTimer.scheduleAtFixedRate(new UpdateNotifierTimerTask(this, verChecker),
+                    updateNtfTimer.scheduleAtFixedRate(new UpdateNotifierTimerTask(this, execSvc, verChecker),
                         0, PERIODIC_VER_CHECK_DELAY);
                 }
                 catch (IgniteCheckedException e) {
@@ -3199,15 +3199,15 @@
          * Constructor.
          *
          * @param kernal Kernal.
+         * @param execSvc Executor service.
          * @param verChecker Version checker.
          */
-        private UpdateNotifierTimerTask(IgniteKernal kernal, GridUpdateNotifier verChecker) {
+        private UpdateNotifierTimerTask(IgniteKernal kernal, ExecutorService execSvc, GridUpdateNotifier verChecker) {
             kernalRef = new WeakReference<>(kernal);
 
             log = kernal.log.getLogger(UpdateNotifierTimerTask.class);
 
-            execSvc = kernal.executorService();
-
+            this.execSvc = execSvc;
             this.verChecker = verChecker;
         }
 
