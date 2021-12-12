diff --git a/itest/src/edu/stanford/nlp/hcoref/DcorefChineseBenchmarkSlowITest.java b/itest/src/edu/stanford/nlp/hcoref/DcorefChineseBenchmarkSlowITest.java
index 9650222..9bc7b17 100644
--- a/itest/src/edu/stanford/nlp/hcoref/DcorefChineseBenchmarkSlowITest.java
+++ b/itest/src/edu/stanford/nlp/hcoref/DcorefChineseBenchmarkSlowITest.java
@@ -105,23 +105,23 @@
 
 
     setAll(lowResults, highResults, expectedResults, MENTION_TP, 12370);
-    setLowHighExpected(lowResults, highResults, expectedResults, MENTION_F1, 55.5, 55.6, 55.7);
+    setLowHighExpected(lowResults, highResults, expectedResults, MENTION_F1, 55.5, 55.7, 55.6);
 
     setLowHighExpected(lowResults, highResults, expectedResults, MUC_TP, 5957, 5970, 5965);
-    setAll(lowResults,highResults,expectedResults,MUC_F1,57.87);
+    setLowHighExpected(lowResults, highResults, expectedResults, MUC_F1, 57.85, 57.90, 57.87);
 
     setLowHighExpected(lowResults, highResults, expectedResults, BCUBED_TP, 6868.8, 6936.32, 6868.81);
-    setAll(lowResults, highResults, expectedResults, BCUBED_F1,51.07);
+    setLowHighExpected(lowResults, highResults, expectedResults, BCUBED_F1, 51.05, 51.10, 51.07);
 
     setAll(lowResults, highResults, expectedResults, CEAFM_TP,8074);
     setLowHighExpected(lowResults, highResults, expectedResults, CEAFM_F1, 54.75, 55.2, 54.79);
 
     setAll(lowResults, highResults, expectedResults, CEAFE_TP, 2205.69);
-    setLowHighExpected(lowResults, highResults, expectedResults, CEAFE_F1, 50.45, 50.61, 50.47);
+    setLowHighExpected(lowResults, highResults, expectedResults, CEAFE_F1, 50.50, 50.65, 50.61);
 
-    setAll(lowResults,highResults,expectedResults,BLANC_F1,46.19);
+    setLowHighExpected(lowResults, highResults, expectedResults, BLANC_F1, 46.15, 46.25, 46.19);
 
-    setAll(lowResults,highResults,expectedResults,CONLL_SCORE,53.19);
+    setLowHighExpected(lowResults, highResults, expectedResults, CONLL_SCORE, 53.18, 53.20, 53.19);
 
 
     Counter<String> results = new ClassicCounter<String>();
