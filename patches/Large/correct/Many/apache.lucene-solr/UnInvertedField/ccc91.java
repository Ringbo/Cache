diff --git a/solr/src/java/org/apache/solr/request/UnInvertedField.java b/solr/src/java/org/apache/solr/request/UnInvertedField.java
index 1a0ae8a..eed1d6b 100755
--- a/solr/src/java/org/apache/solr/request/UnInvertedField.java
+++ b/solr/src/java/org/apache/solr/request/UnInvertedField.java
@@ -599,7 +599,7 @@
 
         // if we are deep paging, we don't have to order the highest "offset" counts.
         int collectCount = Math.max(0, queue.size() - off);
-        assert collectCount < lim;
+        assert collectCount <= lim;
 
         // the start and end indexes of our list "sorted" (starting with the highest value)
         int sortedIdxStart = queue.size() - (collectCount - 1);
