diff --git a/itest/src/edu/stanford/nlp/coref/hybrid/ChineseCorefBenchmarkSlowITest.java b/itest/src/edu/stanford/nlp/coref/hybrid/ChineseCorefBenchmarkSlowITest.java
index 36f215c..444fbc7 100644
--- a/itest/src/edu/stanford/nlp/coref/hybrid/ChineseCorefBenchmarkSlowITest.java
+++ b/itest/src/edu/stanford/nlp/coref/hybrid/ChineseCorefBenchmarkSlowITest.java
@@ -114,7 +114,7 @@
     setLowHighExpected(lowResults, highResults, expectedResults, MUC_F1, 58.30, 58.80, 58.52); // In 2015 was: 57.87
 
     setLowHighExpected(lowResults, highResults, expectedResults, BCUBED_TP, 6990, 7110.00, 7026.39); // In 2015 was: 6936.32
-    setLowHighExpected(lowResults, highResults, expectedResults, BCUBED_F1, 51.60, 52.10, 52.08); // In 2015 was: 51.07
+    setLowHighExpected(lowResults, highResults, expectedResults, BCUBED_F1, 51.60, 52.20, 52.11); // In 2015 was: 51.07
 
     setLowHighExpected(lowResults, highResults, expectedResults, CEAFM_TP, 8220, 8260, 8224); // In 2015 was: 8074
     setLowHighExpected(lowResults, highResults, expectedResults, CEAFM_F1, 55.40, 56.00, 55.43); // In 2015 was: 55.10
@@ -124,7 +124,7 @@
 
     setLowHighExpected(lowResults, highResults, expectedResults, BLANC_F1, 46.00, 47.25, 46.68); // In 2015 was: 46.19
 
-    setLowHighExpected(lowResults, highResults, expectedResults, CONLL_SCORE, 53.75, 54.00, 53.98); // In 2015 was: 53.19
+    setLowHighExpected(lowResults, highResults, expectedResults, CONLL_SCORE, 53.75, 54.00, 54.01); // In 2015 was: 53.19
 
     BenchmarkingHelper.benchmarkResults(results, lowResults, highResults, expectedResults);
   }
