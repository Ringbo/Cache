diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/de/GermanTagger.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/de/GermanTagger.java
index 7ff5a24..ff57d56 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/de/GermanTagger.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/de/GermanTagger.java
@@ -150,7 +150,7 @@
   }
   
   @Override
-  public final Object createNullToken(final String token, final int startPos) {
+  public final AnalyzedGermanTokenReadings createNullToken(final String token, final int startPos) {
     return new AnalyzedGermanTokenReadings(new AnalyzedGermanToken(token, null, startPos));
   }
 
