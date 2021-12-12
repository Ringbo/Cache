diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/main/java/org/apache/hadoop/yarn/client/api/impl/AMRMClientImpl.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/main/java/org/apache/hadoop/yarn/client/api/impl/AMRMClientImpl.java
index b1324c1..4cf9aa0 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/main/java/org/apache/hadoop/yarn/client/api/impl/AMRMClientImpl.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/main/java/org/apache/hadoop/yarn/client/api/impl/AMRMClientImpl.java
@@ -748,7 +748,7 @@
     }
 
     if (LOG.isDebugEnabled()) {
-      LOG.info("AFTER decResourceRequest:" + " applicationId="
+      LOG.debug("AFTER decResourceRequest:" + " applicationId="
           + " priority=" + priority.getPriority()
           + " resourceName=" + resourceName + " numContainers="
           + resourceRequestInfo.remoteRequest.getNumContainers() 
