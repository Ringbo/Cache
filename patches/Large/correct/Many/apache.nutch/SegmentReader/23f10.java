diff --git a/src/java/org/apache/nutch/segment/SegmentReader.java b/src/java/org/apache/nutch/segment/SegmentReader.java
index 0b65a2b..c62bdd6 100644
--- a/src/java/org/apache/nutch/segment/SegmentReader.java
+++ b/src/java/org/apache/nutch/segment/SegmentReader.java
@@ -526,7 +526,7 @@
       throws Exception {
     long cnt = 0L;
     Text key = new Text();
-    Text val = new Text();
+    CrawlDatum val = new CrawlDatum();
     FileSystem fs = segment.getFileSystem(getConf());
     
     if (ge) {
