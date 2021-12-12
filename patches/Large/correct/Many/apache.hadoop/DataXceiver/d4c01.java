diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/DataXceiver.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/DataXceiver.java
index f838fd9..706d93a 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/DataXceiver.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/datanode/DataXceiver.java
@@ -241,12 +241,12 @@
           LOG.info("Failed to read expected encryption handshake from client " +
               "at " + peer.getRemoteAddressString() + ". Perhaps the client " +
               "is running an older version of Hadoop which does not support " +
-              "encryption");
+              "encryption", imne);
         } else {
           LOG.info("Failed to read expected SASL data transfer protection " +
               "handshake from client at " + peer.getRemoteAddressString() + 
               ". Perhaps the client is running an older version of Hadoop " +
-              "which does not support SASL data transfer protection");
+              "which does not support SASL data transfer protection", imne);
         }
         return;
       }
