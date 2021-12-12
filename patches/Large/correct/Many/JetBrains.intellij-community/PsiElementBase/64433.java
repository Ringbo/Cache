diff --git a/source/com/intellij/psi/impl/PsiElementBase.java b/source/com/intellij/psi/impl/PsiElementBase.java
index 9465189..5c540c5 100644
--- a/source/com/intellij/psi/impl/PsiElementBase.java
+++ b/source/com/intellij/psi/impl/PsiElementBase.java
@@ -58,9 +58,9 @@
     throw new IncorrectOperationException();
   }
 
-  public PsiElement addRangeBefore(PsiElement first, PsiElement last, PsiElement anchor)
+  public PsiElement addRangeBefore(@NotNull PsiElement first, @NotNull PsiElement last, PsiElement anchor)
     throws IncorrectOperationException {
-    throw new IncorrectOperationException();
+    throw new IncorrectOperationException("Operation not supported in: " + getClass());
   }
 
   public PsiElement addRangeAfter(PsiElement first, PsiElement last, PsiElement anchor)
