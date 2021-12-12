diff --git a/src/main/java/org/elasticsearch/search/aggregations/metrics/cardinality/InternalCardinality.java b/src/main/java/org/elasticsearch/search/aggregations/metrics/cardinality/InternalCardinality.java
index daef68a..9998d3e 100644
--- a/src/main/java/org/elasticsearch/search/aggregations/metrics/cardinality/InternalCardinality.java
+++ b/src/main/java/org/elasticsearch/search/aggregations/metrics/cardinality/InternalCardinality.java
@@ -128,7 +128,7 @@
     public XContentBuilder doXContentBody(XContentBuilder builder, Params params) throws IOException {
         final long cardinality = getValue();
         builder.field(CommonFields.VALUE, cardinality);
-        if (valueFormatter != null) {
+        if (valueFormatter != null && !(valueFormatter instanceof ValueFormatter.Raw)) {
             builder.field(CommonFields.VALUE_AS_STRING, valueFormatter.format(cardinality));
         }
         return builder;
