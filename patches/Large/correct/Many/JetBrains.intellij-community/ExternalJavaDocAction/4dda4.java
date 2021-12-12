diff --git a/platform/lang-impl/src/com/intellij/ide/actions/ExternalJavaDocAction.java b/platform/lang-impl/src/com/intellij/ide/actions/ExternalJavaDocAction.java
index 005a153..9df72f7 100644
--- a/platform/lang-impl/src/com/intellij/ide/actions/ExternalJavaDocAction.java
+++ b/platform/lang-impl/src/com/intellij/ide/actions/ExternalJavaDocAction.java
@@ -143,9 +143,9 @@
     }
   }
 
-  private PsiElement getElement(DataContext dataContext, Editor editor) {
+  private static PsiElement getElement(DataContext dataContext, Editor editor) {
     PsiElement element = CommonDataKeys.PSI_ELEMENT.getData(dataContext);
-    if (element == null) {
+    if (element == null && editor != null) {
       PsiReference reference = TargetElementUtilBase.findReference(editor, editor.getCaretModel().getOffset());
       if (reference != null) {
         element = reference.getElement();
