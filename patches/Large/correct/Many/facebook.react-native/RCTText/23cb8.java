diff --git a/ReactAndroid/src/main/java/com/facebook/react/flat/RCTText.java b/ReactAndroid/src/main/java/com/facebook/react/flat/RCTText.java
index f8ca212..ef5465c 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/flat/RCTText.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/flat/RCTText.java
@@ -339,7 +339,7 @@
 
     sTextLayoutBuilder.setTextStyle(textStyle);
 
-    sTextLayoutBuilder.textDirection(TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR);
+    sTextLayoutBuilder.setTextDirection(TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR);
     sTextLayoutBuilder.setIncludeFontPadding(shouldIncludeFontPadding);
     sTextLayoutBuilder.setTextSpacingExtra(extraSpacing);
     sTextLayoutBuilder.setTextSpacingMultiplier(spacingMultiplier);
