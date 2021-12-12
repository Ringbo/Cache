diff --git a/ql/src/java/org/apache/hadoop/hive/ql/metadata/Partition.java b/ql/src/java/org/apache/hadoop/hive/ql/metadata/Partition.java
index 2e77bc4..9546191 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/metadata/Partition.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/metadata/Partition.java
@@ -283,7 +283,7 @@
   public void setOutputFormatClass(Class<? extends HiveOutputFormat> outputFormatClass) {
     this.outputFormatClass = outputFormatClass;
     tPartition.getSd().setOutputFormat(HiveFileFormatUtils
-        .getOutputFormatSubstitute(outputFormatClass).toString());
+        .getOutputFormatSubstitute(outputFormatClass).getName());
   }
 
   final public Class<? extends InputFormat> getInputFormatClass()
