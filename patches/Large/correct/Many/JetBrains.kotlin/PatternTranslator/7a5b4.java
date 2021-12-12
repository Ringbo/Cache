diff --git a/js/js.translator/src/org/jetbrains/kotlin/js/translate/expression/PatternTranslator.java b/js/js.translator/src/org/jetbrains/kotlin/js/translate/expression/PatternTranslator.java
index 6e9f8d8..663430e 100644
--- a/js/js.translator/src/org/jetbrains/kotlin/js/translate/expression/PatternTranslator.java
+++ b/js/js.translator/src/org/jetbrains/kotlin/js/translate/expression/PatternTranslator.java
@@ -105,7 +105,7 @@
     @NotNull
     public JsExpression translateIsCheck(@NotNull JsExpression subject, @NotNull KtTypeReference typeReference) {
         KotlinType type = BindingUtils.getTypeByReference(bindingContext(), typeReference);
-        JsExpression checkFunReference = getIsTypeCheckCallable(type);
+        JsExpression checkFunReference = doGetIsTypeCheckCallable(type);
 
         if (isReifiedTypeParameter(type) && findChildByType(typeReference, KtNodeTypes.NULLABLE_TYPE) != null) {
             checkFunReference = namer().orNull(checkFunReference);
@@ -118,7 +118,7 @@
     public JsExpression getIsTypeCheckCallable(@NotNull KotlinType type) {
         JsExpression callable = doGetIsTypeCheckCallable(type);
 
-        if (isNullableType(type) && !isReifiedTypeParameter(type)) {
+        if (isNullableType(type)) {
             return namer().orNull(callable);
         }
 
