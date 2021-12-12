diff --git a/platform/lang-impl/src/com/intellij/ide/projectView/impl/nodes/PsiDirectoryNode.java b/platform/lang-impl/src/com/intellij/ide/projectView/impl/nodes/PsiDirectoryNode.java
index dda1449..2d70a88 100644
--- a/platform/lang-impl/src/com/intellij/ide/projectView/impl/nodes/PsiDirectoryNode.java
+++ b/platform/lang-impl/src/com/intellij/ide/projectView/impl/nodes/PsiDirectoryNode.java
@@ -280,7 +280,7 @@
 
     final Bookmark bookmarkAtFile = BookmarkManager.getInstance(myProject).findFileBookmark(file);
     if (bookmarkAtFile != null) {
-      final RowIcon composite = new RowIcon(2);
+      final RowIcon composite = new RowIcon(2, RowIcon.Alignment.CENTER);
       composite.setIcon(icon, 0);
       composite.setIcon(bookmarkAtFile.getIcon(), 1);
       icon = composite;
