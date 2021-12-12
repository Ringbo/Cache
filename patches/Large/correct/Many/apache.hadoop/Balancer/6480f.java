diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/balancer/Balancer.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/balancer/Balancer.java
index 8061b05..a936901 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/balancer/Balancer.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/balancer/Balancer.java
@@ -696,7 +696,7 @@
             // update locations
             for (String datanodeUuid : blk.getDatanodeUuids()) {
               final BalancerDatanode d = datanodeMap.get(datanodeUuid);
-              if (datanode != null) { // not an unknown datanode
+              if (d != null) { // not an unknown datanode
                 block.addLocation(d);
               }
             }
