diff --git a/contrib/benchmark/src/java/org/apache/lucene/benchmark/byTask/tasks/CreateIndexTask.java b/contrib/benchmark/src/java/org/apache/lucene/benchmark/byTask/tasks/CreateIndexTask.java
index 72ec92e..a38fe95 100644
--- a/contrib/benchmark/src/java/org/apache/lucene/benchmark/byTask/tasks/CreateIndexTask.java
+++ b/contrib/benchmark/src/java/org/apache/lucene/benchmark/byTask/tasks/CreateIndexTask.java
@@ -98,7 +98,7 @@
     IndexWriter writer = new IndexWriter(runData.getDirectory(),
                                          runData.getConfig().get("autocommit", OpenIndexTask.DEFAULT_AUTO_COMMIT),
                                          runData.getAnalyzer(),
-                                         true);
+                                         true, IndexWriter.MaxFieldLength.LIMITED);
     CreateIndexTask.setIndexWriterConfig(writer, config);
     runData.setIndexWriter(writer);
     return 1;
