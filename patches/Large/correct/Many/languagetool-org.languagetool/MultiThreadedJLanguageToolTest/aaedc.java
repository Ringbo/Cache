diff --git a/languagetool-core/src/test/java/org/languagetool/MultiThreadedJLanguageToolTest.java b/languagetool-core/src/test/java/org/languagetool/MultiThreadedJLanguageToolTest.java
index ad059bc..270d7ad 100644
--- a/languagetool-core/src/test/java/org/languagetool/MultiThreadedJLanguageToolTest.java
+++ b/languagetool-core/src/test/java/org/languagetool/MultiThreadedJLanguageToolTest.java
@@ -82,7 +82,7 @@
   public void testTwoRulesOnly() throws IOException {
     MultiThreadedJLanguageTool langTool = new MultiThreadedJLanguageTool(new FakeLanguage() {
       @Override
-      synchronized List<PatternRule> getPatternRules() {
+      protected synchronized List<PatternRule> getPatternRules() {
         return Collections.emptyList();
       }
 
