diff --git a/src/edu/stanford/nlp/parser/shiftreduce/ShiftReduceParserQuery.java b/src/edu/stanford/nlp/parser/shiftreduce/ShiftReduceParserQuery.java
index 6aee143..9c80680 100644
--- a/src/edu/stanford/nlp/parser/shiftreduce/ShiftReduceParserQuery.java
+++ b/src/edu/stanford/nlp/parser/shiftreduce/ShiftReduceParserQuery.java
@@ -75,7 +75,7 @@
           Transition transition = parser.transitionIndex.get(predictedTransition.object());
           State newState = transition.apply(state, predictedTransition.score());
           // System.err.println("  Transition: " + transition + " (" + predictedTransition.score() + ")");
-          if (bestState == null || newState.score() < bestState.score()) {
+          if (bestState == null || bestState.score() < newState.score()) {
             bestState = newState;
           }
           beam.add(newState);
