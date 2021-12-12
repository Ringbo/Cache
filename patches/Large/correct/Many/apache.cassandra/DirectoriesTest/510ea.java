diff --git a/test/unit/org/apache/cassandra/db/DirectoriesTest.java b/test/unit/org/apache/cassandra/db/DirectoriesTest.java
index 2c055c7..c8af0d0 100644
--- a/test/unit/org/apache/cassandra/db/DirectoriesTest.java
+++ b/test/unit/org/apache/cassandra/db/DirectoriesTest.java
@@ -244,7 +244,7 @@
         for (final String cf : CFS)
         {
             final Directories directories = Directories.create(KS, cf);
-            Assert.assertEquals(cfDir(cf), directories.getDirectoryForNewSSTables(0));
+            Assert.assertEquals(cfDir(cf), directories.getDirectoryForNewSSTables());
             final String n = Long.toString(System.nanoTime());
             Callable<File> directoryGetter = new Callable<File>() {
                 public File call() throws Exception {
