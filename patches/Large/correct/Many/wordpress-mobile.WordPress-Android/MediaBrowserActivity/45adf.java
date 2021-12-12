diff --git a/WordPress/src/main/java/org/wordpress/android/ui/media/MediaBrowserActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/media/MediaBrowserActivity.java
index b34436e..2307405 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/media/MediaBrowserActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/media/MediaBrowserActivity.java
@@ -290,7 +290,7 @@
             mMediaItemFragment = MediaItemFragment.newInstance(mediaId);
             ft.add(R.id.media_browser_container, mMediaItemFragment, MediaItemFragment.TAG);
             ft.addToBackStack(null);
-            ft.commit();
+            ft.commitAllowingStateLoss();
         }
     }
 
