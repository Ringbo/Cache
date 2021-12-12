diff --git a/platform/core-impl/src/com/intellij/psi/impl/source/codeStyle/CodeEditUtil.java b/platform/core-impl/src/com/intellij/psi/impl/source/codeStyle/CodeEditUtil.java
index 14ead0d..ad7a491 100644
--- a/platform/core-impl/src/com/intellij/psi/impl/source/codeStyle/CodeEditUtil.java
+++ b/platform/core-impl/src/com/intellij/psi/impl/source/codeStyle/CodeEditUtil.java
@@ -142,7 +142,7 @@
     assert child == last : last + " is not a successor of " + first + " in the .getTreeNext() chain";
 
     final ASTNode prevLeaf = TreeUtil.prevLeaf(first);
-    final ASTNode nextLeaf = TreeUtil.nextLeaf(last);
+    final ASTNode nextLeaf = TreeUtil.nextLeaf(first);
     parent.removeRange(first, last.getTreeNext());
     ASTNode nextLeafToAdjust = nextLeaf;
     if (nextLeafToAdjust != null && prevLeaf != null && nextLeafToAdjust.getTreeParent() == null) {
