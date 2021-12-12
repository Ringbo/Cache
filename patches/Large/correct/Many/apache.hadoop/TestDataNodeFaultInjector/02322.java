diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/datanode/TestDataNodeFaultInjector.java b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/datanode/TestDataNodeFaultInjector.java
index 1507844..4afacd9 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/datanode/TestDataNodeFaultInjector.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/hdfs/server/datanode/TestDataNodeFaultInjector.java
@@ -118,7 +118,7 @@
       final MetricsDataNodeFaultInjector mdnFaultInjector) throws Exception {
 
     final Path baseDir = new Path(
-        PathUtils.getTestDir(getClass()).getAbsolutePath(),
+        PathUtils.getTestDir(getClass()).getPath(),
         GenericTestUtils.getMethodName());
     final DataNodeFaultInjector oldDnInjector = DataNodeFaultInjector.get();
     DataNodeFaultInjector.set(mdnFaultInjector);
