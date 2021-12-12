diff --git a/platform/platform-impl/src/com/intellij/openapi/diff/impl/highlighting/NumberedFragmentHighlighter.java b/platform/platform-impl/src/com/intellij/openapi/diff/impl/highlighting/NumberedFragmentHighlighter.java
index 0962ec5..f83f057 100644
--- a/platform/platform-impl/src/com/intellij/openapi/diff/impl/highlighting/NumberedFragmentHighlighter.java
+++ b/platform/platform-impl/src/com/intellij/openapi/diff/impl/highlighting/NumberedFragmentHighlighter.java
@@ -65,7 +65,7 @@
       myPreviousLineLeft = lineLeft;
     }
 
-    Pair<String, TextDiffTypeEnum> right = myLeftPrecalculated.get(lineRight);
+    Pair<String, TextDiffTypeEnum> right = myRightPrecalculated.get(lineRight);
     if (myPreviousLineRight == lineRight || right == null) {
       myAppender2.highlightText(fragment, drawBorder, null);
     } else {
