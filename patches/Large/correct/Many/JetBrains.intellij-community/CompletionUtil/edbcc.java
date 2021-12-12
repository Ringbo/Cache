diff --git a/platform/lang-impl/src/com/intellij/codeInsight/completion/CompletionUtil.java b/platform/lang-impl/src/com/intellij/codeInsight/completion/CompletionUtil.java
index feb0fbb..b5597cb 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/completion/CompletionUtil.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/completion/CompletionUtil.java
@@ -254,7 +254,7 @@
   @Nullable
   public static <T extends PsiElement> T getOriginalElement(@NotNull T psi) {
     final PsiFile file = psi.getContainingFile();
-    if (file != null) {
+    if (file != null && file != file.getOriginalFile()) {
       final Document document = file.getViewProvider().getDocument();
       if (document != null) {
         final List<DocumentEvent> translator = document.getUserData(RANGE_TRANSLATION);
