diff --git a/server/sonar-server/src/main/java/org/sonar/server/search/BaseIndex.java b/server/sonar-server/src/main/java/org/sonar/server/search/BaseIndex.java
index a4dae1a..3353bdf 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/search/BaseIndex.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/search/BaseIndex.java
@@ -544,7 +544,7 @@
       // Sortable text analyzer
       .put("index.analysis.analyzer.sortable.type", "custom")
       .put("index.analysis.analyzer.sortable.tokenizer", "keyword")
-      .putArray("index.analysis.analyzer.sortable.filter", "trim", "lowercase", "truncate")
+      .putArray("index.analysis.analyzer.sortable.filter", "trim", "lowercase")
 
       // Edge NGram index-analyzer
       .put("index.analysis.analyzer.index_grams.type", "custom")
