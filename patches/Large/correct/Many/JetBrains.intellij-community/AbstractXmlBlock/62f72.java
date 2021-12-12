diff --git a/source/com/intellij/psi/formatter/xml/AbstractXmlBlock.java b/source/com/intellij/psi/formatter/xml/AbstractXmlBlock.java
index 0c34c10..fd7baea 100644
--- a/source/com/intellij/psi/formatter/xml/AbstractXmlBlock.java
+++ b/source/com/intellij/psi/formatter/xml/AbstractXmlBlock.java
@@ -410,7 +410,7 @@
                                     final FormattingDocumentModel documentModel) {
     final PsiFile file = element.getContainingFile();
     final Language baseLanguage = ((JspFile)file).getViewProvider().getTemplateDataLanguage();
-    if (baseLanguage == StdLanguages.HTML) {
+    if (baseLanguage == StdLanguages.HTML || baseLanguage == StdLanguages.XHTML) {
       final PsiElement[] psiRoots = file.getPsiRoots();
       LOG.assertTrue(psiRoots.length == 4);
       final ASTNode rootNode = SourceTreeToPsiMap.psiElementToTree(psiRoots[0]);
