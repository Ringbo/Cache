diff --git a/app/src/main/java/org/schabi/newpipe/fragments/detail/VideoDetailFragment.java b/app/src/main/java/org/schabi/newpipe/fragments/detail/VideoDetailFragment.java
index 2f73e75..5b445e8 100644
--- a/app/src/main/java/org/schabi/newpipe/fragments/detail/VideoDetailFragment.java
+++ b/app/src/main/java/org/schabi/newpipe/fragments/detail/VideoDetailFragment.java
@@ -546,7 +546,7 @@
             });
         }
 
-        if (TextUtils.isEmpty(info.getUploaderAvatarUrl())) {
+        if (!TextUtils.isEmpty(info.getUploaderAvatarUrl())) {
             imageLoader.displayImage(info.getUploaderAvatarUrl(), uploaderThumb, DISPLAY_AVATAR_OPTIONS);
         }
     }
