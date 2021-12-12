diff --git a/src/java/org/apache/cassandra/service/StorageService.java b/src/java/org/apache/cassandra/service/StorageService.java
index e6b11a4..4065c9e 100644
--- a/src/java/org/apache/cassandra/service/StorageService.java
+++ b/src/java/org/apache/cassandra/service/StorageService.java
@@ -932,7 +932,7 @@
         {
             // Dont set any state for the node which is bootstrapping the existing token...
             tokenMetadata.updateNormalTokens(tokens, FBUtilities.getBroadcastAddress());
-            SystemTable.removeEndpoint(DatabaseDescriptor.getReplaceAddress());
+            SystemKeyspace.removeEndpoint(DatabaseDescriptor.getReplaceAddress());
         }
         if (!Gossiper.instance.seenAnySeed())
             throw new IllegalStateException("Unable to contact any seeds!");
