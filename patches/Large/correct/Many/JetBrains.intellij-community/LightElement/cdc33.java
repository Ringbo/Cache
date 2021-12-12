diff --git a/platform/core-impl/src/com/intellij/psi/impl/light/LightElement.java b/platform/core-impl/src/com/intellij/psi/impl/light/LightElement.java
index d3d8582..000bd8b 100644
--- a/platform/core-impl/src/com/intellij/psi/impl/light/LightElement.java
+++ b/platform/core-impl/src/com/intellij/psi/impl/light/LightElement.java
@@ -130,37 +130,37 @@
 
   @Override
   public void checkAdd(@NotNull PsiElement element) throws IncorrectOperationException {
-    throw new IncorrectOperationException();
+    throw new IncorrectOperationException(getClass().getName());
   }
 
   @Override
   public PsiElement add(@NotNull PsiElement element) throws IncorrectOperationException {
-    throw new IncorrectOperationException();
+    throw new IncorrectOperationException(getClass().getName());
   }
 
   @Override
   public PsiElement addBefore(@NotNull PsiElement element, PsiElement anchor) throws IncorrectOperationException {
-    throw new IncorrectOperationException();
+    throw new IncorrectOperationException(getClass().getName());
   }
 
   @Override
   public PsiElement addAfter(@NotNull PsiElement element, PsiElement anchor) throws IncorrectOperationException {
-    throw new IncorrectOperationException();
+    throw new IncorrectOperationException(getClass().getName());
   }
 
   @Override
   public void delete() throws IncorrectOperationException {
-    throw new IncorrectOperationException();
+    throw new IncorrectOperationException(getClass().getName());
   }
 
   @Override
   public void checkDelete() throws IncorrectOperationException {
-    throw new IncorrectOperationException();
+    throw new IncorrectOperationException(getClass().getName());
   }
 
   @Override
   public PsiElement replace(@NotNull PsiElement newElement) throws IncorrectOperationException {
-    throw new IncorrectOperationException();
+    throw new IncorrectOperationException(getClass().getName());
   }
 
   @Override
