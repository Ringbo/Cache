diff --git a/src/com/facebook/buck/cli/TestCommand.java b/src/com/facebook/buck/cli/TestCommand.java
index d8c3c0b..e2f047b 100644
--- a/src/com/facebook/buck/cli/TestCommand.java
+++ b/src/com/facebook/buck/cli/TestCommand.java
@@ -323,7 +323,7 @@
           testRules,
           build.getExecutionContext(),
           getTestRunningOptions(params),
-          testPool.getListeningExecutorService(),
+          testPool.getWeightedListeningExecutorService(),
           buildEngine,
           new DefaultStepRunner(),
           buildContext,
