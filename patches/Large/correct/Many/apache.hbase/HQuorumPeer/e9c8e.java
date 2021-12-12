diff --git a/src/java/org/apache/hadoop/hbase/zookeeper/HQuorumPeer.java b/src/java/org/apache/hadoop/hbase/zookeeper/HQuorumPeer.java
index 226e20f..c7cc69b 100644
--- a/src/java/org/apache/hadoop/hbase/zookeeper/HQuorumPeer.java
+++ b/src/java/org/apache/hadoop/hbase/zookeeper/HQuorumPeer.java
@@ -213,7 +213,7 @@
     } catch (IOException e) {
       String msg = "fail to read properties from " + ZOOKEEPER_CONFIG_NAME;
       LOG.fatal(msg);
-      throw new IOException(msg);
+      throw new IOException(msg, e);
     }
     for (Entry<Object, Object> entry : properties.entrySet()) {
       String value = entry.getValue().toString().trim();
