diff --git a/platform/lang-impl/src/com/intellij/ide/actions/SearchEverywhereAction.java b/platform/lang-impl/src/com/intellij/ide/actions/SearchEverywhereAction.java
index aa768c1..cd75dfc 100644
--- a/platform/lang-impl/src/com/intellij/ide/actions/SearchEverywhereAction.java
+++ b/platform/lang-impl/src/com/intellij/ide/actions/SearchEverywhereAction.java
@@ -171,7 +171,7 @@
   }
 
   private void onFocusLost(final JTextField editor) {
-    editor.setColumns(SystemInfo.isMac ? 5 : 7);
+    editor.setColumns(SystemInfo.isMac ? 5 : 8);
     field.getTextEditor().setForeground(UIUtil.getLabelDisabledForeground());
     field.setText(" " + KeymapUtil.getFirstKeyboardShortcutText(this));
 
