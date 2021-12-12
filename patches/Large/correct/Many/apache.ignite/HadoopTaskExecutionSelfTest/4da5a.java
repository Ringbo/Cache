diff --git a/modules/hadoop/src/test/java/org/apache/ignite/internal/processors/hadoop/HadoopTaskExecutionSelfTest.java b/modules/hadoop/src/test/java/org/apache/ignite/internal/processors/hadoop/HadoopTaskExecutionSelfTest.java
index 0107907..8dc9830 100644
--- a/modules/hadoop/src/test/java/org/apache/ignite/internal/processors/hadoop/HadoopTaskExecutionSelfTest.java
+++ b/modules/hadoop/src/test/java/org/apache/ignite/internal/processors/hadoop/HadoopTaskExecutionSelfTest.java
@@ -411,7 +411,7 @@
         //Kill the same job again.
         killRes = hadoop.kill(jobId);
 
-        assertTrue(killRes);
+        assertFalse(killRes);
     }
 
     private static class CancellingTestMapper extends Mapper<Object, Text, Text, IntWritable> {
