diff --git a/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/discovery/HazelcastCoreTopologyService.java b/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/discovery/HazelcastCoreTopologyService.java
index d662923..a95fc42 100644
--- a/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/discovery/HazelcastCoreTopologyService.java
+++ b/enterprise/causal-clustering/src/main/java/org/neo4j/causalclustering/discovery/HazelcastCoreTopologyService.java
@@ -95,7 +95,7 @@
     private Thread startingThread;
     private volatile boolean stopped;
 
-    HazelcastCoreTopologyService( Config config, MemberId myself, JobScheduler jobScheduler,
+    public HazelcastCoreTopologyService( Config config, MemberId myself, JobScheduler jobScheduler,
             LogProvider logProvider, LogProvider userLogProvider, HostnameResolver hostnameResolver,
             TopologyServiceRetryStrategy topologyServiceRetryStrategy )
     {
