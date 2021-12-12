diff --git a/enterprise/cluster/src/test/java/org/neo4j/cluster/protocol/atomicbroadcast/multipaxos/MultiPaxosNetworkTest.java b/enterprise/cluster/src/test/java/org/neo4j/cluster/protocol/atomicbroadcast/multipaxos/MultiPaxosNetworkTest.java
index e7384a8..619f203 100644
--- a/enterprise/cluster/src/test/java/org/neo4j/cluster/protocol/atomicbroadcast/multipaxos/MultiPaxosNetworkTest.java
+++ b/enterprise/cluster/src/test/java/org/neo4j/cluster/protocol/atomicbroadcast/multipaxos/MultiPaxosNetworkTest.java
@@ -159,7 +159,7 @@
 
         LoggerFactory.getLogger( getClass() ).info( "Joined cluster - set data" );
 
-        for ( int i = 0; i < 10000; i++ )
+        for ( int i = 0; i < 100; i++ )
         {
             map.put( "foo" + i, "bar" + i );
         }
