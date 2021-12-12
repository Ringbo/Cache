diff --git a/language/analysis/src/test/java/com/google/cloud/language/samples/AnalyzeIT.java b/language/analysis/src/test/java/com/google/cloud/language/samples/AnalyzeIT.java
index 3e284ef..4284dea 100644
--- a/language/analysis/src/test/java/com/google/cloud/language/samples/AnalyzeIT.java
+++ b/language/analysis/src/test/java/com/google/cloud/language/samples/AnalyzeIT.java
@@ -76,7 +76,7 @@
 
     // Assert
     assertThat((double)sentiment.getMagnitude()).isGreaterThan(0.0);
-    assertThat((double)sentiment.getPolarity()).isLessThan(0.0);
+    assertThat((double)sentiment.getScore()).isLessThan(0.0);
   }
 
   @Test public void analyzeSyntax_partOfSpeech() throws Exception {
