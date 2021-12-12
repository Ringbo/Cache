diff --git a/platform/platform-impl/src/com/intellij/diagnostic/errordialog/DetailsTabForm.java b/platform/platform-impl/src/com/intellij/diagnostic/errordialog/DetailsTabForm.java
index 5352361..55f9367 100644
--- a/platform/platform-impl/src/com/intellij/diagnostic/errordialog/DetailsTabForm.java
+++ b/platform/platform-impl/src/com/intellij/diagnostic/errordialog/DetailsTabForm.java
@@ -32,7 +32,7 @@
   public DetailsTabForm(@Nullable Action analyzeAction, boolean internalMode) {
     myCommentsArea.setTitle(DiagnosticBundle.message("error.dialog.comment.prompt"));
     myDetailsPane.setBackground(UIUtil.getTextFieldBackground());
-    myDetailsPane.setPreferredSize(new Dimension(IdeErrorsDialog.COMPONENTS_WIDTH, internalMode ? 500 : 205));
+    myDetailsHolder.setPreferredSize(new Dimension(IdeErrorsDialog.COMPONENTS_WIDTH, internalMode ? 500 : 205));
     myDetailsHolder.setBorder(IdeBorderFactory.createBorder());
     if (analyzeAction != null) {
       myAnalyzeStacktraceButton.setAction(analyzeAction);
