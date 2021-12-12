diff --git a/itest/src/edu/stanford/nlp/coref/hybrid/ChineseCorefBenchmarkSlowITest.java b/itest/src/edu/stanford/nlp/coref/hybrid/ChineseCorefBenchmarkSlowITest.java
index 444fbc7..3586a08 100644
--- a/itest/src/edu/stanford/nlp/coref/hybrid/ChineseCorefBenchmarkSlowITest.java
+++ b/itest/src/edu/stanford/nlp/coref/hybrid/ChineseCorefBenchmarkSlowITest.java
@@ -124,7 +124,7 @@
 
     setLowHighExpected(lowResults, highResults, expectedResults, BLANC_F1, 46.00, 47.25, 46.68); // In 2015 was: 46.19
 
-    setLowHighExpected(lowResults, highResults, expectedResults, CONLL_SCORE, 53.75, 54.00, 54.01); // In 2015 was: 53.19
+    setLowHighExpected(lowResults, highResults, expectedResults, CONLL_SCORE, 53.75, 54.10, 54.01); // In 2015 was: 53.19
 
     BenchmarkingHelper.benchmarkResults(results, lowResults, highResults, expectedResults);
   }
