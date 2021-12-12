diff --git a/hadoop-mapreduce-project/src/test/mapred/org/apache/hadoop/mapred/UtilsForTests.java b/hadoop-mapreduce-project/src/test/mapred/org/apache/hadoop/mapred/UtilsForTests.java
index fc3c617..1c7e70c 100644
--- a/hadoop-mapreduce-project/src/test/mapred/org/apache/hadoop/mapred/UtilsForTests.java
+++ b/hadoop-mapreduce-project/src/test/mapred/org/apache/hadoop/mapred/UtilsForTests.java
@@ -449,7 +449,7 @@
   static void signalTasks(MiniDFSCluster dfs, FileSystem fileSys, 
                           String mapSignalFile, 
                           String reduceSignalFile, int replication) 
-  throws IOException {
+  throws Exception {
     writeFile(dfs.getNameNode(), fileSys.getConf(), new Path(mapSignalFile), 
               (short)replication);
     writeFile(dfs.getNameNode(), fileSys.getConf(), new Path(reduceSignalFile), 
@@ -462,7 +462,7 @@
   static void signalTasks(MiniDFSCluster dfs, FileSystem fileSys, 
                           boolean isMap, String mapSignalFile, 
                           String reduceSignalFile)
-  throws IOException {
+  throws Exception {
     //  signal the maps to complete
     writeFile(dfs.getNameNode(), fileSys.getConf(),
               isMap 
@@ -483,7 +483,7 @@
   }
   
   static void writeFile(NameNode namenode, Configuration conf, Path name, 
-      short replication) throws IOException {
+      short replication) throws Exception {
     FileSystem fileSys = FileSystem.get(conf);
     SequenceFile.Writer writer = 
       SequenceFile.createWriter(fileSys, conf, name, 
