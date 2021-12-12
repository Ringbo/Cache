diff --git a/languagetool-language-modules/nl/src/test/java/org/languagetool/JLanguageToolTest.java b/languagetool-language-modules/nl/src/test/java/org/languagetool/JLanguageToolTest.java
index 4d999a1..ba621f2 100644
--- a/languagetool-language-modules/nl/src/test/java/org/languagetool/JLanguageToolTest.java
+++ b/languagetool-language-modules/nl/src/test/java/org/languagetool/JLanguageToolTest.java
@@ -39,7 +39,7 @@
     assertEquals("Als Afdeling geen deel uitmaakt van de naam, dan is juist:<suggestion>afdeling</suggestion>", matches.get(0).getMessage());
      */
     // Dutch rule has no effect with English error but they are spelling mistakes:
-    assertEquals(5, tool.check("I can give you more a detailed description.").size());
+    assertEquals(3, tool.check("I can give you more a detailed description.").size());
   }
   
 }
