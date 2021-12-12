diff --git a/platform/lang-impl/src/com/intellij/openapi/paths/GlobalPathReferenceProvider.java b/platform/lang-impl/src/com/intellij/openapi/paths/GlobalPathReferenceProvider.java
index e71aba5..ae38d5d 100644
--- a/platform/lang-impl/src/com/intellij/openapi/paths/GlobalPathReferenceProvider.java
+++ b/platform/lang-impl/src/com/intellij/openapi/paths/GlobalPathReferenceProvider.java
@@ -39,7 +39,7 @@
     }
     final TextRange range = manipulator.getRangeInElement(psiElement);
     final String s = range.substring(psiElement.getText());
-    if (s.contains("://") || s.startsWith(MAILTO_PREFIX)) {
+    if (s.contains("://") || s.startsWith(MAILTO_PREFIX) || s.startsWith("//")) {
       final PsiReference reference = PsiReferenceBase.createSelfReference(psiElement, psiElement);
       references.add(reference);
       return true;
