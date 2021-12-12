diff --git a/jest-common/src/main/java/io/searchbox/core/search/aggregation/SingleValueAggregation.java b/jest-common/src/main/java/io/searchbox/core/search/aggregation/SingleValueAggregation.java
index 8012d73..19d3f63 100644
--- a/jest-common/src/main/java/io/searchbox/core/search/aggregation/SingleValueAggregation.java
+++ b/jest-common/src/main/java/io/searchbox/core/search/aggregation/SingleValueAggregation.java
@@ -15,7 +15,7 @@
 
     protected SingleValueAggregation(String name, JsonObject singleValueAggregation) {
         super(name, singleValueAggregation);
-        if(singleValueAggregation.has(String.valueOf(VALUE)) || !singleValueAggregation.get(String.valueOf(VALUE)).isJsonNull()) {
+        if(singleValueAggregation.has(String.valueOf(VALUE)) && !singleValueAggregation.get(String.valueOf(VALUE)).isJsonNull()) {
             value = singleValueAggregation.get(String.valueOf(VALUE)).getAsDouble();
         }
     }
