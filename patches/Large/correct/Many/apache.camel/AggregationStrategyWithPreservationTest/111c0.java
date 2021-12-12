diff --git a/components/camel-zipfile/src/test/java/org/apache/camel/processor/aggregate/zipfile/AggregationStrategyWithPreservationTest.java b/components/camel-zipfile/src/test/java/org/apache/camel/processor/aggregate/zipfile/AggregationStrategyWithPreservationTest.java
index 9c40cad..f4fd199 100644
--- a/components/camel-zipfile/src/test/java/org/apache/camel/processor/aggregate/zipfile/AggregationStrategyWithPreservationTest.java
+++ b/components/camel-zipfile/src/test/java/org/apache/camel/processor/aggregate/zipfile/AggregationStrategyWithPreservationTest.java
@@ -78,7 +78,7 @@
             public void configure() throws Exception {
                 // Unzip file and Split it according to FileEntry
                 from("file:src/test/resources/org/apache/camel/aggregate/zipfile/data?consumer.delay=1000&noop=true&recursive=true")
-                    .aggregate(new ZipAggregationStrategy(true))
+                    .aggregate(new ZipAggregationStrategy(true, true))
                         .constant(true)
                         .completionFromBatchConsumer()
                         .eagerCheckCompletion()
