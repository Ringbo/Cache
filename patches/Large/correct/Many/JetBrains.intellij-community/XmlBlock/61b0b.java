diff --git a/xml/impl/src/com/intellij/psi/formatter/xml/XmlBlock.java b/xml/impl/src/com/intellij/psi/formatter/xml/XmlBlock.java
index e883c71..29068c3 100644
--- a/xml/impl/src/com/intellij/psi/formatter/xml/XmlBlock.java
+++ b/xml/impl/src/com/intellij/psi/formatter/xml/XmlBlock.java
@@ -141,7 +141,7 @@
         // merged with other language's code blocks.
         createLeafBlocks(child, result);
       }
-      else if (child.getElementType() != TokenType.ERROR_ELEMENT) {
+      else if (child.getElementType() != TokenType.ERROR_ELEMENT || child.getFirstChildNode() != null) {
         result.add(new ReadOnlyBlock(child));
       }
       child = child.getTreeNext();
