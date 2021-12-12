diff --git a/solr/core/src/java/org/apache/solr/cloud/Overseer.java b/solr/core/src/java/org/apache/solr/cloud/Overseer.java
index 0be295a..7f13e81 100644
--- a/solr/core/src/java/org/apache/solr/cloud/Overseer.java
+++ b/solr/core/src/java/org/apache/solr/cloud/Overseer.java
@@ -314,7 +314,7 @@
 
                 final TimerContext timerContext = stats.time(operation);
                 try {
-                  clusterState = processMessage(clusterState, message, operation, workQueue.getStats().getQueueLength());
+                  clusterState = processMessage(clusterState, message, operation, stateUpdateQueue.getStats().getQueueLength());
                   stats.success(operation);
                 } catch (Exception e) {
                   // generally there is nothing we can do - in most cases, we have
