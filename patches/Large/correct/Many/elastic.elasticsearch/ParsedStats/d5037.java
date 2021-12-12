diff --git a/core/src/main/java/org/elasticsearch/search/aggregations/metrics/stats/ParsedStats.java b/core/src/main/java/org/elasticsearch/search/aggregations/metrics/stats/ParsedStats.java
index 239548e..4c676cf 100644
--- a/core/src/main/java/org/elasticsearch/search/aggregations/metrics/stats/ParsedStats.java
+++ b/core/src/main/java/org/elasticsearch/search/aggregations/metrics/stats/ParsedStats.java
@@ -109,7 +109,7 @@
             builder.nullField(Fields.MIN);
             builder.nullField(Fields.MAX);
             builder.nullField(Fields.AVG);
-            builder.nullField(Fields.SUM);
+            builder.field(Fields.SUM, 0.0d);
         }
         otherStatsToXContent(builder, params);
         return builder;
