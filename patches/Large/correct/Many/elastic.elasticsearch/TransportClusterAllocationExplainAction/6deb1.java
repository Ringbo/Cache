diff --git a/core/src/main/java/org/elasticsearch/action/admin/cluster/allocation/TransportClusterAllocationExplainAction.java b/core/src/main/java/org/elasticsearch/action/admin/cluster/allocation/TransportClusterAllocationExplainAction.java
index 4d4796a..77d4b24 100644
--- a/core/src/main/java/org/elasticsearch/action/admin/cluster/allocation/TransportClusterAllocationExplainAction.java
+++ b/core/src/main/java/org/elasticsearch/action/admin/cluster/allocation/TransportClusterAllocationExplainAction.java
@@ -139,7 +139,7 @@
                 foundShard = ui.next();
             }
             if (foundShard == null) {
-                throw new IllegalStateException("unable to find any unassigned shards to explain [" + request + "]");
+                throw new IllegalArgumentException("unable to find any unassigned shards to explain [" + request + "]");
             }
         } else {
             String index = request.getIndex();
@@ -151,7 +151,8 @@
                     DiscoveryNode primaryNode = allocation.nodes().resolveNode(request.getCurrentNode());
                     // the primary is assigned to a node other than the node specified in the request
                     if (primaryNode.getId().equals(foundShard.currentNodeId()) == false) {
-                        throw new IllegalStateException("unable to find primary shard assigned to node [" + request.getCurrentNode() + "]");
+                        throw new IllegalArgumentException(
+                                "unable to find primary shard assigned to node [" + request.getCurrentNode() + "]");
                     }
                 }
             } else {
@@ -168,7 +169,7 @@
                         }
                     }
                     if (foundShard == null) {
-                        throw new IllegalStateException("unable to find a replica shard assigned to node [" +
+                        throw new IllegalArgumentException("unable to find a replica shard assigned to node [" +
                                                             request.getCurrentNode() + "]");
                     }
                 } else {
@@ -193,7 +194,7 @@
         }
 
         if (foundShard == null) {
-            throw new IllegalStateException("unable to find any shards to explain [" + request + "] in the routing table");
+            throw new IllegalArgumentException("unable to find any shards to explain [" + request + "] in the routing table");
         }
         return foundShard;
     }
