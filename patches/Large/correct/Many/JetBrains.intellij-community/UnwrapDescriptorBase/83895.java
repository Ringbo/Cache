diff --git a/platform/lang-impl/src/com/intellij/codeInsight/unwrap/UnwrapDescriptorBase.java b/platform/lang-impl/src/com/intellij/codeInsight/unwrap/UnwrapDescriptorBase.java
index 62d5bdc..67fb29d 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/unwrap/UnwrapDescriptorBase.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/unwrap/UnwrapDescriptorBase.java
@@ -64,7 +64,7 @@
   protected abstract Unwrapper[] createUnwrappers();
 
   @Nullable
-  private static PsiElement findTargetElement(Editor editor, PsiFile file) {
+  protected PsiElement findTargetElement(Editor editor, PsiFile file) {
     int offset = editor.getCaretModel().getOffset();
     PsiElement endElement = file.findElementAt(offset);
     SelectionModel selectionModel = editor.getSelectionModel();
