diff --git a/trunk/JLanguageTool/src/test/org/languagetool/JLanguageToolTest.java b/trunk/JLanguageTool/src/test/org/languagetool/JLanguageToolTest.java
index d17a666..78e1cff 100644
--- a/trunk/JLanguageTool/src/test/org/languagetool/JLanguageToolTest.java
+++ b/trunk/JLanguageTool/src/test/org/languagetool/JLanguageToolTest.java
@@ -142,7 +142,7 @@
     assertEquals(6, matches.size());
     tool.setListUnknownWords(true);
     matches = tool.check("This is not a Polish text.");
-    assertEquals(4, matches.size());
+    assertEquals(3, matches.size());
     assertEquals("[Polish, This, is, text]", tool.getUnknownWords().toString());
     //check positions relative to sentence ends    
     matches = tool.check("To jest tekst.\nTest 1. To jest linia w której nie ma przecinka.");
