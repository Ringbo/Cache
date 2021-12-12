diff --git a/java/java-psi-impl/src/com/intellij/psi/impl/source/tree/java/PsiLambdaExpressionImpl.java b/java/java-psi-impl/src/com/intellij/psi/impl/source/tree/java/PsiLambdaExpressionImpl.java
index 2515119..3640170 100644
--- a/java/java-psi-impl/src/com/intellij/psi/impl/source/tree/java/PsiLambdaExpressionImpl.java
+++ b/java/java-psi-impl/src/com/intellij/psi/impl/source/tree/java/PsiLambdaExpressionImpl.java
@@ -234,7 +234,7 @@
     }
 
     PsiType methodReturnType = interfaceMethod.getReturnType();
-    if (methodReturnType != null) {
+    if (methodReturnType != null && methodReturnType != PsiType.VOID) {
       Map<PsiElement, PsiType> map = LambdaUtil.ourFunctionTypes.get();
       if (map == null) {
         map = new HashMap<PsiElement, PsiType>();
