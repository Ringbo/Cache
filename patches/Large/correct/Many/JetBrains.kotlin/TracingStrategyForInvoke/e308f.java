diff --git a/compiler/frontend/src/org/jetbrains/kotlin/resolve/calls/tasks/TracingStrategyForInvoke.java b/compiler/frontend/src/org/jetbrains/kotlin/resolve/calls/tasks/TracingStrategyForInvoke.java
index ff480f3..67ec671 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/resolve/calls/tasks/TracingStrategyForInvoke.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/resolve/calls/tasks/TracingStrategyForInvoke.java
@@ -87,7 +87,7 @@
     }
 
     private void functionExpectedOrNoReceiverAllowed(BindingTrace trace) {
-        if (FunctionTypesKt.isFunctionType(calleeType)) {
+        if (FunctionTypesKt.isNonExtensionFunctionType(calleeType)) {
             trace.report(NO_RECEIVER_ALLOWED.on(reference));
         }
         else {
