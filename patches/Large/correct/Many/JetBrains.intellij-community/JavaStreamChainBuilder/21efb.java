diff --git a/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/psi/impl/JavaStreamChainBuilder.java b/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/psi/impl/JavaStreamChainBuilder.java
index 471d394..bbf50ca 100644
--- a/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/psi/impl/JavaStreamChainBuilder.java
+++ b/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/psi/impl/JavaStreamChainBuilder.java
@@ -100,7 +100,7 @@
     while (current != null) {
       final PsiElement parent = current.getParent();
 
-      if (parent instanceof PsiCodeBlock || parent instanceof PsiLambdaExpression || parent instanceof PsiStatement) {
+      if (parent instanceof PsiModifiableCodeBlock || parent instanceof PsiLambdaExpression || parent instanceof PsiStatement) {
         break;
       }
 
