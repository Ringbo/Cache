diff --git a/lucene/core/src/test/org/apache/lucene/index/TestIndexWriterOnDiskFull.java b/lucene/core/src/test/org/apache/lucene/index/TestIndexWriterOnDiskFull.java
index cf10d6a..3c86b9e 100644
--- a/lucene/core/src/test/org/apache/lucene/index/TestIndexWriterOnDiskFull.java
+++ b/lucene/core/src/test/org/apache/lucene/index/TestIndexWriterOnDiskFull.java
@@ -249,7 +249,7 @@
         
         // Make a new dir that will enforce disk usage:
         MockDirectoryWrapper dir = new MockDirectoryWrapper(random(), new RAMDirectory(startDir, newIOContext(random())));
-        writer = new IndexWriter(dir, newIndexWriterConfig(TEST_VERSION_CURRENT, new MockAnalyzer(random())).setOpenMode(OpenMode.APPEND).setMergePolicy(newLogMergePolicy()));
+        writer = new IndexWriter(dir, newIndexWriterConfig(TEST_VERSION_CURRENT, new MockAnalyzer(random())).setOpenMode(OpenMode.APPEND).setMergePolicy(newLogMergePolicy(false)));
         IOException err = null;
 
         MergeScheduler ms = writer.getConfig().getMergeScheduler();
