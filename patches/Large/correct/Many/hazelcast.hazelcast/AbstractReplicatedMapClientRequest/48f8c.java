diff --git a/hazelcast/src/main/java/com/hazelcast/replicatedmap/client/AbstractReplicatedMapClientRequest.java b/hazelcast/src/main/java/com/hazelcast/replicatedmap/client/AbstractReplicatedMapClientRequest.java
index c6bcdd0..269ead7 100644
--- a/hazelcast/src/main/java/com/hazelcast/replicatedmap/client/AbstractReplicatedMapClientRequest.java
+++ b/hazelcast/src/main/java/com/hazelcast/replicatedmap/client/AbstractReplicatedMapClientRequest.java
@@ -66,7 +66,7 @@
 
     protected ReplicatedRecordStore getReplicatedRecordStore() {
         ReplicatedMapService replicatedMapService = getService();
-        return replicatedMapService.getReplicatedRecordStore(mapName, false);
+        return replicatedMapService.getReplicatedRecordStore(mapName, true);
     }
 
 }
