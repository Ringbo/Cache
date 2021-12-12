diff --git a/spellchecker/src/com/intellij/spellchecker/settings/SpellCheckerSettingsPane.java b/spellchecker/src/com/intellij/spellchecker/settings/SpellCheckerSettingsPane.java
index 98cec9a..939359f 100644
--- a/spellchecker/src/com/intellij/spellchecker/settings/SpellCheckerSettingsPane.java
+++ b/spellchecker/src/com/intellij/spellchecker/settings/SpellCheckerSettingsPane.java
@@ -256,7 +256,7 @@
     }
   }
 
-  private static final class WordsPanel extends AddDeleteListPanel implements Disposable {
+  private static final class WordsPanel extends AddDeleteListPanel<String> implements Disposable {
     private final SpellCheckerManager manager;
 
     private WordsPanel(SpellCheckerManager manager) {
@@ -266,7 +266,7 @@
     }
 
 
-    protected Object findItemToAdd() {
+    protected String findItemToAdd() {
       String word = Messages.showInputDialog(SpellCheckerBundle.message("enter.simple.word"),
                                              SpellCheckerBundle.message("add.new.word"), null);
       if (word == null) {
