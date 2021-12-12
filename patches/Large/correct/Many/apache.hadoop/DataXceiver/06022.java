diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/DataXceiver.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/DataXceiver.java
index 4f6dc96..8c4e38a 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/DataXceiver.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/DataXceiver.java
@@ -752,7 +752,7 @@
             mirrorInStatus = connectAck.getStatus();
             firstBadLink = connectAck.getFirstBadLink();
             if (LOG.isDebugEnabled() || mirrorInStatus != SUCCESS) {
-              LOG.info("Datanode " + targets.length +
+              LOG.debug("Datanode " + targets.length +
                        " got response for connect ack " +
                        " from downstream datanode with firstbadlink as " +
                        firstBadLink);
@@ -791,7 +791,7 @@
       // send connect-ack to source for clients and not transfer-RBW/Finalized
       if (isClient && !isTransfer) {
         if (LOG.isDebugEnabled() || mirrorInStatus != SUCCESS) {
-          LOG.info("Datanode " + targets.length +
+          LOG.debug("Datanode " + targets.length +
                    " forwarding connect ack to upstream firstbadlink is " +
                    firstBadLink);
         }
