diff --git a/pact/pact-runtime/src/test/java/eu/stratosphere/pact/runtime/sort/UnilateralSortMergerITCase.java b/pact/pact-runtime/src/test/java/eu/stratosphere/pact/runtime/sort/UnilateralSortMergerITCase.java
index d0f47f0..547d5ea 100644
--- a/pact/pact-runtime/src/test/java/eu/stratosphere/pact/runtime/sort/UnilateralSortMergerITCase.java
+++ b/pact/pact-runtime/src/test/java/eu/stratosphere/pact/runtime/sort/UnilateralSortMergerITCase.java
@@ -159,7 +159,7 @@
 		LOG.debug("initializing sortmerger");
 		SortMerger<TestData.Key, TestData.Value> merger = new UnilateralSortMerger<TestData.Key, TestData.Value>(
 			memoryManager, ioManager, 40 * 1024 * 1024, 1024 * 1024 * 1, 10, 2, keySerialization, valSerialization,
-			keyComparator, reader, parentTask);
+			keyComparator, reader, parentTask, 0.7f);
 
 		// emit data
 		LOG.debug("emitting data");
