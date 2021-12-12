diff --git a/core/src/main/java/org/elasticsearch/search/aggregations/pipeline/derivative/DerivativePipelineAggregatorBuilder.java b/core/src/main/java/org/elasticsearch/search/aggregations/pipeline/derivative/DerivativePipelineAggregatorBuilder.java
index 847261d..f897bc6 100644
--- a/core/src/main/java/org/elasticsearch/search/aggregations/pipeline/derivative/DerivativePipelineAggregatorBuilder.java
+++ b/core/src/main/java/org/elasticsearch/search/aggregations/pipeline/derivative/DerivativePipelineAggregatorBuilder.java
@@ -186,7 +186,7 @@
             builder.field(GAP_POLICY_FIELD.getPreferredName(), gapPolicy.getName());
         }
         if (units != null) {
-            builder.field(FORMAT_FIELD.getPreferredName(), units);
+            builder.field(UNIT_FIELD.getPreferredName(), units);
         }
         return builder;
     }
