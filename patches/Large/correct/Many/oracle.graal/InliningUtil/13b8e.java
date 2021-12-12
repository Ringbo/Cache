diff --git a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/inlining/InliningUtil.java b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/inlining/InliningUtil.java
index b69887b..77e26f0 100644
--- a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/inlining/InliningUtil.java
+++ b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/inlining/InliningUtil.java
@@ -334,7 +334,7 @@
 
         if (invoke instanceof InvokeWithExceptionNode) {
             InvokeWithExceptionNode invokeWithException = ((InvokeWithExceptionNode) invoke);
-            if (unwindNode != null) {
+            if (unwindNode != null && unwindNode.isAlive()) {
                 assert unwindNode.predecessor() != null;
                 assert invokeWithException.exceptionEdge().successors().count() == 1;
                 ExceptionObjectNode obj = (ExceptionObjectNode) invokeWithException.exceptionEdge();
@@ -358,7 +358,7 @@
                 graph.removeFixed(begin);
             }
         } else {
-            if (unwindNode != null && !unwindNode.isDeleted()) {
+            if (unwindNode != null && unwindNode.isAlive()) {
                 DeoptimizeNode deoptimizeNode = graph.add(new DeoptimizeNode(DeoptimizationAction.InvalidateRecompile, DeoptimizationReason.NotCompiledExceptionHandler));
                 unwindNode.replaceAndDelete(deoptimizeNode);
             }
