diff --git a/platform/lang-impl/src/com/intellij/application/options/TabbedLanguageCodeStylePanel.java b/platform/lang-impl/src/com/intellij/application/options/TabbedLanguageCodeStylePanel.java
index 8de3532..a5a1928 100644
--- a/platform/lang-impl/src/com/intellij/application/options/TabbedLanguageCodeStylePanel.java
+++ b/platform/lang-impl/src/com/intellij/application/options/TabbedLanguageCodeStylePanel.java
@@ -268,10 +268,10 @@
   public void setupCopyFromMenu(JPopupMenu copyMenu) {
     super.setupCopyFromMenu(copyMenu);
     if (myPredefinedCodeStyles.length > 0) {
-      JMenuItem langs = new JMenuItem("Language"); //TODO<rv>: Move to resource bundle
+      JMenu langs = new JMenu("Language"); //TODO<rv>: Move to resource bundle
       copyMenu.add(langs);
       fillLanguages(langs);
-      JMenuItem predefined = new JMenuItem("Predefined Style"); //TODO<rv>: Move to resource bundle
+      JMenu predefined = new JMenu("Predefined Style"); //TODO<rv>: Move to resource bundle
       copyMenu.add(predefined);
       fillPredefined(predefined);
     }
