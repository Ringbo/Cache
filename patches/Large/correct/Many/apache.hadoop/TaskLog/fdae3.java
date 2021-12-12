diff --git a/hadoop-mapreduce/hadoop-mr-client/hadoop-mapreduce-client-core/src/main/java/org/apache/hadoop/mapred/TaskLog.java b/hadoop-mapreduce/hadoop-mr-client/hadoop-mapreduce-client-core/src/main/java/org/apache/hadoop/mapred/TaskLog.java
index 810eea3..7e978e9 100644
--- a/hadoop-mapreduce/hadoop-mr-client/hadoop-mapreduce-client-core/src/main/java/org/apache/hadoop/mapred/TaskLog.java
+++ b/hadoop-mapreduce/hadoop-mr-client/hadoop-mapreduce-client-core/src/main/java/org/apache/hadoop/mapred/TaskLog.java
@@ -183,9 +183,9 @@
   private static long prevErrLength;
   private static long prevLogLength;
   
-  private static void writeToIndexFile(String logLocation,
-                                       boolean isCleanup) 
-  throws IOException {
+  private static synchronized 
+  void writeToIndexFile(String logLocation,
+                        boolean isCleanup) throws IOException {
     // To ensure atomicity of updates to index file, write to temporary index
     // file first and then rename.
     File tmpIndexFile = getTmpIndexFile(currentTaskid, isCleanup);
