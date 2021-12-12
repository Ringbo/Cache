diff --git a/flume-ng-sinks/flume-hdfs-sink/src/main/java/org/apache/flume/sink/hdfs/AbstractHDFSWriter.java b/flume-ng-sinks/flume-hdfs-sink/src/main/java/org/apache/flume/sink/hdfs/AbstractHDFSWriter.java
index 2fe309f..d2a07fa 100644
--- a/flume-ng-sinks/flume-hdfs-sink/src/main/java/org/apache/flume/sink/hdfs/AbstractHDFSWriter.java
+++ b/flume-ng-sinks/flume-hdfs-sink/src/main/java/org/apache/flume/sink/hdfs/AbstractHDFSWriter.java
@@ -63,7 +63,8 @@
 
     if (numberOfCloseRetries > 1) {
       try {
-        timeBetweenCloseRetries = context.getLong("hdfs.callTimeout", 10000L);
+        //hdfs.callTimeout is deprecated from 1.9
+        timeBetweenCloseRetries = context.getLong("hdfs.callTimeout", 30000L);
       } catch (NumberFormatException e) {
         logger.warn("hdfs.callTimeout can not be parsed to a long: " +
                     context.getLong("hdfs.callTimeout"));
