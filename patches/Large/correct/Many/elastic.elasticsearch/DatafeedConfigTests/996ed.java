diff --git a/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/ml/datafeed/DatafeedConfigTests.java b/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/ml/datafeed/DatafeedConfigTests.java
index ffc1365..3030449 100644
--- a/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/ml/datafeed/DatafeedConfigTests.java
+++ b/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/ml/datafeed/DatafeedConfigTests.java
@@ -100,7 +100,7 @@
             if (aggHistogramInterval == null) {
                 builder.setFrequency(TimeValue.timeValueSeconds(randomIntBetween(1, 1_000_000)));
             } else {
-                builder.setFrequency(TimeValue.timeValueMillis(randomIntBetween(1, 5) * aggHistogramInterval));
+                builder.setFrequency(TimeValue.timeValueSeconds(randomIntBetween(1, 5) * aggHistogramInterval));
             }
         }
         if (randomBoolean()) {
