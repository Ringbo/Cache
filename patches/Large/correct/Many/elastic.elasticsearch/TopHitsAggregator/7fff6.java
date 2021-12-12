diff --git a/src/main/java/org/elasticsearch/search/aggregations/bucket/tophits/TopHitsAggregator.java b/src/main/java/org/elasticsearch/search/aggregations/bucket/tophits/TopHitsAggregator.java
index 9953d3f..5ea62de 100644
--- a/src/main/java/org/elasticsearch/search/aggregations/bucket/tophits/TopHitsAggregator.java
+++ b/src/main/java/org/elasticsearch/search/aggregations/bucket/tophits/TopHitsAggregator.java
@@ -96,7 +96,7 @@
 
     @Override
     public InternalAggregation buildEmptyAggregation() {
-        return new InternalTopHits(name, topHitsContext.size(), topHitsContext.sort(), Lucene.EMPTY_TOP_DOCS, InternalSearchHits.empty());
+        return new InternalTopHits(name, topHitsContext.from(), topHitsContext.size(), topHitsContext.sort(), Lucene.EMPTY_TOP_DOCS, InternalSearchHits.empty());
     }
 
     @Override
