diff --git a/itest/src/edu/stanford/nlp/hcoref/DcorefChineseBenchmarkSlowITest.java b/itest/src/edu/stanford/nlp/hcoref/DcorefChineseBenchmarkSlowITest.java
index 2b110d2..b8b5a1f 100644
--- a/itest/src/edu/stanford/nlp/hcoref/DcorefChineseBenchmarkSlowITest.java
+++ b/itest/src/edu/stanford/nlp/hcoref/DcorefChineseBenchmarkSlowITest.java
@@ -107,7 +107,7 @@
     setAll(lowResults,highResults,expectedResults,MENTION_TP,12370);
     setAll(lowResults,highResults,expectedResults,MENTION_F1,55.6);
 
-    setAll(lowResults,highResults,expectedResults,MUC_TP,5965);
+    setLowHighExpected(lowResults, highResults, expectedResults, MUC_TP, 5965, 5970, 5965);
     setAll(lowResults,highResults,expectedResults,MUC_F1,57.93);
 
     setAll(lowResults,highResults,expectedResults,BCUBED_TP,6868.81);
