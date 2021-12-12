diff --git a/samples/giphy/src/main/java/com/bumptech/glide/samples/giphy/FullscreenActivity.java b/samples/giphy/src/main/java/com/bumptech/glide/samples/giphy/FullscreenActivity.java
index 7da7a67..4e7e69c 100644
--- a/samples/giphy/src/main/java/com/bumptech/glide/samples/giphy/FullscreenActivity.java
+++ b/samples/giphy/src/main/java/com/bumptech/glide/samples/giphy/FullscreenActivity.java
@@ -66,15 +66,15 @@
                         .transcode(new BitmapToGlideDrawableTranscoder(this), GlideDrawable.class)
                         .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                 )
-                .listener(new RequestListener<String, GlideDrawable>() {
+                .listener(new RequestListener<Object, GlideDrawable>() {
                     @Override
-                    public boolean onException(Exception e, String model, Target<GlideDrawable> target,
+                    public boolean onException(Exception e, Object model, Target<GlideDrawable> target,
                             boolean isFirstResource) {
                         return false;
                     }
 
                     @Override
-                    public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target,
+                    public boolean onResourceReady(GlideDrawable resource, Object model, Target<GlideDrawable> target,
                             boolean isFromMemoryCache, boolean isFirstResource) {
                         if (resource instanceof GifDrawable) {
                             gifDrawable = (GifDrawable) resource;
