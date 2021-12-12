diff --git a/core/java/android/widget/Editor.java b/core/java/android/widget/Editor.java
index 936da32..2aaad7a 100644
--- a/core/java/android/widget/Editor.java
+++ b/core/java/android/widget/Editor.java
@@ -3110,7 +3110,7 @@
                             if (isTopLeftVisible || isBottomRightVisible) {
                                 characterBoundsFlags |= CursorAnchorInfo.FLAG_HAS_VISIBLE_REGION;
                             }
-                            if (!isTopLeftVisible || !isTopLeftVisible) {
+                            if (!isTopLeftVisible || !isBottomRightVisible) {
                                 characterBoundsFlags |= CursorAnchorInfo.FLAG_HAS_INVISIBLE_REGION;
                             }
                             if (isRtl) {
