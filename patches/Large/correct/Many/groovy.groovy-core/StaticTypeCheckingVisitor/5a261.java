diff --git a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
index 96783b7..6b654c9 100644
--- a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
+++ b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
@@ -696,7 +696,7 @@
                 boolean incomplete = hasRHSIncompleteGenericTypeInfo(wrappedRHS);
                 if (!incomplete) {
                     GenericsType gt = GenericsUtils.buildWildcardType(leftExpressionType);
-                    if (!UNKNOWN_PARAMETER_TYPE.equals(wrappedRHS) && !gt.isCompatibleWith(wrappedRHS)) {
+                    if (!UNKNOWN_PARAMETER_TYPE.equals(wrappedRHS) && !gt.isCompatibleWith(wrappedRHS) && !isNullConstant(rightExpression)) {
                         if (isParameterizedWithString(leftExpressionType) && isParameterizedWithGStringOrGStringString(wrappedRHS)) {
                             addStaticTypeError("You are trying to use a GString in place of a String in a type which explicitly declares accepting String. " +
                                     "Make sure to call toString() on all GString values.", assignmentExpression.getRightExpression());
