diff --git a/src/main/java/org/apache/hadoop/hbase/zookeeper/ZKUtil.java b/src/main/java/org/apache/hadoop/hbase/zookeeper/ZKUtil.java
index 37f99a6..827073c 100644
--- a/src/main/java/org/apache/hadoop/hbase/zookeeper/ZKUtil.java
+++ b/src/main/java/org/apache/hadoop/hbase/zookeeper/ZKUtil.java
@@ -900,7 +900,7 @@
   throws KeeperException {
     try {
       ZooKeeper zk = zkw.getZooKeeper();
-      if (zk.exists(znode, false) != null) {
+      if (zk.exists(znode, false) == null) {
         zk.create(znode, new byte[0], Ids.OPEN_ACL_UNSAFE,
             CreateMode.PERSISTENT);
       }
