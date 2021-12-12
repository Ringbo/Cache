diff --git a/shield/src/test/java/org/elasticsearch/shield/audit/index/RemoteIndexAuditTrailStartingTests.java b/shield/src/test/java/org/elasticsearch/shield/audit/index/RemoteIndexAuditTrailStartingTests.java
index 66decf9..4f10400 100644
--- a/shield/src/test/java/org/elasticsearch/shield/audit/index/RemoteIndexAuditTrailStartingTests.java
+++ b/shield/src/test/java/org/elasticsearch/shield/audit/index/RemoteIndexAuditTrailStartingTests.java
@@ -88,7 +88,7 @@
                 return builder.build();
             }
         };
-        remoteCluster = new InternalTestCluster("network", randomLong(), createTempDir(), numNodes, numNodes, cluster2Name, cluster2SettingsSource, 0, false, SECOND_CLUSTER_NODE_PREFIX);
+        remoteCluster = new InternalTestCluster("network", randomLong(), createTempDir(), numNodes, numNodes, cluster2Name, cluster2SettingsSource, 0, false, SECOND_CLUSTER_NODE_PREFIX, true);
         remoteCluster.beforeTest(getRandom(), 0.5);
     }
 
