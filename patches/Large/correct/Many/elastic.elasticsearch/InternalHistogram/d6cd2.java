diff --git a/src/main/java/org/elasticsearch/search/aggregations/bucket/histogram/InternalHistogram.java b/src/main/java/org/elasticsearch/search/aggregations/bucket/histogram/InternalHistogram.java
index b6d6b7a..df0ed5b 100644
--- a/src/main/java/org/elasticsearch/search/aggregations/bucket/histogram/InternalHistogram.java
+++ b/src/main/java/org/elasticsearch/search/aggregations/bucket/histogram/InternalHistogram.java
@@ -120,7 +120,7 @@
         }
 
         void toXContent(XContentBuilder builder, Params params, boolean keyed, @Nullable ValueFormatter formatter) throws IOException {
-            if (formatter != null) {
+            if (formatter != null && formatter != ValueFormatter.RAW) {
                 Text keyTxt = new StringText(formatter.format(key));
                 if (keyed) {
                     builder.startObject(keyTxt.string());
