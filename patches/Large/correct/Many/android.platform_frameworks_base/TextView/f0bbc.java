diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index 67facbc..b9d3d43 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -7802,7 +7802,7 @@
      * Create new SpellCheckSpans on the modified region.
      */
     private void updateSpellCheckSpans(int start, int end, boolean createSpellChecker) {
-        if (isTextEditable() && isSuggestionsEnabled()) {
+        if (isTextEditable() && isSuggestionsEnabled() && !(this instanceof ExtractEditText)) {
             if (mSpellChecker == null && createSpellChecker) {
                 mSpellChecker = new SpellChecker(this);
             }
