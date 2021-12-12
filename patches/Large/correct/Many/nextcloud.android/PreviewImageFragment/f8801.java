diff --git a/src/main/java/com/owncloud/android/ui/preview/PreviewImageFragment.java b/src/main/java/com/owncloud/android/ui/preview/PreviewImageFragment.java
index 173e2b5..94b02fd 100644
--- a/src/main/java/com/owncloud/android/ui/preview/PreviewImageFragment.java
+++ b/src/main/java/com/owncloud/android/ui/preview/PreviewImageFragment.java
@@ -601,11 +601,11 @@
         layers[0] = r.getDrawable(R.color.white);
         Drawable bitmapDrawable;
 
-        if (result.ocFile.getMimetype().equalsIgnoreCase(MIME_TYPE_PNG)) {
+        if (result.ocFile.getMimeType().equalsIgnoreCase(MIME_TYPE_PNG)) {
             bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
-        } else if (result.ocFile.getMimetype().equalsIgnoreCase(MIME_TYPE_SVG)) {
+        } else if (result.ocFile.getMimeType().equalsIgnoreCase(MIME_TYPE_SVG)) {
             bitmapDrawable = result.drawable;
-        } else if (result.ocFile.getMimetype().equalsIgnoreCase(MIME_TYPE_GIF)) {
+        } else if (result.ocFile.getMimeType().equalsIgnoreCase(MIME_TYPE_GIF)) {
             try {
                 bitmapDrawable = new GifDrawable(result.ocFile.getStoragePath());
             } catch (IOException exception) {
@@ -624,7 +624,7 @@
                 int bitmapWidth;
                 int bitmapHeight;
 
-                if (result.ocFile.getMimetype().equalsIgnoreCase(MIME_TYPE_PNG)) {
+                if (result.ocFile.getMimeType().equalsIgnoreCase(MIME_TYPE_PNG)) {
                     bitmapWidth = convertDpToPixel(bitmap.getWidth(),
                             getActivity());
                     bitmapHeight = convertDpToPixel(bitmap.getHeight(),
