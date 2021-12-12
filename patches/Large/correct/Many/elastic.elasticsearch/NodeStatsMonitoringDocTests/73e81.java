diff --git a/plugin/src/test/java/org/elasticsearch/xpack/monitoring/collector/node/NodeStatsMonitoringDocTests.java b/plugin/src/test/java/org/elasticsearch/xpack/monitoring/collector/node/NodeStatsMonitoringDocTests.java
index dd0d1bb..7d8e17f 100644
--- a/plugin/src/test/java/org/elasticsearch/xpack/monitoring/collector/node/NodeStatsMonitoringDocTests.java
+++ b/plugin/src/test/java/org/elasticsearch/xpack/monitoring/collector/node/NodeStatsMonitoringDocTests.java
@@ -372,6 +372,6 @@
                                                                 emptySet(),
                                                                 Version.V_6_0_0_beta1);
 
-        return new NodeStats(discoveryNode, no, indices, os, process, jvm, threadPool, fs, null, null, null, null, null, null);
+        return new NodeStats(discoveryNode, no, indices, os, process, jvm, threadPool, fs, null, null, null, null, null, null, null);
     }
 }
