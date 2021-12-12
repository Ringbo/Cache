diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/zookeeper/RecoverableZooKeeper.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/zookeeper/RecoverableZooKeeper.java
index 9b68c5c..4b355f7 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/zookeeper/RecoverableZooKeeper.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/zookeeper/RecoverableZooKeeper.java
@@ -441,7 +441,7 @@
                   Bytes.toStringBinary(data));
               throw e;
             }
-            LOG.error("Node " + path + " already exists and this is not a " +
+            LOG.info("Node " + path + " already exists and this is not a " +
                 "retry");
             throw e;
 
