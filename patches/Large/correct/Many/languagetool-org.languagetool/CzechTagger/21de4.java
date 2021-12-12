diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/cs/CzechTagger.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/cs/CzechTagger.java
index 6aa30ac..f541c05 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/cs/CzechTagger.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/cs/CzechTagger.java
@@ -88,7 +88,7 @@
           final String[] tagsArr = taggerTokens[i + 1].split("\\+");
 
           for (final String currTag : tagsArr) {
-            l.add(new AnalyzedToken(word, currTag, lemma));
+            l.add(new AnalyzedToken(word, currTag, lemma, pos));
           }
 
           i += 2;
@@ -104,7 +104,7 @@
           final String[] tagsArr = lowerTaggerTokens[i + 1].split("\\+");
 
           for (final String currTag : tagsArr) {
-            l.add(new AnalyzedToken(word, currTag, lemma));
+            l.add(new AnalyzedToken(word, currTag, lemma, pos));
           }
 
           i += 2;
