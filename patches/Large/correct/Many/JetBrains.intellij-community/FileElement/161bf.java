diff --git a/source/com/intellij/psi/impl/source/tree/FileElement.java b/source/com/intellij/psi/impl/source/tree/FileElement.java
index 042a4d2..8bea5a5 100644
--- a/source/com/intellij/psi/impl/source/tree/FileElement.java
+++ b/source/com/intellij/psi/impl/source/tree/FileElement.java
@@ -48,7 +48,7 @@
       LOG.assertTrue(child.getElementType() == ElementType.IMPORT_LIST);
       if (newElement.getFirstChildNode() == null) { //empty import list
         ASTNode next = child.getTreeNext();
-        if (next.getElementType() == ElementType.WHITE_SPACE) {
+        if (next != null && next.getElementType() == ElementType.WHITE_SPACE) {
           removeChild(next);
         }
       }
