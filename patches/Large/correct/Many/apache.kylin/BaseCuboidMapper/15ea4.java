diff --git a/job/src/main/java/org/apache/kylin/job/hadoop/cube/BaseCuboidMapper.java b/job/src/main/java/org/apache/kylin/job/hadoop/cube/BaseCuboidMapper.java
index 0a163e2..41b21a7 100644
--- a/job/src/main/java/org/apache/kylin/job/hadoop/cube/BaseCuboidMapper.java
+++ b/job/src/main/java/org/apache/kylin/job/hadoop/cube/BaseCuboidMapper.java
@@ -96,7 +96,7 @@
 
         byteRowDelimiter = Bytes.toBytes(intermediateTableRowDelimiter)[0];
 
-        KylinConfig config = AbstractHadoopJob.loadKylinPropsAndMetadata(context.getConfiguration());
+        KylinConfig config = AbstractHadoopJob.loadKylinPropsAndMetadata();
 
         cube = CubeManager.getInstance(config).getCube(cubeName);
         cubeDesc = cube.getDescriptor();
