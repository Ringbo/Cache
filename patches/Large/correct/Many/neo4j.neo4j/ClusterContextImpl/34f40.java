diff --git a/enterprise/cluster/src/main/java/org/neo4j/cluster/protocol/atomicbroadcast/multipaxos/context/ClusterContextImpl.java b/enterprise/cluster/src/main/java/org/neo4j/cluster/protocol/atomicbroadcast/multipaxos/context/ClusterContextImpl.java
index 8b0f6f0..ceeb353 100644
--- a/enterprise/cluster/src/main/java/org/neo4j/cluster/protocol/atomicbroadcast/multipaxos/context/ClusterContextImpl.java
+++ b/enterprise/cluster/src/main/java/org/neo4j/cluster/protocol/atomicbroadcast/multipaxos/context/ClusterContextImpl.java
@@ -249,7 +249,7 @@
                     return;
                 }
             }
-            else if ( electorId.equals( lastElector ) && (version < electorVersion && version > 0) )
+            else if ( electorId.equals( lastElector ) && (version < electorVersion && version > 1) )
             {
                 getLogger( getClass() ).warn( "Election result for role " + roleName +
                         " received from elector instance " + electorId + " with version " + version +
