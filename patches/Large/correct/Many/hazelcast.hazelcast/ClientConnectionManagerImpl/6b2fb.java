diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java b/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java
index e7c293b..fc21382 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java
@@ -424,7 +424,7 @@
                 }
                 try {
                     initializeConnection(remoteAddress, authenticator);
-                } catch (IOException e) {
+                } catch (Exception e) {
                     logger.finest(e);
                 } finally {
                     connectionsInProgress.remove(target);
