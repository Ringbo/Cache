diff --git a/src/java/org/apache/lucene/index/IndexWriter.java b/src/java/org/apache/lucene/index/IndexWriter.java
index 932d105..81ce96f 100644
--- a/src/java/org/apache/lucene/index/IndexWriter.java
+++ b/src/java/org/apache/lucene/index/IndexWriter.java
@@ -356,7 +356,7 @@
     segmentInfos.addElement(new SegmentInfo(mergedName, docCount, directory));
 
     synchronized (directory) {			  // in- & inter-process sync
-      new Lock.With(directory.makeLock("commit.lock")) {
+      new Lock.With(directory.makeLock("commit.lock"), COMMIT_LOCK_TIMEOUT) {
 	  public Object doBody() throws IOException {
 	    segmentInfos.write(directory);	  // commit changes
 	    return null;
