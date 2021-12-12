diff --git a/src/java/org/apache/lucene/index/IndexModifier.java b/src/java/org/apache/lucene/index/IndexModifier.java
index fd87c9e..d5d3c17 100644
--- a/src/java/org/apache/lucene/index/IndexModifier.java
+++ b/src/java/org/apache/lucene/index/IndexModifier.java
@@ -172,7 +172,7 @@
     this.directory = directory;
     synchronized(this.directory) {
       this.analyzer = analyzer;
-      indexWriter = new IndexWriter(directory, analyzer, create);
+      indexWriter = new IndexWriter(directory, analyzer, create, IndexWriter.MaxFieldLength.LIMITED);
       open = true;
     }
   }
@@ -201,7 +201,7 @@
         indexReader.close();
         indexReader = null;
       }
-      indexWriter = new IndexWriter(directory, analyzer, false);
+      indexWriter = new IndexWriter(directory, analyzer, false, IndexWriter.MaxFieldLength.LIMITED);
       // IndexModifier cannot use ConcurrentMergeScheduler
       // because it synchronizes on the directory which can
       // cause deadlock
