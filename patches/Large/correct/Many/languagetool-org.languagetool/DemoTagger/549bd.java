diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/xx/DemoTagger.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/xx/DemoTagger.java
index a6b8866..3e77ed2 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/xx/DemoTagger.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tagging/xx/DemoTagger.java
@@ -56,7 +56,7 @@
   }
 
   @Override
-  public Object createNullToken(String token, int startPos) {
+  public AnalyzedTokenReadings createNullToken(String token, int startPos) {
 	  return new AnalyzedTokenReadings(new AnalyzedToken(token, null, startPos));
   }
 
