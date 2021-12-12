diff --git a/ambari-server/src/main/java/org/apache/ambari/server/agent/HeartbeatProcessor.java b/ambari-server/src/main/java/org/apache/ambari/server/agent/HeartbeatProcessor.java
index 7e57031..955daac 100644
--- a/ambari-server/src/main/java/org/apache/ambari/server/agent/HeartbeatProcessor.java
+++ b/ambari-server/src/main/java/org/apache/ambari/server/agent/HeartbeatProcessor.java
@@ -547,7 +547,7 @@
               }
             }
 
-            LOG.warn("Operation failed - may be retried. Service component host: "
+            LOG.error("Operation failed - may be retried. Service component host: "
                 + schName + ", host: " + hostname + " Action id" + report.getActionId());
             if (actionManager.isInProgressCommand(report)) {
               scHost.handleEvent(new ServiceComponentHostOpFailedEvent
