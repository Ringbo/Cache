diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/BaseTagger.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/BaseTagger.java
index 21b612d..6b1f82f 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/BaseTagger.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/BaseTagger.java
@@ -100,7 +100,7 @@
    * @see de.danielnaber.languagetool.tagging.Tagger#createNullToken(java.lang.String, int)
    */
   @Override
-  public final Object createNullToken(final String token, final int startPos) {
+  public final AnalyzedTokenReadings createNullToken(final String token, final int startPos) {
     return new AnalyzedTokenReadings(new AnalyzedToken(token, null, startPos));
   }
   
