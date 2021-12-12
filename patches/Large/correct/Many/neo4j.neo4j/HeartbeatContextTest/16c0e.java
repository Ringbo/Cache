diff --git a/enterprise/cluster/src/test/java/org/neo4j/cluster/protocol/heartbeat/HeartbeatContextTest.java b/enterprise/cluster/src/test/java/org/neo4j/cluster/protocol/heartbeat/HeartbeatContextTest.java
index f7d0727..fb5e1f3 100644
--- a/enterprise/cluster/src/test/java/org/neo4j/cluster/protocol/heartbeat/HeartbeatContextTest.java
+++ b/enterprise/cluster/src/test/java/org/neo4j/cluster/protocol/heartbeat/HeartbeatContextTest.java
@@ -80,7 +80,7 @@
         {
             members.put( instanceIds[i], URI.create( initialHosts[i] ) );
         }
-        ClusterConfiguration config = new ClusterConfiguration( "clusterName", StringLogger.DEV_NULL, initialHosts );
+        ClusterConfiguration config = new ClusterConfiguration( "clusterName", initialHosts );
         config.setMembers( members );
 
         context = mock( ClusterContext.class );
