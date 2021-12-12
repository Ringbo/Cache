diff --git a/graylog2-server/src/main/java/org/graylog2/indexer/searches/Searches.java b/graylog2-server/src/main/java/org/graylog2/indexer/searches/Searches.java
index 7b59f8f..8aa312c 100644
--- a/graylog2-server/src/main/java/org/graylog2/indexer/searches/Searches.java
+++ b/graylog2-server/src/main/java/org/graylog2/indexer/searches/Searches.java
@@ -221,7 +221,7 @@
         stats.order(TermsStatsFacet.ComparatorType.fromString(order.toString().toLowerCase()));
         stats.size(size);
 
-        terms.facetFilter(standardFilters(range, filter));
+        stats.facetFilter(standardFilters(range, filter));
 
         srb.addFacet(stats);
 
