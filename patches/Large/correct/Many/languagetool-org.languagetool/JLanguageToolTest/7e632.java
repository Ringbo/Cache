diff --git a/trunk/JLanguageTool/src/test/org/languagetool/JLanguageToolTest.java b/trunk/JLanguageTool/src/test/org/languagetool/JLanguageToolTest.java
index 3235e51..cb4d633 100644
--- a/trunk/JLanguageTool/src/test/org/languagetool/JLanguageToolTest.java
+++ b/trunk/JLanguageTool/src/test/org/languagetool/JLanguageToolTest.java
@@ -88,7 +88,7 @@
     tool.activateDefaultPatternRules();
     tool.setListUnknownWords(true);
     // German rule has no effect with English error, but they are spelling mistakes:
-    assertEquals(6, tool.check("I can give you more a detailed description").size());
+    assertEquals(8, tool.check("I can give you more a detailed description").size());
     //test unknown words listing
     assertEquals("[I, can, detailed, give, more, you]", tool.getUnknownWords().toString());
   }
