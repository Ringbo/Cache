diff --git a/indexing-service/src/main/java/io/druid/indexing/common/config/TaskConfig.java b/indexing-service/src/main/java/io/druid/indexing/common/config/TaskConfig.java
index 7149d3d..e3fb7be 100644
--- a/indexing-service/src/main/java/io/druid/indexing/common/config/TaskConfig.java
+++ b/indexing-service/src/main/java/io/druid/indexing/common/config/TaskConfig.java
@@ -78,7 +78,7 @@
     this.baseTaskDir = new File(defaultDir(baseTaskDir, "persistent/task"));
     // This is usually on HDFS or similar, so we can't use java.io.tmpdir
     this.hadoopWorkingPath = hadoopWorkingPath == null ? "/tmp/druid-indexing" : hadoopWorkingPath;
-    this.defaultRowFlushBoundary = defaultRowFlushBoundary == null ? 500000 : defaultRowFlushBoundary;
+    this.defaultRowFlushBoundary = defaultRowFlushBoundary == null ? 75000 : defaultRowFlushBoundary;
     this.defaultHadoopCoordinates = defaultHadoopCoordinates == null
                                     ? DEFAULT_DEFAULT_HADOOP_COORDINATES
                                     : defaultHadoopCoordinates;
