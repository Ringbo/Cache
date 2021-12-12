diff --git a/src/edu/stanford/nlp/patterns/surface/GetPatternsFromDataMultiClass.java b/src/edu/stanford/nlp/patterns/surface/GetPatternsFromDataMultiClass.java
index e3bd576..44a45d1 100644
--- a/src/edu/stanford/nlp/patterns/surface/GetPatternsFromDataMultiClass.java
+++ b/src/edu/stanford/nlp/patterns/surface/GetPatternsFromDataMultiClass.java
@@ -997,7 +997,7 @@
             ConstantsAndVariables.class, PatternScoring.class, String.class,
             TwoDimensionalCounter.class, TwoDimensionalCounter.class,
             TwoDimensionalCounter.class, TwoDimensionalCounter.class,
-            TwoDimensionalCounter.class);
+            TwoDimensionalCounter.class, String.class);
         
         scorePatterns = ctor.newInstance(new Object[] { constVars,
             constVars.patternScoring, label, patternsandWords4Label,
