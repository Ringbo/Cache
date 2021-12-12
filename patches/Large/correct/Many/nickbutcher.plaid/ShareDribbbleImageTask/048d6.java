diff --git a/dribbble/src/main/java/io/plaidapp/dribbble/ui/ShareDribbbleImageTask.java b/dribbble/src/main/java/io/plaidapp/dribbble/ui/ShareDribbbleImageTask.java
index 5f49210..789d27f 100644
--- a/dribbble/src/main/java/io/plaidapp/dribbble/ui/ShareDribbbleImageTask.java
+++ b/dribbble/src/main/java/io/plaidapp/dribbble/ui/ShareDribbbleImageTask.java
@@ -51,10 +51,10 @@
         final String url = shot.getImages().best();
         final Images.ImageSize size = shot.getImages().bestSize();
         try {
-            return Glide
-                    .with(activity)
+            Glide.with(activity)
+                 .asFile()
                     .load(url)
-                    .downloadOnly(size.getWidth(), size.getHeight())
+                 .submit(size.getWidth(), size.getHeight())
                     .get();
         } catch (Exception ex) {
             Log.w("SHARE", "Sharing " + url + " failed", ex);
