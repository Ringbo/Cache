diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/BaseTagger.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/BaseTagger.java
index 1e5d8b6..d590bbf 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/BaseTagger.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/BaseTagger.java
@@ -68,7 +68,7 @@
         while (i < taggerTokens.length) {
           //Lametyzator returns data as String[]
           //first lemma, then annotations
-          l.add(new AnalyzedToken(word, taggerTokens[i + 1], taggerTokens[i]));
+          l.add(new AnalyzedToken(word, taggerTokens[i + 1], taggerTokens[i], pos));
           i = i + 2;
         }
       }
@@ -77,7 +77,7 @@
         while (i < lowerTaggerTokens.length) {
           //Lametyzator returns data as String[]
           //first lemma, then annotations
-          l.add(new AnalyzedToken(word, lowerTaggerTokens[i + 1], lowerTaggerTokens[i]));
+          l.add(new AnalyzedToken(word, lowerTaggerTokens[i + 1], lowerTaggerTokens[i], pos));
           i = i + 2;
         }
       }
