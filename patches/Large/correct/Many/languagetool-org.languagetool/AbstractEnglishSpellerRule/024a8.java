diff --git a/languagetool-language-modules/en/src/main/java/org/languagetool/rules/en/AbstractEnglishSpellerRule.java b/languagetool-language-modules/en/src/main/java/org/languagetool/rules/en/AbstractEnglishSpellerRule.java
index 1dc47a4..9492a9f 100644
--- a/languagetool-language-modules/en/src/main/java/org/languagetool/rules/en/AbstractEnglishSpellerRule.java
+++ b/languagetool-language-modules/en/src/main/java/org/languagetool/rules/en/AbstractEnglishSpellerRule.java
@@ -114,10 +114,11 @@
   }
 
   /**
+   * @throws IOException 
    * @since 2.7
    */
   @Override
-  protected List<String> getAdditionalTopSuggestions(List<String> suggestions, String word) {
+  protected List<String> getAdditionalTopSuggestions(List<String> suggestions, String word) throws IOException {
     if ("Alot".equals(word)) {
       return Arrays.asList("A lot");
     } else if ("alot".equals(word)) {
