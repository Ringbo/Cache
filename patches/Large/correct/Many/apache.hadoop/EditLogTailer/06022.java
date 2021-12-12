diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/ha/EditLogTailer.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/ha/EditLogTailer.java
index cfca77c..59f90a6 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/ha/EditLogTailer.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/server/namenode/ha/EditLogTailer.java
@@ -260,7 +260,7 @@
         throw elie;
       } finally {
         if (editsLoaded > 0 || LOG.isDebugEnabled()) {
-          LOG.info(String.format("Loaded %d edits starting from txid %d ",
+          LOG.debug(String.format("Loaded %d edits starting from txid %d ",
               editsLoaded, lastTxnId));
         }
       }
