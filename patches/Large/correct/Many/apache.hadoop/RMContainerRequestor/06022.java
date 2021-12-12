diff --git a/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-app/src/main/java/org/apache/hadoop/mapreduce/v2/app/rm/RMContainerRequestor.java b/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-app/src/main/java/org/apache/hadoop/mapreduce/v2/app/rm/RMContainerRequestor.java
index 155711f..d612126 100644
--- a/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-app/src/main/java/org/apache/hadoop/mapreduce/v2/app/rm/RMContainerRequestor.java
+++ b/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-app/src/main/java/org/apache/hadoop/mapreduce/v2/app/rm/RMContainerRequestor.java
@@ -506,7 +506,7 @@
     addResourceRequestToAsk(remoteRequest);
 
     if (LOG.isDebugEnabled()) {
-      LOG.info("AFTER decResourceRequest:" + " applicationId="
+      LOG.debug("AFTER decResourceRequest:" + " applicationId="
           + applicationId.getId() + " priority=" + priority.getPriority()
           + " resourceName=" + resourceName + " numContainers="
           + remoteRequest.getNumContainers() + " #asks=" + ask.size());
