diff --git a/magicasakura/src/main/java/com/bilibili/magicasakura/widgets/AppCompatForegroundHelper.java b/magicasakura/src/main/java/com/bilibili/magicasakura/widgets/AppCompatForegroundHelper.java
index 7c35b0c..0b11425 100644
--- a/magicasakura/src/main/java/com/bilibili/magicasakura/widgets/AppCompatForegroundHelper.java
+++ b/magicasakura/src/main/java/com/bilibili/magicasakura/widgets/AppCompatForegroundHelper.java
@@ -56,7 +56,7 @@
     void loadFromAttribute(AttributeSet attrs, int defStyleAttr) {
         TypedArray array = mView.getContext().obtainStyledAttributes(attrs, ATTR, defStyleAttr, 0);
         if (array.hasValue(1)) {
-            mForegroundResId = array.getResourceId(1, 0);
+            mForegroundTintResId = array.getResourceId(1, 0);
             if (array.hasValue(2)) {
                 setSupportForegroundTintMode(DrawableUtils.parseTintMode(array.getInt(2, 0), null));
             }
