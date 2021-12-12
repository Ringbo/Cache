diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/OldDoFn.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/OldDoFn.java
index a445c7d..2e3323c 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/OldDoFn.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/OldDoFn.java
@@ -216,7 +216,7 @@
       aggregatorsAreFinal = true;
     }
 
-    private final <AggInputT, AggOutputT> void setupDelegateAggregator(
+    private <AggInputT, AggOutputT> void setupDelegateAggregator(
         DelegatingAggregator<AggInputT, AggOutputT> aggregator) {
 
       Aggregator<AggInputT, AggOutputT> delegate = createAggregatorInternal(
