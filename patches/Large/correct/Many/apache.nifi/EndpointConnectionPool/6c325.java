diff --git a/nifi/nifi-commons/nifi-site-to-site-client/src/main/java/org/apache/nifi/remote/client/socket/EndpointConnectionPool.java b/nifi/nifi-commons/nifi-site-to-site-client/src/main/java/org/apache/nifi/remote/client/socket/EndpointConnectionPool.java
index 36d8bac..b162b3f 100644
--- a/nifi/nifi-commons/nifi-site-to-site-client/src/main/java/org/apache/nifi/remote/client/socket/EndpointConnectionPool.java
+++ b/nifi/nifi-commons/nifi-site-to-site-client/src/main/java/org/apache/nifi/remote/client/socket/EndpointConnectionPool.java
@@ -258,7 +258,7 @@
         }
 
         final PeerDescription peerDescription = peerStatus.getPeerDescription();
-        BlockingQueue<EndpointConnection> connectionQueue = connectionQueueMap.get(peerStatus);
+        BlockingQueue<EndpointConnection> connectionQueue = connectionQueueMap.get(peerDescription);
         if (connectionQueue == null) {
             connectionQueue = new LinkedBlockingQueue<>();
             BlockingQueue<EndpointConnection> existing = connectionQueueMap.putIfAbsent(peerDescription, connectionQueue);
