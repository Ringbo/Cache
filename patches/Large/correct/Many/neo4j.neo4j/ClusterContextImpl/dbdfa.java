diff --git a/enterprise/cluster/src/main/java/org/neo4j/cluster/protocol/atomicbroadcast/multipaxos/context/ClusterContextImpl.java b/enterprise/cluster/src/main/java/org/neo4j/cluster/protocol/atomicbroadcast/multipaxos/context/ClusterContextImpl.java
index 28df4b4..8e9908e 100644
--- a/enterprise/cluster/src/main/java/org/neo4j/cluster/protocol/atomicbroadcast/multipaxos/context/ClusterContextImpl.java
+++ b/enterprise/cluster/src/main/java/org/neo4j/cluster/protocol/atomicbroadcast/multipaxos/context/ClusterContextImpl.java
@@ -232,7 +232,7 @@
                     return;
                 }
             }
-            else if ( electorId.equals( lastElector ) && (version < electorVersion && version > 0)  )
+            else if ( electorId.equals( lastElector ) && (version < electorVersion && version > 1) )
             {
                 getLogger( getClass() ).warn( "Election result for role " + roleName +
                         " received from elector instance " + electorId + " with version " + version +
