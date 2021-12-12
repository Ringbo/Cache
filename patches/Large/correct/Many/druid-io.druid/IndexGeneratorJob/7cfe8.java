diff --git a/indexing-hadoop/src/main/java/io/druid/indexer/IndexGeneratorJob.java b/indexing-hadoop/src/main/java/io/druid/indexer/IndexGeneratorJob.java
index 6dd97b9..e562f7f 100644
--- a/indexing-hadoop/src/main/java/io/druid/indexer/IndexGeneratorJob.java
+++ b/indexing-hadoop/src/main/java/io/druid/indexer/IndexGeneratorJob.java
@@ -448,7 +448,7 @@
       } else if (outputFS instanceof DistributedFileSystem) {
         loadSpec = ImmutableMap.<String, Object>of(
             "type", "hdfs",
-            "path", indexOutURI.getPath()
+            "path", indexOutURI.toString()
         );
       } else {
         throw new ISE("Unknown file system[%s]", outputFS.getClass());
