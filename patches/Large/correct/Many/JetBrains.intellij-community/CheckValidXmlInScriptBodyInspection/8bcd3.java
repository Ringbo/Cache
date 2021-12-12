diff --git a/xml/impl/src/com/intellij/xml/util/CheckValidXmlInScriptBodyInspection.java b/xml/impl/src/com/intellij/xml/util/CheckValidXmlInScriptBodyInspection.java
index 1d7f86c..ad4e0a3 100644
--- a/xml/impl/src/com/intellij/xml/util/CheckValidXmlInScriptBodyInspection.java
+++ b/xml/impl/src/com/intellij/xml/util/CheckValidXmlInScriptBodyInspection.java
@@ -57,7 +57,7 @@
     return new XmlElementVisitor() {
       @Override public void visitXmlTag(final XmlTag tag) {
         if (SCRIPT_TAG_NAME.equals(tag.getName()) ||
-            (tag instanceof HtmlTag && SCRIPT_TAG_NAME.equalsIgnoreCase(tag.getLocalName()))
+            (tag instanceof HtmlTag && SCRIPT_TAG_NAME.equalsIgnoreCase(tag.getName()))
            ) {
           final PsiFile psiFile = tag.getContainingFile();
           final FileType fileType = psiFile.getFileType();
