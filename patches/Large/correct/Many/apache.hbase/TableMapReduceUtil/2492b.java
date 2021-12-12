diff --git a/src/java/org/apache/hadoop/hbase/mapred/TableMapReduceUtil.java b/src/java/org/apache/hadoop/hbase/mapred/TableMapReduceUtil.java
index 29a7221..972f696 100644
--- a/src/java/org/apache/hadoop/hbase/mapred/TableMapReduceUtil.java
+++ b/src/java/org/apache/hadoop/hbase/mapred/TableMapReduceUtil.java
@@ -69,7 +69,8 @@
    * @throws IOException 
    */
   public static void initTableReduceJob(String table,
-      Class<? extends TableReduce> reducer, JobConf job) {
+    Class<? extends TableReduce> reducer, JobConf job)
+  throws IOException {
     initTableReduceJob(table, reducer, job, null);
   }
 
