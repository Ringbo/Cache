diff --git a/modules/hadoop/src/test/java/org/gridgain/grid/kernal/processors/hadoop/GridHadoopMapReduceTest.java b/modules/hadoop/src/test/java/org/gridgain/grid/kernal/processors/hadoop/GridHadoopMapReduceTest.java
index 3f27d33..ef1e721 100644
--- a/modules/hadoop/src/test/java/org/gridgain/grid/kernal/processors/hadoop/GridHadoopMapReduceTest.java
+++ b/modules/hadoop/src/test/java/org/gridgain/grid/kernal/processors/hadoop/GridHadoopMapReduceTest.java
@@ -82,7 +82,7 @@
             job.setJarByClass(GridHadoopWordCount2.class);
 
             try {
-                GridHadoopProcessor hadoop = ((GridKernal)grid(0)).context().hadoop();
+                GridHadoopProcessorAdapter hadoop = ((GridKernal) grid(0)).context().hadoop();
 
                 GridFuture<?> fut = hadoop.submit(new GridHadoopJobId(UUID.randomUUID(), 1),
                         new GridHadoopDefaultJobInfo(job.getConfiguration()));
