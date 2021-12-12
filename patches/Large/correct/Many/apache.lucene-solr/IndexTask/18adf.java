diff --git a/contrib/ant/src/java/org/apache/lucene/ant/IndexTask.java b/contrib/ant/src/java/org/apache/lucene/ant/IndexTask.java
index c28865b..bb09995 100644
--- a/contrib/ant/src/java/org/apache/lucene/ant/IndexTask.java
+++ b/contrib/ant/src/java/org/apache/lucene/ant/IndexTask.java
@@ -259,7 +259,7 @@
     log("checkLastModified = " + checkLastModified, Project.MSG_VERBOSE);
 
     IndexWriter writer =
-      new IndexWriter(indexDir, analyzer, create);
+      new IndexWriter(indexDir, analyzer, create, IndexWriter.MaxFieldLength.LIMITED);
 
     writer.setUseCompoundFile(useCompoundIndex);
     int totalFiles = 0;
