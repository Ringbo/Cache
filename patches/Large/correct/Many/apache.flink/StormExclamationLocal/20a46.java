diff --git a/flink-contrib/flink-storm-compatibility/flink-storm-compatibility-examples/src/main/java/org/apache/flink/stormcompatibility/excamation/StormExclamationLocal.java b/flink-contrib/flink-storm-compatibility/flink-storm-compatibility-examples/src/main/java/org/apache/flink/stormcompatibility/excamation/StormExclamationLocal.java
index c87fe8f..a25e5e0 100644
--- a/flink-contrib/flink-storm-compatibility/flink-storm-compatibility-examples/src/main/java/org/apache/flink/stormcompatibility/excamation/StormExclamationLocal.java
+++ b/flink-contrib/flink-storm-compatibility/flink-storm-compatibility-examples/src/main/java/org/apache/flink/stormcompatibility/excamation/StormExclamationLocal.java
@@ -42,7 +42,7 @@
 		final FlinkLocalCluster cluster = FlinkLocalCluster.getLocalCluster();
 		cluster.submitTopology(topologyId, null, builder.createTopology());
 
-		Utils.sleep(5 * 1000);
+		Utils.sleep(10 * 1000);
 
 		// TODO kill does no do anything so far
 		cluster.killTopology(topologyId);
