diff --git a/indexing-hadoop/src/main/java/io/druid/indexer/HadoopDruidIndexerMapper.java b/indexing-hadoop/src/main/java/io/druid/indexer/HadoopDruidIndexerMapper.java
index 9f1bd03..2eedaf7 100644
--- a/indexing-hadoop/src/main/java/io/druid/indexer/HadoopDruidIndexerMapper.java
+++ b/indexing-hadoop/src/main/java/io/druid/indexer/HadoopDruidIndexerMapper.java
@@ -62,7 +62,7 @@
       try {
         inputRow = parser.parse(value.toString());
       }
-      catch (IllegalArgumentException e) {
+      catch (Exception e) {
         if (config.isIgnoreInvalidRows()) {
           context.getCounter(HadoopDruidIndexerConfig.IndexJobCounters.INVALID_ROW_COUNTER).increment(1);
           return; // we're ignoring this invalid row
