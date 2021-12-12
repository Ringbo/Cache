diff --git a/src/java/org/apache/cassandra/service/StorageService.java b/src/java/org/apache/cassandra/service/StorageService.java
index cd09083..22a9270 100644
--- a/src/java/org/apache/cassandra/service/StorageService.java
+++ b/src/java/org/apache/cassandra/service/StorageService.java
@@ -582,7 +582,7 @@
         // for bootstrap to get the load info it needs.
         // (we won't be part of the storage ring though until we add a counterId to our state, below.)
         // Seed the host ID-to-endpoint map with our own ID.
-        getTokenMetadata().updateHostId(SystemTable.getLocalHostId(), FBUtilities.getBroadcastAddress());
+        getTokenMetadata().updateHostId(SystemKeyspace.getLocalHostId(), FBUtilities.getBroadcastAddress());
         appStates.put(ApplicationState.NET_VERSION, valueFactory.networkVersion());
         appStates.put(ApplicationState.HOST_ID, valueFactory.hostId(SystemKeyspace.getLocalHostId()));
         appStates.put(ApplicationState.RPC_ADDRESS, valueFactory.rpcaddress(DatabaseDescriptor.getRpcAddress()));
