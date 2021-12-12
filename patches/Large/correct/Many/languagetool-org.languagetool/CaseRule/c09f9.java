diff --git a/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/CaseRule.java b/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/CaseRule.java
index d77c9cc..266d660 100644
--- a/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/CaseRule.java
+++ b/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/CaseRule.java
@@ -760,7 +760,7 @@
     if (!isPotentialError &&
         lowercaseReadings != null
         && (tokens[pos].hasPosTag("SUB:NOM:SIN:NEU:INF") || tokens[pos].hasPosTag("SUB:DAT:PLU:MAS"))
-        && ("zu".equals(tokens[pos-1].getToken()) || hasPartialTag(tokens[pos-1], "SUB", "EIG", "VER:AUX:3:"))) {
+        && ("zu".equals(tokens[pos-1].getToken()) || hasPartialTag(tokens[pos-1], "SUB", "EIG", "VER:AUX:3:", "ADV:TMP"))) {
       // find error in: "Der Brief wird morgen Übergeben." / "Die Ausgaben haben eine Mrd. Euro Überschritten."
       isPotentialError |= lowercaseReadings.hasPosTag("PA2:PRD:GRU:VER") && !hasPartialTag(tokens[pos-1], "VER:AUX:3:");
       // find error in: "Er lässt das Arktisbohrverbot Überprüfen."
