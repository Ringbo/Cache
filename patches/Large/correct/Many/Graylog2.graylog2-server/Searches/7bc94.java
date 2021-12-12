diff --git a/graylog2-server/src/main/java/org/graylog2/indexer/searches/Searches.java b/graylog2-server/src/main/java/org/graylog2/indexer/searches/Searches.java
index 980e476..de646ad 100644
--- a/graylog2-server/src/main/java/org/graylog2/indexer/searches/Searches.java
+++ b/graylog2-server/src/main/java/org/graylog2/indexer/searches/Searches.java
@@ -251,9 +251,9 @@
 
         SearchRequestBuilder srb;
         if (filter == null) {
-            srb = standardSearchRequest(query, IndexHelper.determineAffectedIndices(indexRangeService, deflector, range));
+            srb = standardSearchRequest(query, IndexHelper.determineAffectedIndices(indexRangeService, deflector, range), range);
         } else {
-            srb = filteredSearchRequest(query, filter, IndexHelper.determineAffectedIndices(indexRangeService, deflector, range));
+            srb = filteredSearchRequest(query, filter, IndexHelper.determineAffectedIndices(indexRangeService, deflector, range), range);
         }
 
         FilterAggregationBuilder builder = AggregationBuilders.filter(AGG_FILTER)
@@ -294,9 +294,9 @@
 
         SearchRequestBuilder srb;
         if (filter == null) {
-            srb = standardSearchRequest(query, IndexHelper.determineAffectedIndices(indexRangeService, deflector, range));
+            srb = standardSearchRequest(query, IndexHelper.determineAffectedIndices(indexRangeService, deflector, range), range);
         } else {
-            srb = filteredSearchRequest(query, filter, IndexHelper.determineAffectedIndices(indexRangeService, deflector, range));
+            srb = filteredSearchRequest(query, filter, IndexHelper.determineAffectedIndices(indexRangeService, deflector, range), range);
         }
 
 
@@ -378,9 +378,9 @@
         SearchRequestBuilder srb;
 
         if (filter == null) {
-            srb = standardSearchRequest(query, IndexHelper.determineAffectedIndices(indexRangeService, deflector, range));
+            srb = standardSearchRequest(query, IndexHelper.determineAffectedIndices(indexRangeService, deflector, range), range);
         } else {
-            srb = filteredSearchRequest(query, filter, IndexHelper.determineAffectedIndices(indexRangeService, deflector, range));
+            srb = filteredSearchRequest(query, filter, IndexHelper.determineAffectedIndices(indexRangeService, deflector, range), range);
         }
 
         FilterAggregationBuilder builder = AggregationBuilders.filter(AGG_FILTER)
