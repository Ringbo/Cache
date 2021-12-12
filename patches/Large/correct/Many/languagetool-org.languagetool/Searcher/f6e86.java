diff --git a/languagetool-wikipedia/src/main/java/org/languagetool/dev/index/Searcher.java b/languagetool-wikipedia/src/main/java/org/languagetool/dev/index/Searcher.java
index a754568..e8c01d7 100644
--- a/languagetool-wikipedia/src/main/java/org/languagetool/dev/index/Searcher.java
+++ b/languagetool-wikipedia/src/main/java/org/languagetool/dev/index/Searcher.java
@@ -277,7 +277,7 @@
   }
 
   private static void ensureCorrectUsageOrExit(String[] args) {
-    if (args.length < 4 || !(args.length == 5 || !"--no_limit".equals(args[4]))) {
+    if (args.length < 4 || (args.length == 5 && !"--no_limit".equals(args[4]))) {
       System.err.println("Usage: Searcher <ruleId> <ruleXML> <languageCode> <indexDir> <--no_limit>");
       System.err.println("\truleId       Id of the rule to search for");
       System.err.println("\truleXML      path to a rule file, e.g. en/grammar.xml");
@@ -355,7 +355,7 @@
     final String languageCode = args[2];
     final Language language = Language.getLanguageForShortName(languageCode);
     final File indexDir = new File(args[3]);
-    if (args.length > 3 && "--no_limit".equals(args[4])) {
+    if (args.length > 4 && "--no_limit".equals(args[4])) {
       limitSearch = false;
     }
     final Searcher searcher = new Searcher(new SimpleFSDirectory(indexDir));
