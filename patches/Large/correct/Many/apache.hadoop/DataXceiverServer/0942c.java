diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/DataXceiverServer.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/DataXceiverServer.java
index a1f766d..9bf95eb 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/DataXceiverServer.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/DataXceiverServer.java
@@ -161,7 +161,7 @@
         // DataNode can run out of memory if there is too many transfers.
         // Log the event, Sleep for 30 seconds, other transfers may complete by
         // then.
-        LOG.warn("DataNode is out of memory. Will retry in 30 seconds.", ie);
+        LOG.error("DataNode is out of memory. Will retry in 30 seconds.", ie);
         try {
           Thread.sleep(30 * 1000);
         } catch (InterruptedException e) {
