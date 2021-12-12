diff --git a/library-core/src/main/java/com/mikepenz/iconics/view/IconicsImageView.java b/library-core/src/main/java/com/mikepenz/iconics/view/IconicsImageView.java
index 2584cd1..24861b4 100644
--- a/library-core/src/main/java/com/mikepenz/iconics/view/IconicsImageView.java
+++ b/library-core/src/main/java/com/mikepenz/iconics/view/IconicsImageView.java
@@ -139,7 +139,7 @@
         if (mSize != -1) {
             mIcon.sizePx(mSize);
         }
-        if (mSize != -1) {
+        if (mPadding != -1) {
             mIcon.paddingPx(mPadding);
         }
         if (mContourColor != 0) {
