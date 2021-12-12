diff --git a/hadoop-mapreduce-project/src/test/mapred/org/apache/hadoop/mapred/TestJobQueueInformation.java b/hadoop-mapreduce-project/src/test/mapred/org/apache/hadoop/mapred/TestJobQueueInformation.java
index b18a527..ea2980c 100644
--- a/hadoop-mapreduce-project/src/test/mapred/org/apache/hadoop/mapred/TestJobQueueInformation.java
+++ b/hadoop-mapreduce-project/src/test/mapred/org/apache/hadoop/mapred/TestJobQueueInformation.java
@@ -98,7 +98,7 @@
     dfsCluster.shutdown();
   }
 
-  public void testJobQueues() throws IOException {
+  public void testJobQueues() throws Exception {
     JobClient jc = new JobClient(mrCluster.createJobConf());
     String expectedQueueInfo = "Maximum Tasks Per Job :: 10";
     JobQueueInfo[] queueInfos = jc.getQueues();
