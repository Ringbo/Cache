diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tokenizers/de/GermanCompoundTokenizer.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tokenizers/de/GermanCompoundTokenizer.java
index f9caa24..60e2d8e 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tokenizers/de/GermanCompoundTokenizer.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tokenizers/de/GermanCompoundTokenizer.java
@@ -34,7 +34,7 @@
   private GermanWordSplitter wordSplitter = null;
   
   public GermanCompoundTokenizer() throws IOException {
-    wordSplitter = new GermanWordSplitter();
+    wordSplitter = new GermanWordSplitter(false);
   }
   
   public List<String> tokenize(String word) {
