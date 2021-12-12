diff --git a/src/java/org/apache/cassandra/service/StorageProxy.java b/src/java/org/apache/cassandra/service/StorageProxy.java
index 6834987..122d3fd 100644
--- a/src/java/org/apache/cassandra/service/StorageProxy.java
+++ b/src/java/org/apache/cassandra/service/StorageProxy.java
@@ -790,7 +790,7 @@
                 responseHandler.response(null);
 
                 // then send to replicas, if any
-                Set<InetAddress> remotes = Sets.difference(ImmutableSet.copyOf(targets), ImmutableSet.of(FBUtilities.getBroadcastAddress()));
+                final Set<InetAddress> remotes = Sets.difference(ImmutableSet.copyOf(targets), ImmutableSet.of(FBUtilities.getBroadcastAddress()));
                 if (cm.shouldReplicateOnWrite() && !remotes.isEmpty())
                 {
                     // We do the replication on another stage because it involves a read (see CM.makeReplicationMutation)
