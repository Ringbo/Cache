diff --git a/enterprise/causal-clustering/src/test/java/org/neo4j/test/causalclustering/ClusterRuleIT.java b/enterprise/causal-clustering/src/test/java/org/neo4j/test/causalclustering/ClusterRuleIT.java
index 8415d0d..ca9d581 100644
--- a/enterprise/causal-clustering/src/test/java/org/neo4j/test/causalclustering/ClusterRuleIT.java
+++ b/enterprise/causal-clustering/src/test/java/org/neo4j/test/causalclustering/ClusterRuleIT.java
@@ -42,7 +42,7 @@
 public class ClusterRuleIT
 {
     private static final int NumberOfPortsUsedByCoreMember = 6;
-    private static final int NumberOfPortsUsedByReadReplica = 3;
+    private static final int NumberOfPortsUsedByReadReplica = 4;
 
     @Rule
     public final ClusterRule clusterRule = new ClusterRule( getClass() );
@@ -50,12 +50,12 @@
     @Test
     public void shouldAssignPortsToMembersAutomatically() throws Exception
     {
-        Cluster cluster = clusterRule.startCluster();
+        Cluster cluster = clusterRule.withNumberOfCoreMembers( 3 ).withNumberOfReadReplicas( 5 ).startCluster();
 
         int numberOfCoreMembers = cluster.coreMembers().size();
         assertThat( numberOfCoreMembers, is( 3 ) );
         int numberOfReadReplicas = cluster.readReplicas().size();
-        assertThat( numberOfReadReplicas, is( 3 ) );
+        assertThat( numberOfReadReplicas, is( 5 ) );
 
         Set<Integer> portsUsed = gatherPortsUsed( cluster );
 
