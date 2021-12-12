diff --git a/languagetool-core/src/main/java/org/languagetool/rules/DoublePunctuationRule.java b/languagetool-core/src/main/java/org/languagetool/rules/DoublePunctuationRule.java
index 1b84980..5c59d83 100644
--- a/languagetool-core/src/main/java/org/languagetool/rules/DoublePunctuationRule.java
+++ b/languagetool-core/src/main/java/org/languagetool/rules/DoublePunctuationRule.java
@@ -59,7 +59,7 @@
     int startPos = 0;
     int dotCount = 0;
     int commaCount = 0;
-    for (int i = 0; i < tokens.length; i++) {
+    for (int i = 1; i < tokens.length; i++) {
       final String token = tokens[i].getToken();
       String nextToken = null;
       String prevToken = null;
