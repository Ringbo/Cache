diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/erasurecode/StripedBlockReader.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/erasurecode/StripedBlockReader.java
index 8f976c2..a27de9b 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/erasurecode/StripedBlockReader.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/erasurecode/StripedBlockReader.java
@@ -122,7 +122,7 @@
           "", newConnectedPeer(block, dnAddr, blockToken, source), source,
           null, stripedReader.getCachingStrategy(), datanode.getTracer(), -1);
     } catch (IOException e) {
-      LOG.debug("Exception while creating remote block reader, datanode {}",
+      LOG.info("Exception while creating remote block reader, datanode {}",
           source, e);
       return null;
     }
