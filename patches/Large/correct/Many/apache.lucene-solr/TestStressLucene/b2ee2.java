diff --git a/solr/core/src/test/org/apache/solr/search/TestStressLucene.java b/solr/core/src/test/org/apache/solr/search/TestStressLucene.java
index f8f287d..94cf300 100644
--- a/solr/core/src/test/org/apache/solr/search/TestStressLucene.java
+++ b/solr/core/src/test/org/apache/solr/search/TestStressLucene.java
@@ -109,7 +109,7 @@
     // reader = IndexReader.open(dir);
     // make this reader an NRT reader from the start to avoid the first non-writer openIfChanged
     // to only opening at the last commit point.
-    reader = DirectoryReader.open(writer.w, true);
+    reader = DirectoryReader.open(writer.w);
 
     for (int i=0; i<nWriteThreads; i++) {
       Thread thread = new Thread("WRITER"+i) {
