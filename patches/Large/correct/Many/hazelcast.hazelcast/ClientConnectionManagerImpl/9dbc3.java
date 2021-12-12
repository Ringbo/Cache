diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java b/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java
index 8624579..70a2bf2 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java
@@ -451,7 +451,7 @@
                                 logger.warning("Error receiving heartbeat for connection: " + connection, t);
                             }
                         }
-                    });
+                    }, executionService.getInternalExecutor());
                 } else {
                     if (!connection.isHeartBeating()) {
                         logger.warning("Heartbeat is back to healthy for connection : " + connection);
