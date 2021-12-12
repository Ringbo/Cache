diff --git a/core/src/main/java/org/elasticsearch/percolator/PercolatorService.java b/core/src/main/java/org/elasticsearch/percolator/PercolatorService.java
index fd07d54..e6ffa31 100644
--- a/core/src/main/java/org/elasticsearch/percolator/PercolatorService.java
+++ b/core/src/main/java/org/elasticsearch/percolator/PercolatorService.java
@@ -254,7 +254,7 @@
         }
         PercolatorQuery percolatorQuery = builder.build();
 
-        if (context.isOnlyCount()) {
+        if (context.isOnlyCount() || context.size() == 0) {
             TotalHitCountCollector collector = new TotalHitCountCollector();
             context.searcher().search(percolatorQuery, MultiCollector.wrap(collector, aggregatorCollector));
             if (aggregatorCollector != null) {
