diff --git a/src/main/java/org/elasticsearch/search/aggregations/metrics/valuecount/InternalValueCount.java b/src/main/java/org/elasticsearch/search/aggregations/metrics/valuecount/InternalValueCount.java
index 1ac855d..8c6dbf9 100644
--- a/src/main/java/org/elasticsearch/search/aggregations/metrics/valuecount/InternalValueCount.java
+++ b/src/main/java/org/elasticsearch/search/aggregations/metrics/valuecount/InternalValueCount.java
@@ -98,7 +98,7 @@
     @Override
     public XContentBuilder doXContentBody(XContentBuilder builder, Params params) throws IOException {
         builder.field(CommonFields.VALUE, value);
-        if (valueFormatter != null) {
+        if (valueFormatter != null && !(valueFormatter instanceof ValueFormatter.Raw)) {
             builder.field(CommonFields.VALUE_AS_STRING, valueFormatter.format(value));
         }
         return builder;
