diff --git a/platform/lang-impl/src/com/intellij/codeInsight/editorActions/wordSelection/NaturalLanguageTextSelectioner.java b/platform/lang-impl/src/com/intellij/codeInsight/editorActions/wordSelection/NaturalLanguageTextSelectioner.java
index 42f0d61..4298745 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/editorActions/wordSelection/NaturalLanguageTextSelectioner.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/editorActions/wordSelection/NaturalLanguageTextSelectioner.java
@@ -60,7 +60,7 @@
     if (prev < 0 || next < 0) {
       return null;
     }
-    if (StringUtil.contains(text, prev + 1, start, endChar) || StringUtil.contains(text, endChar, next, startChar)) return null;
+    if (StringUtil.contains(text, prev + 1, start, endChar) || StringUtil.contains(text, end, next, startChar)) return null;
     if (prev + 1 < start || next > end) {
       return new TextRange(prev + 1, next);
     }
