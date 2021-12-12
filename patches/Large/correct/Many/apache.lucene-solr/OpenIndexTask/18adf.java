diff --git a/contrib/benchmark/src/java/org/apache/lucene/benchmark/byTask/tasks/OpenIndexTask.java b/contrib/benchmark/src/java/org/apache/lucene/benchmark/byTask/tasks/OpenIndexTask.java
index 84fd99c..6ff0a56 100644
--- a/contrib/benchmark/src/java/org/apache/lucene/benchmark/byTask/tasks/OpenIndexTask.java
+++ b/contrib/benchmark/src/java/org/apache/lucene/benchmark/byTask/tasks/OpenIndexTask.java
@@ -50,7 +50,7 @@
     IndexWriter writer = new IndexWriter(runData.getDirectory(),
                                          config.get("autocommit", DEFAULT_AUTO_COMMIT),
                                          runData.getAnalyzer(),
-                                         false);
+                                         false, IndexWriter.MaxFieldLength.LIMITED);
     CreateIndexTask.setIndexWriterConfig(writer, config);
     runData.setIndexWriter(writer);
     return 1;
