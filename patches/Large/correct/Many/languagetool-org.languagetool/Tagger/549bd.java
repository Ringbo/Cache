diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/Tagger.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/Tagger.java
index 468785c..c74b4ed 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/Tagger.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/Tagger.java
@@ -47,7 +47,7 @@
    * Create the AnalyzedToken used for whitespace and other non-words. Use <code>null</code>
    * as the POS tag for this token.
    */
-  public Object createNullToken(String token, int startPos);
+  public AnalyzedTokenReadings createNullToken(String token, int startPos);
 
   /**
    * Create a token specific to the laguage of the implementing class.
