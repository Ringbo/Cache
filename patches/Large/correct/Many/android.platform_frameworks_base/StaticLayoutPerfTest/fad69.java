diff --git a/apct-tests/perftests/core/src/android/text/StaticLayoutPerfTest.java b/apct-tests/perftests/core/src/android/text/StaticLayoutPerfTest.java
index bab2a85..231aaf2 100644
--- a/apct-tests/perftests/core/src/android/text/StaticLayoutPerfTest.java
+++ b/apct-tests/perftests/core/src/android/text/StaticLayoutPerfTest.java
@@ -232,7 +232,7 @@
         while (state.keepRunning()) {
             state.pauseTiming();
             final MeasuredText text = new MeasuredText.Builder(
-                    mTextUtil.nextRandomParagraph(WORD_LENGTH, NO_STYLE_TEXT), PAINT)
+                    mTextUtil.nextRandomParagraph(WORD_LENGTH, STYLE_TEXT), PAINT)
                     .setBreakStrategy(Layout.BREAK_STRATEGY_SIMPLE)
                     .setHyphenationFrequency(Layout.HYPHENATION_FREQUENCY_NONE)
                     .build();
