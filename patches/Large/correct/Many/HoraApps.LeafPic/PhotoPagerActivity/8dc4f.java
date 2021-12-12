diff --git a/app/src/main/java/com/horaapps/leafpic/PhotoPagerActivity.java b/app/src/main/java/com/horaapps/leafpic/PhotoPagerActivity.java
index e8b15f5..be4f54c 100644
--- a/app/src/main/java/com/horaapps/leafpic/PhotoPagerActivity.java
+++ b/app/src/main/java/com/horaapps/leafpic/PhotoPagerActivity.java
@@ -540,7 +540,7 @@
                 //MAP
                 final LinearLayout llMap = (LinearLayout) Details_DialogLayout.findViewById(R.id.ll_map);
                 final ImageView imgMap = (ImageView) Details_DialogLayout.findViewById(R.id.img_Map);
-                final LinearLayout llLocation=(LinearLayout)Delete_dialogLayout.findViewById(R.id.ll_location);
+                final LinearLayout llLocation =(LinearLayout) Details_DialogLayout.findViewById(R.id.ll_location);
                 /*
                 Glide.with(this)
                         .load(album.getCurrentPhoto().Path)
