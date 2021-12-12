diff --git a/codeInsight/impl/com/intellij/codeInsight/daemon/impl/TextEditorHighlightingPassRegistrarImpl.java b/codeInsight/impl/com/intellij/codeInsight/daemon/impl/TextEditorHighlightingPassRegistrarImpl.java
index e9ee89b..b857e84 100644
--- a/codeInsight/impl/com/intellij/codeInsight/daemon/impl/TextEditorHighlightingPassRegistrarImpl.java
+++ b/codeInsight/impl/com/intellij/codeInsight/daemon/impl/TextEditorHighlightingPassRegistrarImpl.java
@@ -53,7 +53,7 @@
   public TextEditorHighlightingPass[] modifyHighlightingPasses(final List<TextEditorHighlightingPass> passes,
                                                                final PsiFile psiFile,
                                                                final Editor editor) {
-    if (myRegisteredPasses == null){
+    if (myRegisteredPasses == null || psiFile == null){ //do nothing with non-project files
       return passes.toArray(new TextEditorHighlightingPass[passes.size()]);
     }
     List<TextEditorHighlightingPass> result = new ArrayList<TextEditorHighlightingPass>(passes);
