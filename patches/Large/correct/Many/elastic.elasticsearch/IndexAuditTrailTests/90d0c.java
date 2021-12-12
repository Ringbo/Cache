diff --git a/shield/src/test/java/org/elasticsearch/shield/audit/index/IndexAuditTrailTests.java b/shield/src/test/java/org/elasticsearch/shield/audit/index/IndexAuditTrailTests.java
index b307484..371249c 100644
--- a/shield/src/test/java/org/elasticsearch/shield/audit/index/IndexAuditTrailTests.java
+++ b/shield/src/test/java/org/elasticsearch/shield/audit/index/IndexAuditTrailTests.java
@@ -156,7 +156,7 @@
                         return builder.build();
                     }
             };
-            cluster2 = new InternalTestCluster("network", randomLong(), createTempDir(), numNodes, numNodes, cluster2Name, cluster2SettingsSource, 0, false, SECOND_CLUSTER_NODE_PREFIX);
+            cluster2 = new InternalTestCluster("network", randomLong(), createTempDir(), numNodes, numNodes, cluster2Name, cluster2SettingsSource, 0, false, SECOND_CLUSTER_NODE_PREFIX, true);
             cluster2.beforeTest(getRandom(), 0.5);
             remoteClient = cluster2.client();
 
