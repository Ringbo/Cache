diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index 41daf70..12bc014 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -7682,8 +7682,9 @@
             }
         }
         
-        if (what instanceof UpdateAppearance ||
-            what instanceof ParagraphStyle) {
+        if (what instanceof UpdateAppearance || what instanceof ParagraphStyle
+                || (what instanceof SuggestionSpan && (((SuggestionSpan)what).getFlags()
+                        & SuggestionSpan.FLAG_AUTO_CORRECTION) != 0)) {
             if (ims == null || ims.mBatchEditNesting == 0) {
                 invalidate();
                 mHighlightPathBogus = true;
