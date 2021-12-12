diff --git a/titan-hadoop-parent/titan-hadoop-1/src/main/java/com/thinkaurelius/titan/hadoop/formats/TitanH1OutputFormat.java b/titan-hadoop-parent/titan-hadoop-1/src/main/java/com/thinkaurelius/titan/hadoop/formats/TitanH1OutputFormat.java
index a45afa0..a898ed5 100644
--- a/titan-hadoop-parent/titan-hadoop-1/src/main/java/com/thinkaurelius/titan/hadoop/formats/TitanH1OutputFormat.java
+++ b/titan-hadoop-parent/titan-hadoop-1/src/main/java/com/thinkaurelius/titan/hadoop/formats/TitanH1OutputFormat.java
@@ -52,7 +52,7 @@
         // returned by VertexProgram.getComputeKeys()
         if (null == persistableKeys) {
             try {
-                persistableKeys = VertexProgram.createVertexProgram(
+                persistableKeys = VertexProgram.createVertexProgram(graph,
                        ConfUtil.makeApacheConfiguration(taskAttemptContext.getConfiguration())).getElementComputeKeys();
                 log.debug("Set persistableKeys={}", Joiner.on(",").join(persistableKeys));
             } catch (Exception e) {
