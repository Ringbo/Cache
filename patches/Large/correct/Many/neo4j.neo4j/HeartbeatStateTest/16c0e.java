diff --git a/enterprise/cluster/src/test/java/org/neo4j/cluster/protocol/heartbeat/HeartbeatStateTest.java b/enterprise/cluster/src/test/java/org/neo4j/cluster/protocol/heartbeat/HeartbeatStateTest.java
index f41bc41..0209f82 100644
--- a/enterprise/cluster/src/test/java/org/neo4j/cluster/protocol/heartbeat/HeartbeatStateTest.java
+++ b/enterprise/cluster/src/test/java/org/neo4j/cluster/protocol/heartbeat/HeartbeatStateTest.java
@@ -55,8 +55,7 @@
         // Given
         InstanceId instanceId = new InstanceId( 1 );
         HeartbeatState heartbeat= HeartbeatState.heartbeat;
-        ClusterConfiguration configuration = new ClusterConfiguration("whatever", StringLogger.DEV_NULL,
-                                                                       "cluster://1", "cluster://2" );
+        ClusterConfiguration configuration = new ClusterConfiguration("whatever", "cluster://1", "cluster://2" );
         configuration.joined( instanceId, URI.create("cluster://1" ) );
         configuration.joined( new InstanceId( 2 ), URI.create("cluster://2" ));
 
@@ -88,8 +87,7 @@
         InstanceId myId = new InstanceId( 1 );
         InstanceId foreignId = new InstanceId( 3 );
         HeartbeatState heartbeat= HeartbeatState.heartbeat;
-        ClusterConfiguration configuration = new ClusterConfiguration("whatever", StringLogger.DEV_NULL,
-                                                                      "cluster://1", "cluster://2" );
+        ClusterConfiguration configuration = new ClusterConfiguration("whatever", "cluster://1", "cluster://2" );
         configuration.joined( myId, URI.create("cluster://1" ) );
         configuration.joined( new InstanceId( 2 ), URI.create("cluster://2" ));
 
