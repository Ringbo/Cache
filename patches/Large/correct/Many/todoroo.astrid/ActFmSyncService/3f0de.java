diff --git a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncService.java b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncService.java
index b229618..f27f0f0 100644
--- a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncService.java
+++ b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncService.java
@@ -117,7 +117,7 @@
     private Thread pushRetryThread = null;
     private Runnable pushRetryRunnable;
     private final AtomicInteger taskPushThreads = new AtomicInteger(0);
-    private final ConditionVariable waitUntilEmpty = new ConditionVariable();
+    private final ConditionVariable waitUntilEmpty = new ConditionVariable(true);
 
     public void initialize() {
         initializeRetryRunnable();
@@ -1099,7 +1099,7 @@
 
                 } catch (IOException e) {
                     if (handler != null)
-                        handler.handleException("io-exception-list-" + model, e, e.getMessage());
+                        handler.handleException("io-exception-list-" + model, e, e.toString());
                     else
                         handleException("io-exception-list-" + model, e);
                 } catch (JSONException e) {
