diff --git a/plugins/spellchecker/src/com/intellij/spellchecker/quickfixes/DictionarySuggestionProvider.java b/plugins/spellchecker/src/com/intellij/spellchecker/quickfixes/DictionarySuggestionProvider.java
index eff9744..76faf80 100644
--- a/plugins/spellchecker/src/com/intellij/spellchecker/quickfixes/DictionarySuggestionProvider.java
+++ b/plugins/spellchecker/src/com/intellij/spellchecker/quickfixes/DictionarySuggestionProvider.java
@@ -37,7 +37,7 @@
 
   public SuggestedNameInfo getSuggestedNames(PsiElement element, PsiElement nameSuggestionContext, List<String> result) {
     assert result != null;
-    if (!active) {
+    if (!active || nameSuggestionContext==null) {
       return null;
     }
     String text = nameSuggestionContext.getText();
