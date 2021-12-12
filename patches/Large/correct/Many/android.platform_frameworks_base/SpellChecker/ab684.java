diff --git a/core/java/android/widget/SpellChecker.java b/core/java/android/widget/SpellChecker.java
index 6700829..c165bbf 100644
--- a/core/java/android/widget/SpellChecker.java
+++ b/core/java/android/widget/SpellChecker.java
@@ -309,7 +309,7 @@
                     final int length = mSpellParsers.length;
                     for (int i = 0; i < length; i++) {
                         final SpellParser spellParser = mSpellParsers[i];
-                        if (!spellParser.isFinished()) {
+                        if (!spellParser.isParsing()) {
                             spellParser.parse();
                             break; // run one spell parser at a time to bound running time
                         }
