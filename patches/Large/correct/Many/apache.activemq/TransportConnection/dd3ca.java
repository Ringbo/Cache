diff --git a/activemq-broker/src/main/java/org/apache/activemq/broker/TransportConnection.java b/activemq-broker/src/main/java/org/apache/activemq/broker/TransportConnection.java
index 967e977..404e126 100644
--- a/activemq-broker/src/main/java/org/apache/activemq/broker/TransportConnection.java
+++ b/activemq-broker/src/main/java/org/apache/activemq/broker/TransportConnection.java
@@ -846,7 +846,7 @@
                 brokerConnectionStates.remove(info.getConnectionId());
             }
             unregisterConnectionState(info.getConnectionId());
-            LOG.warn("Failed to add Connection id={}, clientId={} due to {}", info.getConnectionId(), clientId, e);
+            LOG.warn("Failed to add Connection id={}, clientId={} due to {}", info.getConnectionId(), clientId, e.getLocalizedMessage(), e);
             //AMQ-6561 - stop for all exceptions on addConnection
             // close this down - in case the peer of this transport doesn't play nice
             delayedStop(2000, "Failed with SecurityException: " + e.getLocalizedMessage(), e);
