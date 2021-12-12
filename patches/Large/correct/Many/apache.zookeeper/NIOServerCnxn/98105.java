diff --git a/src/java/main/org/apache/zookeeper/server/NIOServerCnxn.java b/src/java/main/org/apache/zookeeper/server/NIOServerCnxn.java
index 7cd442f..ef94145 100644
--- a/src/java/main/org/apache/zookeeper/server/NIOServerCnxn.java
+++ b/src/java/main/org/apache/zookeeper/server/NIOServerCnxn.java
@@ -584,7 +584,7 @@
                 + " our last zxid is 0x"
                 + Long.toHexString(zk.dataTree.lastProcessedZxid);
 
-            LOG.error(msg);
+            LOG.warn(msg);
             throw new IOException(msg);
         }
         sessionTimeout = connReq.getTimeOut();
