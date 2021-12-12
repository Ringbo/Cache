diff --git a/contrib/benchmark/src/java/org/apache/lucene/benchmark/byTask/tasks/CreateIndexTask.java b/contrib/benchmark/src/java/org/apache/lucene/benchmark/byTask/tasks/CreateIndexTask.java
index d1d716b..72ec92e 100644
--- a/contrib/benchmark/src/java/org/apache/lucene/benchmark/byTask/tasks/CreateIndexTask.java
+++ b/contrib/benchmark/src/java/org/apache/lucene/benchmark/byTask/tasks/CreateIndexTask.java
@@ -97,7 +97,8 @@
     Config config = runData.getConfig();
     IndexWriter writer = new IndexWriter(runData.getDirectory(),
                                          runData.getConfig().get("autocommit", OpenIndexTask.DEFAULT_AUTO_COMMIT),
-                                         runData.getAnalyzer());
+                                         runData.getAnalyzer(),
+                                         true);
     CreateIndexTask.setIndexWriterConfig(writer, config);
     runData.setIndexWriter(writer);
     return 1;
