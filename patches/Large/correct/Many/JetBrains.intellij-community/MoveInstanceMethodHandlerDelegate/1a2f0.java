diff --git a/refactoring/impl/com/intellij/refactoring/move/moveInstanceMethod/MoveInstanceMethodHandlerDelegate.java b/refactoring/impl/com/intellij/refactoring/move/moveInstanceMethod/MoveInstanceMethodHandlerDelegate.java
index b3ff1a2..5517eaf 100644
--- a/refactoring/impl/com/intellij/refactoring/move/moveInstanceMethod/MoveInstanceMethodHandlerDelegate.java
+++ b/refactoring/impl/com/intellij/refactoring/move/moveInstanceMethod/MoveInstanceMethodHandlerDelegate.java
@@ -26,7 +26,7 @@
   public boolean tryToMove(final PsiElement element, final Project project, final DataContext dataContext, final PsiReference reference) {
     if (element instanceof PsiMethod) {
       PsiMethod method = (PsiMethod) element;
-      if (method.hasModifierProperty(PsiModifier.STATIC))  {
+      if (!method.hasModifierProperty(PsiModifier.STATIC))  {
         new MoveInstanceMethodHandler().invoke(project, new PsiElement[]{method}, dataContext);
         return true;
       }
