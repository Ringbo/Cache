diff --git a/xml/impl/src/com/intellij/codeInsight/template/emmet/tokens/TemplateToken.java b/xml/impl/src/com/intellij/codeInsight/template/emmet/tokens/TemplateToken.java
index 10dec7c..e4daa04 100644
--- a/xml/impl/src/com/intellij/codeInsight/template/emmet/tokens/TemplateToken.java
+++ b/xml/impl/src/com/intellij/codeInsight/template/emmet/tokens/TemplateToken.java
@@ -100,7 +100,7 @@
     String templateString = template.getString();
     final PsiFileFactory psiFileFactory = PsiFileFactory.getInstance(callback.getProject());
     if (!containsAttrsVar(template)) {
-      XmlFile dummyFile = (XmlFile)psiFileFactory.createFileFromText(HTMLLanguage.INSTANCE, templateString);
+      XmlFile dummyFile = (XmlFile)psiFileFactory.createFileFromText("dummy.html", HTMLLanguage.INSTANCE, templateString, false, true);
       dummyRootTag = dummyFile.getRootTag();
       if (dummyRootTag != null) {
         addMissingAttributes(dummyRootTag, attributes);
