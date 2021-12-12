diff --git a/xml/impl/src/com/intellij/codeInsight/template/emmet/generators/XmlZenCodingGenerator.java b/xml/impl/src/com/intellij/codeInsight/template/emmet/generators/XmlZenCodingGenerator.java
index a44a04d..0f1a4ec 100644
--- a/xml/impl/src/com/intellij/codeInsight/template/emmet/generators/XmlZenCodingGenerator.java
+++ b/xml/impl/src/com/intellij/codeInsight/template/emmet/generators/XmlZenCodingGenerator.java
@@ -111,7 +111,7 @@
       prevVisibleLeaf = PsiTreeUtil.prevVisibleLeaf(prevVisibleLeaf);
     }
 
-    if (startOffset < 0 || currentOffset >= documentText.length()) {
+    if (startOffset < 0 || currentOffset > documentText.length()) {
       Logger.getInstance(getClass()).error("Error while calculating emmet abbreviation. Offset: " + currentOffset + "; Start: " + startOffset, 
                                            AttachmentFactory.createAttachment(editor.getDocument()));
       return null;
