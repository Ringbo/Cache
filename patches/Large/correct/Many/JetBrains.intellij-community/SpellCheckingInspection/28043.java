diff --git a/plugins/spellchecker/src/com/intellij/spellchecker/inspections/SpellCheckingInspection.java b/plugins/spellchecker/src/com/intellij/spellchecker/inspections/SpellCheckingInspection.java
index 5133c87..1a5badd 100644
--- a/plugins/spellchecker/src/com/intellij/spellchecker/inspections/SpellCheckingInspection.java
+++ b/plugins/spellchecker/src/com/intellij/spellchecker/inspections/SpellCheckingInspection.java
@@ -201,7 +201,7 @@
                                                            TextRange textRange, Collection<SpellCheckerQuickFix> fixes) {
     //TODO: these descriptions eat LOTS of HEAP on batch run - need either to make them constant or evaluate template dynamically
     //  ( add something like #text substitution)
-    final String defaultDescription = SpellCheckerBundle.message("word.0.1.is.misspelled",  token.getElement().getLanguage());
+    final String defaultDescription = SpellCheckerBundle.message("word.0.1.is.misspelled");
     final String tokenDescription = token.getDescription();
     final String description = tokenDescription == null ? defaultDescription : tokenDescription;
     final TextRange highlightRange = TextRange.from(token.getOffset() + textRange.getStartOffset(), textRange.getLength());
