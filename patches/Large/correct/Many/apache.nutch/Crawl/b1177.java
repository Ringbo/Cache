diff --git a/src/java/org/apache/nutch/crawl/Crawl.java b/src/java/org/apache/nutch/crawl/Crawl.java
index e26beb6..26bd582 100644
--- a/src/java/org/apache/nutch/crawl/Crawl.java
+++ b/src/java/org/apache/nutch/crawl/Crawl.java
@@ -108,7 +108,7 @@
       File segment =
         new Generator(conf).generate(crawlDb, segments, -1,
                                      topN, System.currentTimeMillis());
-      new Fetcher(conf).fetch(segment, threads);  // fetch it
+      new Fetcher(conf).fetch(segment, threads, Fetcher.isParsing(conf));  // fetch it
       if (!Fetcher.isParsing(conf)) {
         new ParseSegment(conf).parse(segment);    // parse it, if needed
       }
