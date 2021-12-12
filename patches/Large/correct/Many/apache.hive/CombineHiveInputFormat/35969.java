diff --git a/ql/src/java/org/apache/hadoop/hive/ql/io/CombineHiveInputFormat.java b/ql/src/java/org/apache/hadoop/hive/ql/io/CombineHiveInputFormat.java
index 7a1d1e1..e9483eb 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/io/CombineHiveInputFormat.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/io/CombineHiveInputFormat.java
@@ -252,7 +252,7 @@
 
       // Since there is no easy way of knowing whether MAPREDUCE-1597 is present in the tree or not,
       // we use a configuration variable for the same
-      if (this.mrwork != null && this.mrwork.getHadoopSupportsSplittable()) {
+      if (this.mrwork != null && !this.mrwork.getHadoopSupportsSplittable()) {
         // The following code should be removed, once
         // https://issues.apache.org/jira/browse/MAPREDUCE-1597 is fixed.
         // Hadoop does not handle non-splittable files correctly for CombineFileInputFormat,
