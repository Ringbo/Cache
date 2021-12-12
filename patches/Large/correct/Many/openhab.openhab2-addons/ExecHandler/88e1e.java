diff --git a/addons/binding/org.openhab.binding.exec/src/main/java/org/openhab/binding/exec/handler/ExecHandler.java b/addons/binding/org.openhab.binding.exec/src/main/java/org/openhab/binding/exec/handler/ExecHandler.java
index 1933dd4..cd5b1e6 100644
--- a/addons/binding/org.openhab.binding.exec/src/main/java/org/openhab/binding/exec/handler/ExecHandler.java
+++ b/addons/binding/org.openhab.binding.exec/src/main/java/org/openhab/binding/exec/handler/ExecHandler.java
@@ -100,7 +100,7 @@
     public void initialize() {
 
         if (executionJob == null || executionJob.isCancelled()) {
-            if (((BigDecimal) getConfig().get(INTERVAL)) != null) {
+            if (((BigDecimal) getConfig().get(INTERVAL)) != null && ((BigDecimal) getConfig().get(INTERVAL)).intValue() > 0) {
                 int polling_interval = ((BigDecimal) getConfig().get(INTERVAL)).intValue();
                 executionJob = scheduler.scheduleWithFixedDelay(periodicExecutionRunnable, 0, polling_interval,
                         TimeUnit.SECONDS);
