diff --git a/generators/tests/org/jetbrains/jet/generators/frontend/GenerateKeywordStringsTest.java b/generators/tests/org/jetbrains/jet/generators/frontend/GenerateKeywordStringsTest.java
index ca2664f..56a1699 100644
--- a/generators/tests/org/jetbrains/jet/generators/frontend/GenerateKeywordStringsTest.java
+++ b/generators/tests/org/jetbrains/jet/generators/frontend/GenerateKeywordStringsTest.java
@@ -27,6 +27,6 @@
         String text = GenerateKeywordStrings.generate();
         assertEquals("Contents differ. Regenerate " + GenerateKeywordStrings.class.getName(),
                      StringUtil.convertLineSeparators(text),
-                     FileUtil.loadFile(GenerateKeywordStrings.DEST_FILE));
+                     FileUtil.loadFile(GenerateKeywordStrings.DEST_FILE, true));
     }
 }
