diff --git a/app/src/main/java/com/leafpic/app/PhotosActivity.java b/app/src/main/java/com/leafpic/app/PhotosActivity.java
index c6ab28a..66bb928 100644
--- a/app/src/main/java/com/leafpic/app/PhotosActivity.java
+++ b/app/src/main/java/com/leafpic/app/PhotosActivity.java
@@ -136,7 +136,7 @@
                 @Override
                 public boolean onLongClick(View v) {
                     TextView is = (TextView) v.findViewById(R.id.photo_path);
-                    adapter.notifyItemChanged(photos.selectPhoto(is.getTag().toString(), true));
+                    adapter.notifyItemChanged(photos.toggleSelectPhoto(is.getTag().toString()));
                     editmode = true;
                     invalidateOptionsMenu();
                     return true;
