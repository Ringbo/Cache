diff --git a/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-app/src/main/java/org/apache/hadoop/mapreduce/v2/app/rm/RMContainerAllocator.java b/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-app/src/main/java/org/apache/hadoop/mapreduce/v2/app/rm/RMContainerAllocator.java
index 78b0dc4..74a2753 100644
--- a/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-app/src/main/java/org/apache/hadoop/mapreduce/v2/app/rm/RMContainerAllocator.java
+++ b/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-app/src/main/java/org/apache/hadoop/mapreduce/v2/app/rm/RMContainerAllocator.java
@@ -1122,7 +1122,7 @@
       assignedRequests.add(allocated, assigned.attemptID);
 
       if (LOG.isDebugEnabled()) {
-        LOG.info("Assigned container (" + allocated + ") "
+        LOG.debug("Assigned container (" + allocated + ") "
             + " to task " + assigned.attemptID + " on node "
             + allocated.getNodeId().toString());
       }
