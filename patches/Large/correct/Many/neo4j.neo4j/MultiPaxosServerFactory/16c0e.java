diff --git a/enterprise/cluster/src/main/java/org/neo4j/cluster/MultiPaxosServerFactory.java b/enterprise/cluster/src/main/java/org/neo4j/cluster/MultiPaxosServerFactory.java
index 5cb4db0..7dc4905 100644
--- a/enterprise/cluster/src/main/java/org/neo4j/cluster/MultiPaxosServerFactory.java
+++ b/enterprise/cluster/src/main/java/org/neo4j/cluster/MultiPaxosServerFactory.java
@@ -100,7 +100,7 @@
 
         final MultiPaxosContext context = new MultiPaxosContext( me,
                 Iterables.<ElectionRole,ElectionRole>iterable( new ElectionRole(ClusterConfiguration.COORDINATOR )),
-                new ClusterConfiguration( initialConfig.getName(), logging.getMessagesLog( ClusterConfiguration.class ), initialConfig.getMemberURIs() ),executor, logging,
+                new ClusterConfiguration( initialConfig.getName(), initialConfig.getMemberURIs() ),executor, logging,
                 objectInputStreamFactory, objectOutputStreamFactory, acceptorInstanceStore, timeouts);
 
         SnapshotContext snapshotContext = new SnapshotContext( context.getClusterContext(), context.getLearnerContext() );
