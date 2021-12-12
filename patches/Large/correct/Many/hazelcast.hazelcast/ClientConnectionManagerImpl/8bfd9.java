diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java b/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java
index 94def6f..c9fdacf 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java
@@ -458,7 +458,7 @@
                                 logger.warning("Error receiving heartbeat for connection: " + connection, t);
                             }
                         }
-                    });
+                    }, executionService.getInternalExecutor());
                 } else {
                     if (!connection.isHeartBeating()) {
                         logger.warning("Heartbeat is back to healthy for connection : " + connection);
