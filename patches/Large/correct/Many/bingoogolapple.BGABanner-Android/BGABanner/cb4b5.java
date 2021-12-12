diff --git a/library/src/main/java/cn/bingoogolapple/bgabanner/BGABanner.java b/library/src/main/java/cn/bingoogolapple/bgabanner/BGABanner.java
index 785fb4e..5e2d553 100644
--- a/library/src/main/java/cn/bingoogolapple/bgabanner/BGABanner.java
+++ b/library/src/main/java/cn/bingoogolapple/bgabanner/BGABanner.java
@@ -383,7 +383,7 @@
      * @param resIds         每一页图片资源 id
      */
     public void setData(@Nullable BGALocalImageSize localImageSize, @Nullable ImageView.ScaleType scaleType, @DrawableRes int... resIds) {
-        if (localImageSize != null) {
+        if (localImageSize == null) {
             localImageSize = new BGALocalImageSize(720, 1280, 320, 640);
         }
         if (scaleType != null) {
