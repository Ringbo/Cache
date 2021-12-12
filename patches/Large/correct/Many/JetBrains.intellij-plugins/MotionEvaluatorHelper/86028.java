diff --git a/ruby-motion/src/org/jetbrains/plugins/ruby/motion/run/MotionEvaluatorHelper.java b/ruby-motion/src/org/jetbrains/plugins/ruby/motion/run/MotionEvaluatorHelper.java
index 5f8e9fc9..7272b6a 100644
--- a/ruby-motion/src/org/jetbrains/plugins/ruby/motion/run/MotionEvaluatorHelper.java
+++ b/ruby-motion/src/org/jetbrains/plugins/ruby/motion/run/MotionEvaluatorHelper.java
@@ -26,10 +26,9 @@
                                                   @NotNull DebuggerDriver driver,
                                                   @NotNull XExpression expression,
                                                   XSourcePosition sourcePosition,
-                                                  int frameNumber,
-                                                  int threadId) throws ExecutionException, DBUserException {
+                                                  long threadId, int frameIndex) throws ExecutionException, DBUserException {
     final String stringExpression = expression.getExpression();
-    final LLValue result = driver.evaluate(threadId, frameNumber, stringExpression);
+    final LLValue result = driver.evaluate(threadId, frameIndex, stringExpression);
     return Pair.create(result, stringExpression);
   }
 }
