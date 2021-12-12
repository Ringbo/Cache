diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/ShortCircuitRegistry.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/ShortCircuitRegistry.java
index edb64dd..ea9e72c 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/ShortCircuitRegistry.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/ShortCircuitRegistry.java
@@ -114,7 +114,7 @@
 
   public synchronized void removeShm(ShortCircuitShm shm) {
     if (LOG.isTraceEnabled()) {
-      LOG.debug("removing shm " + shm);
+      LOG.trace("removing shm " + shm);
     }
     // Stop tracking the shmId.
     RegisteredShm removedShm = segments.remove(shm.getShmId());
