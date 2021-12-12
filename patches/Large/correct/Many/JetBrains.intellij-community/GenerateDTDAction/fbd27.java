diff --git a/xml/impl/src/com/intellij/codeInsight/actions/GenerateDTDAction.java b/xml/impl/src/com/intellij/codeInsight/actions/GenerateDTDAction.java
index 8ce1395..e3b6967 100644
--- a/xml/impl/src/com/intellij/codeInsight/actions/GenerateDTDAction.java
+++ b/xml/impl/src/com/intellij/codeInsight/actions/GenerateDTDAction.java
@@ -46,7 +46,7 @@
         if(file instanceof XmlFile && file.getVirtualFile() != null && file.getVirtualFile().isWritable()){
           final @NonNls StringBuffer buffer = new StringBuffer();
           final XmlDocument document = ((XmlFile) file).getDocument();
-          if(document.getRootTag() != null){
+          if (document != null && document.getRootTag() != null){
             buffer.append("<!DOCTYPE " + document.getRootTag().getName() + " [\n");
             buffer.append(XmlUtil.generateDocumentDTD(document, true));
             buffer.append("]>\n");
