diff --git a/openapi/src/com/intellij/psi/util/PsiTreeUtil.java b/openapi/src/com/intellij/psi/util/PsiTreeUtil.java
index 3ee93c0..fc09891 100644
--- a/openapi/src/com/intellij/psi/util/PsiTreeUtil.java
+++ b/openapi/src/com/intellij/psi/util/PsiTreeUtil.java
@@ -88,7 +88,7 @@
     return null;
   }
 
-  @Nullable public static <ParentType extends PsiElement> ParentType getParentOfType(@NotNull PsiElement element, @NotNull Class<ParentType> aClass) {
+  @Nullable public static <ParentType extends PsiElement> ParentType getParentOfType(@Nullable PsiElement element, @NotNull Class<ParentType> aClass) {
     return getParentOfType(element, aClass, true);
   }
 
