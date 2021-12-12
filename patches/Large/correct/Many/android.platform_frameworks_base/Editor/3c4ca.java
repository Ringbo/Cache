diff --git a/core/java/android/widget/Editor.java b/core/java/android/widget/Editor.java
index 7d3c9c9..51066e8 100644
--- a/core/java/android/widget/Editor.java
+++ b/core/java/android/widget/Editor.java
@@ -3273,7 +3273,7 @@
                             if (isTopLeftVisible || isBottomRightVisible) {
                                 characterBoundsFlags |= CursorAnchorInfo.FLAG_HAS_VISIBLE_REGION;
                             }
-                            if (!isTopLeftVisible || !isTopLeftVisible) {
+                            if (!isTopLeftVisible || !isBottomRightVisible) {
                                 characterBoundsFlags |= CursorAnchorInfo.FLAG_HAS_INVISIBLE_REGION;
                             }
                             if (isRtl) {
