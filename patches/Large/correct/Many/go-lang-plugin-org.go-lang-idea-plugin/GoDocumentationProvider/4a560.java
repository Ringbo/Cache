diff --git a/src/com/goide/GoDocumentationProvider.java b/src/com/goide/GoDocumentationProvider.java
index 4aee5ce..b942239 100644
--- a/src/com/goide/GoDocumentationProvider.java
+++ b/src/com/goide/GoDocumentationProvider.java
@@ -138,7 +138,8 @@
     return null;
   }
 
-  private static PsiElement adjustDocElement(PsiElement element) {
+  @Nullable
+  private static PsiElement adjustDocElement(@Nullable PsiElement element) {
     return element instanceof GoImportSpec ? ((GoImportSpec)element).getImportString().resolve() : element;
   }
 
@@ -280,7 +281,7 @@
   }
 
   @Nullable
-  private static String getReferenceText(@NotNull PsiElement element) {
+  private static String getReferenceText(@Nullable PsiElement element) {
     if (element instanceof GoNamedElement) {
       PsiFile file = element.getContainingFile();
       if (file instanceof GoFile) {
