diff --git a/indexing-hadoop/src/main/java/io/druid/indexer/HadoopIngestionSpec.java b/indexing-hadoop/src/main/java/io/druid/indexer/HadoopIngestionSpec.java
index 985b3f1..2ebd1b7 100644
--- a/indexing-hadoop/src/main/java/io/druid/indexer/HadoopIngestionSpec.java
+++ b/indexing-hadoop/src/main/java/io/druid/indexer/HadoopIngestionSpec.java
@@ -139,7 +139,7 @@
           dataSource,
           new StringInputRowParser(
               dataSpec == null ? null : dataSpec.toParseSpec(timestampSpec, dimensionExclusions),
-              null, null, null
+              null, null, null, null
           ),
           rollupSpec == null
           ? new AggregatorFactory[]{}
