diff --git a/presto-main/src/main/java/com/facebook/presto/execution/QueryStateMachine.java b/presto-main/src/main/java/com/facebook/presto/execution/QueryStateMachine.java
index e3a28ac..6a78a0f 100644
--- a/presto-main/src/main/java/com/facebook/presto/execution/QueryStateMachine.java
+++ b/presto-main/src/main/java/com/facebook/presto/execution/QueryStateMachine.java
@@ -507,7 +507,7 @@
         failureCause.compareAndSet(null, toFailure(throwable));
         boolean failed = queryState.setIf(FAILED, currentState -> !currentState.isDone());
         if (failed) {
-            log.error(throwable, "Query %s failed", queryId);
+            log.debug(throwable, "Query %s failed", queryId);
         }
         else {
             log.debug(throwable, "Failure after query %s finished", queryId);
