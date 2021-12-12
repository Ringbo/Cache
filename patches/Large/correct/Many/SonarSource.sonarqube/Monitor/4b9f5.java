diff --git a/server/sonar-process-monitor/src/main/java/org/sonar/process/monitor/Monitor.java b/server/sonar-process-monitor/src/main/java/org/sonar/process/monitor/Monitor.java
index 1f68dd5..0f9f21d 100644
--- a/server/sonar-process-monitor/src/main/java/org/sonar/process/monitor/Monitor.java
+++ b/server/sonar-process-monitor/src/main/java/org/sonar/process/monitor/Monitor.java
@@ -153,7 +153,7 @@
         monitor(processRef);
       } catch (InterruptedException | RuntimeException e) {
         if (processRef != null) {
-          LOG.info("{} failed to start", processRef);
+          LOG.error("{} failed to start", processRef);
         }
         // fail to start or to monitor
         stop();
