diff --git a/src/main/java/org/elasticsearch/common/lucene/search/function/FiltersFunctionScoreQuery.java b/src/main/java/org/elasticsearch/common/lucene/search/function/FiltersFunctionScoreQuery.java
index 5ebbacc..8526072 100644
--- a/src/main/java/org/elasticsearch/common/lucene/search/function/FiltersFunctionScoreQuery.java
+++ b/src/main/java/org/elasticsearch/common/lucene/search/function/FiltersFunctionScoreQuery.java
@@ -202,15 +202,15 @@
                 factor = filterExplanations.get(0).getValue();
                 break;
             case Max:
-                double maxFactor = Double.NEGATIVE_INFINITY;
+                factor = Double.NEGATIVE_INFINITY;
                 for (int i = 0; i < filterExplanations.size(); i++) {
-                    factor = Math.max(filterExplanations.get(i).getValue(), maxFactor);
+                    factor = Math.max(filterExplanations.get(i).getValue(), factor);
                 }
                 break;
             case Min:
-                double minFactor = Double.POSITIVE_INFINITY;
+                factor = Double.POSITIVE_INFINITY;
                 for (int i = 0; i < filterExplanations.size(); i++) {
-                    factor = Math.min(filterExplanations.get(i).getValue(), minFactor);
+                    factor = Math.min(filterExplanations.get(i).getValue(), factor);
                 }
                 break;
             case Multiply:
