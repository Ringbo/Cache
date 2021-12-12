diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java b/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java
index 98bc0b6..c33dc62 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/connection/nio/ClientConnectionManagerImpl.java
@@ -327,11 +327,11 @@
             throw new IOException("Address is required!");
         }
 
-        ClientConnection clientConnection = connections.get(address);
+        ClientConnection clientConnection = connections.get(target);
         if (clientConnection == null) {
-            final Object lock = getLock(address);
+            final Object lock = getLock(target);
             synchronized (lock) {
-                clientConnection = connections.get(address);
+                clientConnection = connections.get(target);
                 if (clientConnection == null) {
                     final ConnectionProcessor connectionProcessor = new ConnectionProcessor(address, authenticator, false);
                     final ICompletableFuture<ClientConnection> future = executionService.submitInternal(connectionProcessor);
@@ -341,7 +341,7 @@
                         future.cancel(true);
                         throw ExceptionUtil.rethrow(e, IOException.class);
                     }
-                    ClientConnection current = connections.putIfAbsent(address, clientConnection);
+                    ClientConnection current = connections.putIfAbsent(clientConnection.getRemoteEndpoint(), clientConnection);
                     if (current != null) {
                         clientConnection.close();
                         clientConnection = current;
