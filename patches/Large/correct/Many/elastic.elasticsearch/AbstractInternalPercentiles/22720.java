diff --git a/src/main/java/org/elasticsearch/search/aggregations/metrics/percentiles/AbstractInternalPercentiles.java b/src/main/java/org/elasticsearch/search/aggregations/metrics/percentiles/AbstractInternalPercentiles.java
index b3416a1..b4916cd 100644
--- a/src/main/java/org/elasticsearch/search/aggregations/metrics/percentiles/AbstractInternalPercentiles.java
+++ b/src/main/java/org/elasticsearch/search/aggregations/metrics/percentiles/AbstractInternalPercentiles.java
@@ -113,7 +113,7 @@
                 String key = String.valueOf(keys[i]);
                 double value = value(keys[i]);
                 builder.field(key, value);
-                if (valueFormatter != null) {
+                if (valueFormatter != null && !(valueFormatter instanceof ValueFormatter.Raw)) {
                     builder.field(key + "_as_string", valueFormatter.format(value));
                 }
             }
@@ -125,7 +125,7 @@
                 builder.startObject();
                 builder.field(CommonFields.KEY, keys[i]);
                 builder.field(CommonFields.VALUE, value);
-                if (valueFormatter != null) {
+                if (valueFormatter != null && !(valueFormatter instanceof ValueFormatter.Raw)) {
                     builder.field(CommonFields.VALUE_AS_STRING, valueFormatter.format(value));
                 }
                 builder.endObject();
