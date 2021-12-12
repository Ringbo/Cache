diff --git a/solr/src/java/org/apache/solr/request/SimpleFacets.java b/solr/src/java/org/apache/solr/request/SimpleFacets.java
index 1173f6d..df96238 100644
--- a/solr/src/java/org/apache/solr/request/SimpleFacets.java
+++ b/solr/src/java/org/apache/solr/request/SimpleFacets.java
@@ -508,7 +508,7 @@
 
         // if we are deep paging, we don't have to order the highest "offset" counts.
         int collectCount = Math.max(0, queue.size() - off);
-        assert collectCount < lim;
+        assert collectCount <= lim;
 
         // the start and end indexes of our list "sorted" (starting with the highest value)
         int sortedIdxStart = queue.size() - (collectCount - 1);
