diff --git a/zookeeper/java/src/com/yahoo/zookeeper/server/quorum/QuorumPeer.java b/zookeeper/java/src/com/yahoo/zookeeper/server/quorum/QuorumPeer.java
index cf242b5..2462e33 100644
--- a/zookeeper/java/src/com/yahoo/zookeeper/server/quorum/QuorumPeer.java
+++ b/zookeeper/java/src/com/yahoo/zookeeper/server/quorum/QuorumPeer.java
@@ -505,7 +505,7 @@
                 self.join();
             } else {
                 int port = clientPort;
-                ZooKeeperServer zk = new ZooKeeperServer(dataDir, dataLogDir);
+                ZooKeeperServer zk = new ZooKeeperServer(dataDir, dataLogDir, tickTime);
                 zk.startup();
                 NIOServerCnxn.Factory t = new NIOServerCnxn.Factory(port);
                 t.setZooKeeperServer(zk);
