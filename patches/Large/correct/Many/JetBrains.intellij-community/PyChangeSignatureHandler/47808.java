diff --git a/python/src/com/jetbrains/python/refactoring/changeSignature/PyChangeSignatureHandler.java b/python/src/com/jetbrains/python/refactoring/changeSignature/PyChangeSignatureHandler.java
index 6895249..e360c9e 100644
--- a/python/src/com/jetbrains/python/refactoring/changeSignature/PyChangeSignatureHandler.java
+++ b/python/src/com/jetbrains/python/refactoring/changeSignature/PyChangeSignatureHandler.java
@@ -126,7 +126,7 @@
 
   private static boolean isNotUnderSourceRoot(@NotNull final Project project,
                                               @Nullable final PsiFile psiFile,
-                                              @NotNull final Editor editor) {
+                                              @Nullable final Editor editor) {
     if (psiFile == null) return true;
     final VirtualFile virtualFile = psiFile.getVirtualFile();
     if (virtualFile != null) {
