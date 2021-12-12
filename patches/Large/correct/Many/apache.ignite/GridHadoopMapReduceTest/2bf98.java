diff --git a/modules/hadoop/src/test/java/org/gridgain/grid/kernal/processors/hadoop/GridHadoopMapReduceTest.java b/modules/hadoop/src/test/java/org/gridgain/grid/kernal/processors/hadoop/GridHadoopMapReduceTest.java
index 361b0cd..556b682 100644
--- a/modules/hadoop/src/test/java/org/gridgain/grid/kernal/processors/hadoop/GridHadoopMapReduceTest.java
+++ b/modules/hadoop/src/test/java/org/gridgain/grid/kernal/processors/hadoop/GridHadoopMapReduceTest.java
@@ -37,7 +37,7 @@
     public GridHadoopConfiguration hadoopConfiguration(String gridName) {
         GridHadoopConfiguration cfg = super.hadoopConfiguration(gridName);
 
-        cfg.setExternalExecution(true);
+        cfg.setExternalExecution(false);
 
         return cfg;
     }
