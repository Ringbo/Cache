diff --git a/src/java/org/apache/nutch/crawl/Crawl.java b/src/java/org/apache/nutch/crawl/Crawl.java
index 6af752d..c501a26 100644
--- a/src/java/org/apache/nutch/crawl/Crawl.java
+++ b/src/java/org/apache/nutch/crawl/Crawl.java
@@ -126,7 +126,7 @@
     for (i = 0; i < depth; i++) {             // generate new segment
       Path[] segs = generator.generate(crawlDb, segments, -1, topN, System
           .currentTimeMillis());
-      if (segments == null) {
+      if (segs == null) {
         LOG.info("Stopping at depth=" + i + " - no more URLs to fetch.");
         break;
       }
