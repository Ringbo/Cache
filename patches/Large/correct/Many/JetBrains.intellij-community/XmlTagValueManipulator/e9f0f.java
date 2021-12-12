diff --git a/source/com/intellij/psi/impl/source/resolve/reference/impl/manipulators/XmlTagValueManipulator.java b/source/com/intellij/psi/impl/source/resolve/reference/impl/manipulators/XmlTagValueManipulator.java
index 2020c4e..cb62fa8 100644
--- a/source/com/intellij/psi/impl/source/resolve/reference/impl/manipulators/XmlTagValueManipulator.java
+++ b/source/com/intellij/psi/impl/source/resolve/reference/impl/manipulators/XmlTagValueManipulator.java
@@ -13,7 +13,7 @@
 
   public XmlTag handleContentChange(XmlTag tag, TextRange range, String newContent) throws IncorrectOperationException {
     
-    final StringBuffer replacement = new StringBuffer( tag.getValue().getText() );
+    final StringBuilder replacement = new StringBuilder( tag.getValue().getText() );
     final int valueOffset = tag.getValue().getTextRange().getStartOffset() - tag.getTextOffset();
 
     replacement.replace(
