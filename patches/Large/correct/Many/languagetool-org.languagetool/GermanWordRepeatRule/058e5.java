diff --git a/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanWordRepeatRule.java b/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanWordRepeatRule.java
index 5529c80..2e5ca93 100644
--- a/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanWordRepeatRule.java
+++ b/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/GermanWordRepeatRule.java
@@ -74,7 +74,7 @@
         // "Sie tut das, damit sie sie nicht fortschickt"
         return true;
       }
-      if (tokens.length+1 > position) {
+      if (tokens.length-1 > position) {
         if (tokens[position - 2].matchesPosTagRegex("VER:3:.+") && tokens[position + 1].hasPosTag("ZUS")) {
           // "Dann warfen sie sie weg."
           return true;
