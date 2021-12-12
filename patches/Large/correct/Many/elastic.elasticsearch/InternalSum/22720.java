diff --git a/src/main/java/org/elasticsearch/search/aggregations/metrics/sum/InternalSum.java b/src/main/java/org/elasticsearch/search/aggregations/metrics/sum/InternalSum.java
index a9638bc..7eb7e78 100644
--- a/src/main/java/org/elasticsearch/search/aggregations/metrics/sum/InternalSum.java
+++ b/src/main/java/org/elasticsearch/search/aggregations/metrics/sum/InternalSum.java
@@ -101,7 +101,7 @@
     @Override
     public XContentBuilder doXContentBody(XContentBuilder builder, Params params) throws IOException {
         builder.field(CommonFields.VALUE, sum);
-        if (valueFormatter != null) {
+        if (valueFormatter != null && !(valueFormatter instanceof ValueFormatter.Raw)) {
             builder.field(CommonFields.VALUE_AS_STRING, valueFormatter.format(sum));
         }
         return builder;
