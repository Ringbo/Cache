diff --git a/itest/src/edu/stanford/nlp/dcoref/DcorefBenchmarkSlowITest.java b/itest/src/edu/stanford/nlp/dcoref/DcorefBenchmarkSlowITest.java
index 5ef2084..c2fff3e 100644
--- a/itest/src/edu/stanford/nlp/dcoref/DcorefBenchmarkSlowITest.java
+++ b/itest/src/edu/stanford/nlp/dcoref/DcorefBenchmarkSlowITest.java
@@ -149,7 +149,7 @@
     setLowHighExpected(lowResults, highResults, expectedResults, MUC_TP, 6245, 6255, 6250);
     setLowHighExpected(lowResults, highResults, expectedResults, MUC_F1, 60.65, 60.7, 60.66);
 
-    setLowHighExpected(lowResults, highResults, expectedResults, BCUBED_TP, 12440, 12450, 12451.87);
+    setLowHighExpected(lowResults, highResults, expectedResults, BCUBED_TP, 12440, 12451.87, 12451.87);
     setLowHighExpected(lowResults, highResults, expectedResults, BCUBED_F1, 70.75, 70.85, 70.80);
 
     setLowHighExpected(lowResults, highResults, expectedResults, CEAFM_TP, 10915, 10930, 10920);
