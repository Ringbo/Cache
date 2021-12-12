diff --git a/languagetool-language-modules/ca/src/main/java/org/languagetool/rules/ca/CatalanWordRepeatRule.java b/languagetool-language-modules/ca/src/main/java/org/languagetool/rules/ca/CatalanWordRepeatRule.java
index 6c8a6b8..cf52c1d 100644
--- a/languagetool-language-modules/ca/src/main/java/org/languagetool/rules/ca/CatalanWordRepeatRule.java
+++ b/languagetool-language-modules/ca/src/main/java/org/languagetool/rules/ca/CatalanWordRepeatRule.java
@@ -40,7 +40,7 @@
 
   @Override
   public boolean ignore(AnalyzedTokenReadings[] tokens, int position) {
-    if (position > 0 && (tokens[position].isImmunized() || tokens[position-1].isImmunized())) {
+    if (position > 0 && (tokens[position].hasPosTag("_allow_repeat") || tokens[position-1].hasPosTag("_allow_repeat"))) {
       return true;
     }
     return false;
