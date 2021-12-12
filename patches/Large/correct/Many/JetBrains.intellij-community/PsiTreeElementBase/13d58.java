diff --git a/source/com/intellij/ide/structureView/impl/common/PsiTreeElementBase.java b/source/com/intellij/ide/structureView/impl/common/PsiTreeElementBase.java
index d97bf34..d05bc00 100644
--- a/source/com/intellij/ide/structureView/impl/common/PsiTreeElementBase.java
+++ b/source/com/intellij/ide/structureView/impl/common/PsiTreeElementBase.java
@@ -53,7 +53,7 @@
 
   public Icon getIcon(boolean open) {
     final PsiElement element = getElement();
-    if (element == null) {
+    if (element != null) {
       return element.getIcon(Iconable.ICON_FLAG_VISIBILITY | Iconable.ICON_FLAG_READ_STATUS);
     } else {
       return null;
