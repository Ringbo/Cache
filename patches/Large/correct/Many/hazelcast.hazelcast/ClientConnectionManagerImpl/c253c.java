diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java b/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java
index 7209ac1..d7a2f34 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java
@@ -423,7 +423,7 @@
                 }
                 try {
                     initializeConnection(remoteAddress, authenticator);
-                } catch (IOException e) {
+                } catch (Exception e) {
                     LOGGER.finest(e);
                 } finally {
                     connectionsInProgress.remove(target);
