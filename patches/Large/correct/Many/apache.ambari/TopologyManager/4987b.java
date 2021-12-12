diff --git a/ambari-server/src/main/java/org/apache/ambari/server/topology/TopologyManager.java b/ambari-server/src/main/java/org/apache/ambari/server/topology/TopologyManager.java
index a75cccb..31363b4 100644
--- a/ambari-server/src/main/java/org/apache/ambari/server/topology/TopologyManager.java
+++ b/ambari-server/src/main/java/org/apache/ambari/server/topology/TopologyManager.java
@@ -117,7 +117,11 @@
     String clusterName = request.getClusterName();
     ClusterTopology topology = clusterTopologyMap.get(clusterName);
     if (topology == null) {
-      throw new AmbariException("TopologyManager: Unable to retrieve cluster topology for cluster: " + clusterName);
+      throw new InvalidTopologyException("Unable to retrieve cluster topology for cluster. This is most likely a " +
+                                         "result of trying to scale a cluster via the API which was created using " +
+                                         "the Ambari UI. At this time only clusters created via the API using a " +
+                                         "blueprint can be scaled with this API.  If the cluster was originally created " +
+                                         "via the API as described above, please file a Jira for this matter.");
     }
 
     PersistedTopologyRequest persistedRequest = persistedState.persistTopologyRequest(request);
