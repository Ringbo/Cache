diff --git a/languagetool-language-modules/nl/src/test/java/org/languagetool/JLanguageToolTest.java b/languagetool-language-modules/nl/src/test/java/org/languagetool/JLanguageToolTest.java
index 389b3c4..ab520f6 100644
--- a/languagetool-language-modules/nl/src/test/java/org/languagetool/JLanguageToolTest.java
+++ b/languagetool-language-modules/nl/src/test/java/org/languagetool/JLanguageToolTest.java
@@ -29,7 +29,7 @@
     final JLanguageTool tool = new JLanguageTool(new Dutch());
     tool.activateDefaultPatternRules();
     assertEquals(0, tool.check("Een test, die geen fouten mag geven.").size());
-    assertEquals(2, tool.check("Een test test, die een fout moet geven.").size());
+    assertEquals(1, tool.check("Een test test, die een fout moet geven.").size());
     assertEquals(1, tool.check("Dit is fout.!").size());
     //test uppercasing rule:
     /*  
