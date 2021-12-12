diff --git a/archaius-core/src/main/java/com/netflix/config/DynamicConfiguration.java b/archaius-core/src/main/java/com/netflix/config/DynamicConfiguration.java
index 08a4cf6..43229e9 100644
--- a/archaius-core/src/main/java/com/netflix/config/DynamicConfiguration.java
+++ b/archaius-core/src/main/java/com/netflix/config/DynamicConfiguration.java
@@ -55,7 +55,7 @@
      * @param scheduler AbstractPollingScheduler whose {@link AbstractPollingScheduler#schedule(Runnable)} will be
      *                  used to determine the polling schedule
      */
-    public void startPolling(PolledConfigurationSource source, AbstractPollingScheduler scheduler) {
+    public synchronized void startPolling(PolledConfigurationSource source, AbstractPollingScheduler scheduler) {
         this.scheduler = scheduler;
         this.source = source;
         init(source, scheduler);
