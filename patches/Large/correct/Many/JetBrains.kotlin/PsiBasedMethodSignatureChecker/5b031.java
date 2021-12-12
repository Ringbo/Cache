diff --git a/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/resolver/PsiBasedMethodSignatureChecker.java b/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/resolver/PsiBasedMethodSignatureChecker.java
index f6ba7d2..ac69e35 100644
--- a/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/resolver/PsiBasedMethodSignatureChecker.java
+++ b/compiler/frontend.java/src/org/jetbrains/jet/lang/resolve/java/resolver/PsiBasedMethodSignatureChecker.java
@@ -82,7 +82,11 @@
         boolean paramsOk = overridableResult == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
         boolean returnTypeOk = isReturnTypeOkForOverride(JetTypeChecker.INSTANCE, superFunctionSubstituted, function);
         if (!paramsOk || !returnTypeOk) {
-            LOG.error("Loaded Java method overrides another, but resolved as Kotlin function, doesn't.\n"
+            // This should be a LOG.error, but happens a lot of times incorrectly (e.g. on Kotlin project), because somewhere in the
+            // type checker we compare two types which seem the same but have different instances of class descriptors. It happens
+            // probably because JavaDescriptorResolver is not completely thread-safe yet, and one class gets resolved multiple times.
+            // TODO: change to LOG.error when JavaDescriptorResolver becomes thread-safe
+            LOG.warn("Loaded Java method overrides another, but resolved as Kotlin function, doesn't.\n"
                       + "super function = " + superFunction + "\n"
                       + "super class = " + superFunction.getContainingDeclaration() + "\n"
                       + "sub function = " + function + "\n"
