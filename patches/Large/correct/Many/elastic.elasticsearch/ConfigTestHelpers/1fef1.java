diff --git a/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/rollup/ConfigTestHelpers.java b/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/rollup/ConfigTestHelpers.java
index 3d82ac1..3e4e4a8 100644
--- a/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/rollup/ConfigTestHelpers.java
+++ b/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/rollup/ConfigTestHelpers.java
@@ -94,7 +94,7 @@
         if (ESTestCase.randomBoolean()) {
             dateHistoBuilder.setDelay(new DateHistogramInterval(randomPositiveTimeValue()));
         }
-        dateHistoBuilder.setField(ESTestCase.randomAlphaOfLengthBetween(1, 10 ));
+        dateHistoBuilder.setField(ESTestCase.randomAlphaOfLengthBetween(5, 10));
         return dateHistoBuilder;
     }
 
@@ -113,7 +113,7 @@
 
     public static  List<String> getFields() {
         return IntStream.range(0, ESTestCase.randomIntBetween(1,10))
-                .mapToObj(n -> ESTestCase.randomAlphaOfLengthBetween(1,10))
+                .mapToObj(n -> ESTestCase.randomAlphaOfLengthBetween(5, 10))
                 .collect(Collectors.toList());
     }
 
