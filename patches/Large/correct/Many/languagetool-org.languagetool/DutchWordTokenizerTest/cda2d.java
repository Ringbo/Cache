diff --git a/languagetool-language-modules/nl/src/test/java/org/languagetool/tokenizers/nl/DutchWordTokenizerTest.java b/languagetool-language-modules/nl/src/test/java/org/languagetool/tokenizers/nl/DutchWordTokenizerTest.java
index 98601ca..a82b027 100644
--- a/languagetool-language-modules/nl/src/test/java/org/languagetool/tokenizers/nl/DutchWordTokenizerTest.java
+++ b/languagetool-language-modules/nl/src/test/java/org/languagetool/tokenizers/nl/DutchWordTokenizerTest.java
@@ -40,6 +40,6 @@
 
   private void assertTokenize(String input, String expected) {
     List<String> result = wordTokenizer.tokenize(input);
-    assertEquals(result.toString(), expected);
+    assertEquals(expected, result.toString());
   }
 }
