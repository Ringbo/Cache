diff --git a/src/java/main/org/apache/zookeeper/server/ZooKeeperServer.java b/src/java/main/org/apache/zookeeper/server/ZooKeeperServer.java
index 59fd25d..11b6981 100644
--- a/src/java/main/org/apache/zookeeper/server/ZooKeeperServer.java
+++ b/src/java/main/org/apache/zookeeper/server/ZooKeeperServer.java
@@ -506,7 +506,7 @@
         if (zkShutdownHandler != null) {
             zkShutdownHandler.handle(state);
         } else {
-            LOG.error("ZKShutdownHandler is not registered, so ZooKeeper server "
+            LOG.debug("ZKShutdownHandler is not registered, so ZooKeeper server "
                     + "won't take any action on ERROR or SHUTDOWN server state changes");
         }
     }
