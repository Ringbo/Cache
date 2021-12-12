diff --git a/enterprise/cluster/src/main/java/org/neo4j/cluster/MultiPaxosServerFactory.java b/enterprise/cluster/src/main/java/org/neo4j/cluster/MultiPaxosServerFactory.java
index 0d2975a..0ee636c 100644
--- a/enterprise/cluster/src/main/java/org/neo4j/cluster/MultiPaxosServerFactory.java
+++ b/enterprise/cluster/src/main/java/org/neo4j/cluster/MultiPaxosServerFactory.java
@@ -176,7 +176,7 @@
                 .getOutgoing() ) );
 
         context.getHeartbeatContext().addHeartbeatListener( new HeartbeatReelectionListener(
-                server.newClient( Election.class ), logging.getMessagesLog( ClusterLeaveReelectionListener.class ) ) );
+                server.newClient( Election.class ), logging.getMessagesLog( HeartbeatReelectionListener.class ) ) );
         context.getClusterContext().addClusterListener( new ClusterLeaveReelectionListener( server.newClient(
                 Election.class ),
                 logging.getMessagesLog( ClusterLeaveReelectionListener.class )
