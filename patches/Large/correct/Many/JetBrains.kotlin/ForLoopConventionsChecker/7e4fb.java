diff --git a/compiler/frontend/src/org/jetbrains/kotlin/types/expressions/ForLoopConventionsChecker.java b/compiler/frontend/src/org/jetbrains/kotlin/types/expressions/ForLoopConventionsChecker.java
index b7c8407..65192c9 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/types/expressions/ForLoopConventionsChecker.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/types/expressions/ForLoopConventionsChecker.java
@@ -79,7 +79,7 @@
 
             checkIfOperatorModifierPresent(loopRangeExpression, iteratorFunction, context.trace);
 
-            symbolUsageValidator.validateCall(iteratorFunction, context.trace, loopRangeExpression);
+            symbolUsageValidator.validateCall(iteratorResolvedCall, iteratorFunction, context.trace, loopRangeExpression);
 
             JetType iteratorType = iteratorFunction.getReturnType();
             JetType hasNextType = checkConventionForIterator(context, loopRangeExpression, iteratorType, "hasNext",
@@ -140,7 +140,7 @@
             ResolvedCall<FunctionDescriptor> resolvedCall = nextResolutionResults.getResultingCall();
             context.trace.record(resolvedCallKey, loopRangeExpression, resolvedCall);
             FunctionDescriptor functionDescriptor = resolvedCall.getResultingDescriptor();
-            symbolUsageValidator.validateCall(functionDescriptor, context.trace, loopRangeExpression);
+            symbolUsageValidator.validateCall(resolvedCall, functionDescriptor, context.trace, loopRangeExpression);
 
             checkIfOperatorModifierPresent(loopRangeExpression, functionDescriptor, context.trace);
 
