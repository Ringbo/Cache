diff --git a/js/js.inliner/src/org/jetbrains/kotlin/js/inline/JsInliner.java b/js/js.inliner/src/org/jetbrains/kotlin/js/inline/JsInliner.java
index 4fc9557..c27370e 100644
--- a/js/js.inliner/src/org/jetbrains/kotlin/js/inline/JsInliner.java
+++ b/js/js.inliner/src/org/jetbrains/kotlin/js/inline/JsInliner.java
@@ -496,7 +496,7 @@
             @NotNull LanguageVersionSettings languageVersionSettings
     ) {
         if (!(descriptor instanceof FunctionDescriptor)) return false;
-        return CommonCoroutineCodegenUtilKt.isBuiltInSuspendCoroutineOrReturn(
+        return CommonCoroutineCodegenUtilKt.isBuiltInSuspendCoroutineUninterceptedOrReturn(
                 (FunctionDescriptor) descriptor.getOriginal(), languageVersionSettings
         );
     }
