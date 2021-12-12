diff --git a/trunk/JLanguageTool/src/test/de/danielnaber/languagetool/server/HTTPServerTest.java b/trunk/JLanguageTool/src/test/de/danielnaber/languagetool/server/HTTPServerTest.java
index cfbeeb0..8625f78 100644
--- a/trunk/JLanguageTool/src/test/de/danielnaber/languagetool/server/HTTPServerTest.java
+++ b/trunk/JLanguageTool/src/test/de/danielnaber/languagetool/server/HTTPServerTest.java
@@ -44,7 +44,8 @@
       String result = check(Language.GERMAN, "ein kleiner test. Und wieder Erwarten noch was: \u00f6\u00e4\u00fc\u00df.");
       assertTrue(result.indexOf("UPPERCASE_SENTENCE_START") != -1);
       assertTrue(result.indexOf("WIEDER_WILLEN") != -1);
-      assertTrue(result.indexOf("\u00f6\u00e4\u00fc\u00df") != -1);   // special chars are intact
+      assertTrue("Expected special chars, got: '" + result+ "'",
+          result.indexOf("\u00f6\u00e4\u00fc\u00df") != -1);   // special chars are intact
       XMLValidator validator = new XMLValidator();
       validator.validateXMLString(result, "/resource/api-output.dtd", "matches");
       validator.checkSimpleXMLString(result);
