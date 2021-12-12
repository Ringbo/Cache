diff --git a/hazelcast/src/main/java/com/hazelcast/replicatedmap/ReplicatedMapService.java b/hazelcast/src/main/java/com/hazelcast/replicatedmap/ReplicatedMapService.java
index 9461750..9cc3fd8 100644
--- a/hazelcast/src/main/java/com/hazelcast/replicatedmap/ReplicatedMapService.java
+++ b/hazelcast/src/main/java/com/hazelcast/replicatedmap/ReplicatedMapService.java
@@ -37,7 +37,7 @@
 
 public class ReplicatedMapService implements ManagedService, RemoteService,
         PostJoinAwareService, SplitBrainHandlerService,
-        EventPublishingService<ReplicationMessage, ReplicatedMessageListener>{
+        EventPublishingService<IdentifiedDataSerializable, ReplicatedMessageListener>{
 
     public static final String SERVICE_NAME = "hz:impl:replicatedMapService";
     public static final String EVENT_TOPIC_NAME = SERVICE_NAME + ".replication";
@@ -140,7 +140,7 @@
     }
 
     @Override
-    public void dispatchEvent(ReplicationMessage event, ReplicatedMessageListener listener) {
+    public void dispatchEvent(IdentifiedDataSerializable event, ReplicatedMessageListener listener) {
         listener.onMessage(event);
     }
 
