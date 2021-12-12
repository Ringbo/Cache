diff --git a/src/java/org/apache/hadoop/hbase/util/Migrate.java b/src/java/org/apache/hadoop/hbase/util/Migrate.java
index aa87eae..47bdb6c 100644
--- a/src/java/org/apache/hadoop/hbase/util/Migrate.java
+++ b/src/java/org/apache/hadoop/hbase/util/Migrate.java
@@ -342,7 +342,7 @@
   throws IOException {
     // Create directory where table will live
 
-    Path tableDir = new Path(rootdir, tableName.toString());
+    Path tableDir = new Path(rootdir, Bytes.toString(tableName));
     fs.mkdirs(tableDir);
 
     // Move the old region directory under the table directory
