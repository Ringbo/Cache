diff --git a/hbase-server/src/test/java/org/apache/hadoop/hbase/mapreduce/TestImportTsv.java b/hbase-server/src/test/java/org/apache/hadoop/hbase/mapreduce/TestImportTsv.java
index 1f29969..4e83eeb 100644
--- a/hbase-server/src/test/java/org/apache/hadoop/hbase/mapreduce/TestImportTsv.java
+++ b/hbase-server/src/test/java/org/apache/hadoop/hbase/mapreduce/TestImportTsv.java
@@ -189,7 +189,7 @@
   @Test
   public void testJobConfigurationsWithTsvImporterTextMapper() throws Exception {
     String table = "test-" + UUID.randomUUID();
-    Path bulkOutputPath = new Path(util.getDataTestDir(table),"hfiles");
+    Path bulkOutputPath = new Path(util.getDataTestDirOnTestFS(table),"hfiles");
     String INPUT_FILE = "InputFile1.csv";
     // Prepare the arguments required for the test.
     String[] args =
@@ -214,7 +214,7 @@
   public void testBulkOutputWithTsvImporterTextMapper() throws Exception {
     String table = "test-" + UUID.randomUUID();
     String FAMILY = "FAM";
-    Path bulkOutputPath = new Path(util.getDataTestDir(table),"hfiles");
+    Path bulkOutputPath = new Path(util.getDataTestDirOnTestFS(table),"hfiles");
     // Prepare the arguments required for the test.
     String[] args =
         new String[] {
