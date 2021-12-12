diff --git a/flink-contrib/flink-storm-compatibility/flink-storm-compatibility-examples/src/main/java/org/apache/flink/stormcompatibility/wordcount/StormWordCountLocal.java b/flink-contrib/flink-storm-compatibility/flink-storm-compatibility-examples/src/main/java/org/apache/flink/stormcompatibility/wordcount/StormWordCountLocal.java
index 7b4f471..3fbd5b7 100644
--- a/flink-contrib/flink-storm-compatibility/flink-storm-compatibility-examples/src/main/java/org/apache/flink/stormcompatibility/wordcount/StormWordCountLocal.java
+++ b/flink-contrib/flink-storm-compatibility/flink-storm-compatibility-examples/src/main/java/org/apache/flink/stormcompatibility/wordcount/StormWordCountLocal.java
@@ -65,7 +65,7 @@
 		final FlinkLocalCluster cluster = FlinkLocalCluster.getLocalCluster();
 		cluster.submitTopology(topologyId, null, builder.createTopology());
 
-		Utils.sleep(5 * 1000);
+		Utils.sleep(10 * 1000);
 
 		// TODO kill does no do anything so far
 		cluster.killTopology(topologyId);
