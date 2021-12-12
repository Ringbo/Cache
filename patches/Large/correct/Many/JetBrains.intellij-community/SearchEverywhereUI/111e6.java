diff --git a/platform/lang-impl/src/com/intellij/ide/actions/searcheverywhere/SearchEverywhereUI.java b/platform/lang-impl/src/com/intellij/ide/actions/searcheverywhere/SearchEverywhereUI.java
index aa52eb3f..cac9fdb 100644
--- a/platform/lang-impl/src/com/intellij/ide/actions/searcheverywhere/SearchEverywhereUI.java
+++ b/platform/lang-impl/src/com/intellij/ide/actions/searcheverywhere/SearchEverywhereUI.java
@@ -169,7 +169,7 @@
     String hint = IdeBundle.message("searcheverywhere.history.shortcuts.hint",
                                     KeymapUtil.getKeystrokeText(SearchTextField.ALT_SHOW_HISTORY_KEYSTROKE),
                                     KeymapUtil.getKeystrokeText(SearchTextField.SHOW_HISTORY_KEYSTROKE));
-    JLabel hintLabel = HintUtil.createAdComponent(hint, JBUI.Borders.empty(), SwingConstants.LEFT);
+    JLabel hintLabel = HintUtil.createAdComponent(hint, JBUI.Borders.emptyLeft(8), SwingConstants.LEFT);
     hintLabel.setOpaque(false);
     hintLabel.setForeground(JBColor.GRAY);
     pnl.add(hintLabel, BorderLayout.SOUTH);
