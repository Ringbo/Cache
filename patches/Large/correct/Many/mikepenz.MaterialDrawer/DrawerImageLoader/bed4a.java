diff --git a/library/src/main/java/com/mikepenz/materialdrawer/util/DrawerImageLoader.java b/library/src/main/java/com/mikepenz/materialdrawer/util/DrawerImageLoader.java
index beffa5c..fa27002 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/util/DrawerImageLoader.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/util/DrawerImageLoader.java
@@ -50,7 +50,7 @@
      */
     public boolean setImage(ImageView imageView, Uri uri, String tag) {
         //if we do not handle all uris and are not http or https we keep the original behavior
-        if (mHandleAllUris || "http".equals(uri.getScheme()) || !"https".equals(uri.getScheme())) {
+        if (mHandleAllUris || "http".equals(uri.getScheme()) || "https".equals(uri.getScheme())) {
             if (imageLoader != null) {
                 Drawable placeHolder = imageLoader.placeholder(imageView.getContext(), tag);
                 imageLoader.set(imageView, uri, placeHolder);
