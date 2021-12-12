diff --git a/server/process/sonar-process/src/main/java/org/sonar/process/Monitor.java b/server/process/sonar-process/src/main/java/org/sonar/process/Monitor.java
index 663fb3c..1fe64d6 100644
--- a/server/process/sonar-process/src/main/java/org/sonar/process/Monitor.java
+++ b/server/process/sonar-process/src/main/java/org/sonar/process/Monitor.java
@@ -126,7 +126,7 @@
   volatile Boolean isRunning = true;
 
   @Override
-  public void terminate() {
+  public synchronized void terminate() {
     LOGGER.debug("Monitoring thread is terminating");
 
     if (!monitorExecutionService.isShutdown()) {
