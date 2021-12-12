diff --git a/trunk/JLanguageTool/src/test/de/danielnaber/languagetool/JLanguageToolTest.java b/trunk/JLanguageTool/src/test/de/danielnaber/languagetool/JLanguageToolTest.java
index 11d7c4b..66774ca 100644
--- a/trunk/JLanguageTool/src/test/de/danielnaber/languagetool/JLanguageToolTest.java
+++ b/trunk/JLanguageTool/src/test/de/danielnaber/languagetool/JLanguageToolTest.java
@@ -43,7 +43,7 @@
     assertEquals(1, matches.size());
     matches = tool.check("I can give you more a detailed description.");
     assertEquals(0, matches.size());
-    assertEquals(4, tool.getAllRules().size());
+    assertEquals(5, tool.getAllRules().size());
     List rules = tool.loadPatternRules("rules/en/grammar.xml");
     for (Iterator iter = rules.iterator(); iter.hasNext();) {
       Rule rule = (Rule) iter.next();
