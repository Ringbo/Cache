diff --git a/languagetool-core/src/test/java/org/languagetool/FakeLanguage.java b/languagetool-core/src/test/java/org/languagetool/FakeLanguage.java
index ecc18ff..e67be2a 100644
--- a/languagetool-core/src/test/java/org/languagetool/FakeLanguage.java
+++ b/languagetool-core/src/test/java/org/languagetool/FakeLanguage.java
@@ -48,7 +48,7 @@
   }
 
   @Override
-  synchronized List<PatternRule> getPatternRules() throws IOException {
+  protected synchronized List<PatternRule> getPatternRules() throws IOException {
     return Collections.emptyList();
   }
 
