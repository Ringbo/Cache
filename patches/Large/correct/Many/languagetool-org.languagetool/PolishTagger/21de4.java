diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/pl/PolishTagger.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/pl/PolishTagger.java
index c9e41e5..c061310 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/pl/PolishTagger.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/pl/PolishTagger.java
@@ -77,7 +77,7 @@
             final String[] tagsArr = taggerTokens[i + 1].split("\\+");
 
             for (final String currTag : tagsArr) {
-              l.add(new AnalyzedToken(word, currTag, lemma));
+              l.add(new AnalyzedToken(word, currTag, lemma, pos));
             }
             i = i + 2;
         } 
@@ -92,7 +92,7 @@
            final String[] tagsArr = lowerTaggerTokens[i + 1].split("\\+");
 
            for (final String currTag : tagsArr) {
-             l.add(new AnalyzedToken(word, currTag, lemma));
+             l.add(new AnalyzedToken(word, currTag, lemma, pos));
            }
            i = i + 2;
        } 
