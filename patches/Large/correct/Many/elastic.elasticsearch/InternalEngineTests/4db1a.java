diff --git a/core/src/test/java/org/elasticsearch/index/engine/InternalEngineTests.java b/core/src/test/java/org/elasticsearch/index/engine/InternalEngineTests.java
index bb030d8..d2f21cb 100644
--- a/core/src/test/java/org/elasticsearch/index/engine/InternalEngineTests.java
+++ b/core/src/test/java/org/elasticsearch/index/engine/InternalEngineTests.java
@@ -1825,7 +1825,7 @@
             assertEquals(Arrays.toString(tlogFiles), tlogFiles.length, 2); // ckp & tlog
             Path tlogFile = tlogFiles[0].getFileName().toString().endsWith("tlog") ? tlogFiles[0] : tlogFiles[1];
             final long size = Files.size(tlogFile);
-            logger.info("upgrading index {} file: {} size: {}", indexName, tlogFiles[0].getFileName(), size);
+            logger.debug("upgrading index {} file: {} size: {}", indexName, tlogFiles[0].getFileName(), size);
             Directory directory = newFSDirectory(src.resolve("0").resolve("index"));
             Store store = createStore(directory);
             final int iters = randomIntBetween(0, 2);
