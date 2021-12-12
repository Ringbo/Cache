diff --git a/stresstest/src/test/java/io/crate/benchmark/LuceneDocCollectorBenchmark.java b/stresstest/src/test/java/io/crate/benchmark/LuceneDocCollectorBenchmark.java
index d118a65..4075db3 100644
--- a/stresstest/src/test/java/io/crate/benchmark/LuceneDocCollectorBenchmark.java
+++ b/stresstest/src/test/java/io/crate/benchmark/LuceneDocCollectorBenchmark.java
@@ -282,7 +282,7 @@
         topNProjector.startProjection(jobCollectContext);
         LuceneDocCollector docCollector = createDocCollector(null, null, topNProjector, ImmutableList.of((Symbol) reference));
         docCollector.doCollect();
-        topNProjector.doFinish();
+        topNProjector.finish();
         collectingProjector.finish();
     }
 
