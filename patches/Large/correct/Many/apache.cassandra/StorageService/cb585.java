diff --git a/src/java/org/apache/cassandra/service/StorageService.java b/src/java/org/apache/cassandra/service/StorageService.java
index 4489f59..e4e03a2 100644
--- a/src/java/org/apache/cassandra/service/StorageService.java
+++ b/src/java/org/apache/cassandra/service/StorageService.java
@@ -402,7 +402,7 @@
         {
             throw new RuntimeException(e);
         }
-        SystemTable.setLocalHostId(hostId); // use the replacee's host Id as our own so we receive hints, etc
+        SystemKeyspace.setLocalHostId(hostId); // use the replacee's host Id as our own so we receive hints, etc
         MessagingService.instance().shutdown();
         Gossiper.instance.resetEndpointStateMap(); // clean up since we have what we need
         return tokens;
