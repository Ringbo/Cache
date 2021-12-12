diff --git a/src/java/org/apache/cassandra/service/StorageService.java b/src/java/org/apache/cassandra/service/StorageService.java
index 137e76f..e799e47 100644
--- a/src/java/org/apache/cassandra/service/StorageService.java
+++ b/src/java/org/apache/cassandra/service/StorageService.java
@@ -618,7 +618,7 @@
             for (InetAddress endpoint: entry.getValue())
             {
                 if (endpoint.equals(FBUtilities.getLocalAddress()))
-                    rpcaddrs.add(DatabaseDescriptor.getRpcAddress().toString());
+                    rpcaddrs.add(DatabaseDescriptor.getRpcAddress().getHostAddress());
                 else
                     rpcaddrs.add(Gossiper.instance.getEndpointStateForEndpoint(endpoint).getApplicationState(ApplicationState.RPC_ADDRESS).value);
             }
