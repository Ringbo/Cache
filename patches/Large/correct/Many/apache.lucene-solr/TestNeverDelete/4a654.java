diff --git a/lucene/src/test/org/apache/lucene/index/TestNeverDelete.java b/lucene/src/test/org/apache/lucene/index/TestNeverDelete.java
index 9c448e8..d76831a 100644
--- a/lucene/src/test/org/apache/lucene/index/TestNeverDelete.java
+++ b/lucene/src/test/org/apache/lucene/index/TestNeverDelete.java
@@ -80,7 +80,7 @@
 
     final Set<String> allFiles = new HashSet<String>();
 
-    IndexReader r = IndexReader.open(d);
+    DirectoryReader r = IndexReader.open(d);
     while(System.currentTimeMillis() < stopTime) {
       final IndexCommit ic = r.getIndexCommit();
       if (VERBOSE) {
@@ -91,7 +91,7 @@
       for(String fileName : allFiles) {
         assertTrue("file " + fileName + " does not exist", d.fileExists(fileName));
       }
-      IndexReader r2 = IndexReader.openIfChanged(r);
+      DirectoryReader r2 = DirectoryReader.openIfChanged(r);
       if (r2 != null) {
         r.close();
         r = r2;
