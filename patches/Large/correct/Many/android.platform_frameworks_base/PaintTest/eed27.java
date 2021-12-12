diff --git a/core/tests/coretests/src/android/graphics/PaintTest.java b/core/tests/coretests/src/android/graphics/PaintTest.java
index 5811ca0..fd27dca 100644
--- a/core/tests/coretests/src/android/graphics/PaintTest.java
+++ b/core/tests/coretests/src/android/graphics/PaintTest.java
@@ -148,7 +148,10 @@
                         " U+" + Integer.toHexString(vs) + ")";
                 final String testString =
                         codePointsToString(new int[] {testCase.mBaseCodepoint, vs});
-                if (testCase.mVariationSelectors.contains(vs)) {
+                if (vs == 0xFE0E // U+FE0E is the text presentation emoji. hasGlyph is expected to
+                                 // return true for that variation selector if the font has the base
+                                 // glyph.
+                             || testCase.mVariationSelectors.contains(vs)) {
                     assertTrue(signature + " is expected to be true", p.hasGlyph(testString));
                 } else {
                     assertFalse(signature + " is expected to be false", p.hasGlyph(testString));
