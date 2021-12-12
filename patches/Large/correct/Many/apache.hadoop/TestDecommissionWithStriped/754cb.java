diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestDecommissionWithStriped.java b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestDecommissionWithStriped.java
index d223354..b532443 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestDecommissionWithStriped.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/TestDecommissionWithStriped.java
@@ -252,7 +252,7 @@
     Thread.sleep(3000); // grace period to trigger decommissioning call
     // start datanode so that decommissioning live node will be finished
     for (DataNodeProperties dnp : stoppedDns) {
-      cluster.restartDataNode(dnp, true);
+      cluster.restartDataNode(dnp);
       LOG.info("Restarts stopped datanode:{} to trigger block reconstruction",
           dnp.datanode);
     }
