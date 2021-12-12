diff --git a/src/java/org/apache/nutch/crawl/Generator.java b/src/java/org/apache/nutch/crawl/Generator.java
index 5be2d35..3cc45c6 100644
--- a/src/java/org/apache/nutch/crawl/Generator.java
+++ b/src/java/org/apache/nutch/crawl/Generator.java
@@ -708,7 +708,7 @@
     try {
       Path[] segs = generate(dbDir, segmentsDir, numFetchers, topN, curTime, filter,
           norm, force, maxNumSegments);
-      if (segs == null) return -1;
+      if (segs == null) return 1;
     } catch (Exception e) {
       LOG.error("Generator: " + StringUtils.stringifyException(e));
       return -1;
