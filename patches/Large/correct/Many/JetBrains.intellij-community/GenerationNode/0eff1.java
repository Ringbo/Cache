diff --git a/xml/impl/src/com/intellij/codeInsight/template/emmet/nodes/GenerationNode.java b/xml/impl/src/com/intellij/codeInsight/template/emmet/nodes/GenerationNode.java
index 31695e1..f41f172 100644
--- a/xml/impl/src/com/intellij/codeInsight/template/emmet/nodes/GenerationNode.java
+++ b/xml/impl/src/com/intellij/codeInsight/template/emmet/nodes/GenerationNode.java
@@ -282,7 +282,7 @@
 
     final XmlFile xmlFile = token.getFile();
     PsiFileFactory fileFactory = PsiFileFactory.getInstance(xmlFile.getProject());
-    XmlFile dummyFile = (XmlFile)fileFactory.createFileFromText(HTMLLanguage.INSTANCE, xmlFile.getText());
+    XmlFile dummyFile = (XmlFile)fileFactory.createFileFromText("dummy.html", HTMLLanguage.INSTANCE, xmlFile.getText(), false, true);
     final XmlTag tag = dummyFile.getRootTag();
     if (tag != null) {
       
