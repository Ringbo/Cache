diff --git a/plugins/spellchecker/src/com/intellij/spellchecker/options/SpellCheckerConfigurable.java b/plugins/spellchecker/src/com/intellij/spellchecker/options/SpellCheckerConfigurable.java
index 57e5093..4aeb73a 100644
--- a/plugins/spellchecker/src/com/intellij/spellchecker/options/SpellCheckerConfigurable.java
+++ b/plugins/spellchecker/src/com/intellij/spellchecker/options/SpellCheckerConfigurable.java
@@ -74,14 +74,14 @@
   private boolean wordsListIsModified() {
     assert options != null;
     List<String> newWords = options.getWords();
-    Set<String> words = manager.getUserDictionary().getWords();
+    Set<String> words = manager.getUserDictionary().getEditableWords();
     if (words == null && newWords == null) {
       return false;
     }
     if (words == null || newWords == null || newWords.size() != words.size()) {
       return true;
     }
-    return words.containsAll(newWords) && newWords.containsAll(words);
+    return !(words.containsAll(newWords) && newWords.containsAll(words));
   }
 
 
