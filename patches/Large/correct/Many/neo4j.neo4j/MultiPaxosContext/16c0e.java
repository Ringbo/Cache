diff --git a/enterprise/cluster/src/main/java/org/neo4j/cluster/protocol/atomicbroadcast/multipaxos/MultiPaxosContext.java b/enterprise/cluster/src/main/java/org/neo4j/cluster/protocol/atomicbroadcast/multipaxos/MultiPaxosContext.java
index 3bca13b..2b21a20 100644
--- a/enterprise/cluster/src/main/java/org/neo4j/cluster/protocol/atomicbroadcast/multipaxos/MultiPaxosContext.java
+++ b/enterprise/cluster/src/main/java/org/neo4j/cluster/protocol/atomicbroadcast/multipaxos/MultiPaxosContext.java
@@ -441,8 +441,7 @@
         // Implementation
         public void created( String name )
         {
-            configuration = new ClusterConfiguration( name, logging.getMessagesLog( ClusterConfiguration.class ),
-                    Collections.singleton( boundAt ) );
+            configuration = new ClusterConfiguration( name, Collections.singleton( boundAt ) );
             joined();
         }
 
