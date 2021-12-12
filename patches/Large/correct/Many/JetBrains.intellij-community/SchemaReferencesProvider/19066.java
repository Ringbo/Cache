diff --git a/source/com/intellij/psi/impl/source/resolve/reference/impl/providers/SchemaReferencesProvider.java b/source/com/intellij/psi/impl/source/resolve/reference/impl/providers/SchemaReferencesProvider.java
index 1b69213e..8db34d6 100644
--- a/source/com/intellij/psi/impl/source/resolve/reference/impl/providers/SchemaReferencesProvider.java
+++ b/source/com/intellij/psi/impl/source/resolve/reference/impl/providers/SchemaReferencesProvider.java
@@ -122,10 +122,10 @@
     }
   }
 
-  static class NameReference implements PsiReference {
+  public static class NameReference implements PsiReference {
     private PsiElement myElement;
 
-    NameReference(PsiElement element) {
+    public NameReference(PsiElement element) {
       myElement = element;
     }
 
