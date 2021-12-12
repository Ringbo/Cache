diff --git a/platform/lang-impl/src/com/intellij/injected/editor/EditorWindow.java b/platform/lang-impl/src/com/intellij/injected/editor/EditorWindow.java
index 5f01a46..b9eef1d 100644
--- a/platform/lang-impl/src/com/intellij/injected/editor/EditorWindow.java
+++ b/platform/lang-impl/src/com/intellij/injected/editor/EditorWindow.java
@@ -222,7 +222,7 @@
 
   public EditorHighlighter getHighlighter() {
     EditorColorsScheme scheme = EditorColorsManager.getInstance().getGlobalScheme();
-    EditorHighlighter highlighter = HighlighterFactory.createHighlighter(myInjectedFile.getFileType(), scheme, getProject());
+    EditorHighlighter highlighter = HighlighterFactory.createHighlighter(myInjectedFile.getVirtualFile(), scheme, getProject());
     highlighter.setText(getDocument().getText());
     return highlighter;
   }
