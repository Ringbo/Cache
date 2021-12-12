diff --git a/RankingPlugin/src/org/gephi/ranking/plugin/AttributeRankingBuilder.java b/RankingPlugin/src/org/gephi/ranking/plugin/AttributeRankingBuilder.java
index 2eecd4c..0e9b2e5 100644
--- a/RankingPlugin/src/org/gephi/ranking/plugin/AttributeRankingBuilder.java
+++ b/RankingPlugin/src/org/gephi/ranking/plugin/AttributeRankingBuilder.java
@@ -301,7 +301,7 @@
         @Override
         public Number getMaximumValue() {
             if (maximum == null) {
-                AbstractRanking.refreshMinMax(this, graph);
+                DynamicAttributeRanking.refreshMinMax(this, graph);
             }
             return maximum;
         }
@@ -309,7 +309,7 @@
         @Override
         public Number getMinimumValue() {
             if (minimum == null) {
-                AbstractRanking.refreshMinMax(this, graph);
+                DynamicAttributeRanking.refreshMinMax(this, graph);
             }
             return minimum;
         }
