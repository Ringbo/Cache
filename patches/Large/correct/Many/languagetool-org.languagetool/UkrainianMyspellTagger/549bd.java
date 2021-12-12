diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/uk/UkrainianMyspellTagger.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/uk/UkrainianMyspellTagger.java
index dafdaf4..7e41cfb 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/uk/UkrainianMyspellTagger.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/uk/UkrainianMyspellTagger.java
@@ -143,7 +143,7 @@
   }
 
   @Override
-  public final Object createNullToken(final String token, final int startPos) {
+  public final AnalyzedTokenReadings createNullToken(final String token, final int startPos) {
     return new AnalyzedTokenReadings(new AnalyzedToken(token, null, startPos));
   }
 
