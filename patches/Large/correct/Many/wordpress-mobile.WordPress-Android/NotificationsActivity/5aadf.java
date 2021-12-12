diff --git a/src/org/wordpress/android/ui/notifications/NotificationsActivity.java b/src/org/wordpress/android/ui/notifications/NotificationsActivity.java
index 14f58e6..d2c8f59 100644
--- a/src/org/wordpress/android/ui/notifications/NotificationsActivity.java
+++ b/src/org/wordpress/android/ui/notifications/NotificationsActivity.java
@@ -337,7 +337,7 @@
         ReaderPostDetailFragment readerFragment = ReaderPostDetailFragment.newInstance(remoteBlogId, postId);
         String tagForFragment = getString(R.string.fragment_tag_reader_post_detail);
         FragmentTransaction ft = getFragmentManager().beginTransaction();
-        ft.replace(R.id.layout_fragment_container, readerFragment, tagForFragment)
+        ft.add(R.id.layout_fragment_container, readerFragment, tagForFragment)
                 .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                 .addToBackStack(tagForFragment)
                 .commit();
@@ -353,7 +353,7 @@
         CommentDetailFragment commentFragment = CommentDetailFragment.newInstance(note);
         String tagForFragment = getString(R.string.fragment_tag_comment_detail);
         FragmentTransaction ft = getFragmentManager().beginTransaction();
-        ft.replace(R.id.layout_fragment_container, commentFragment, tagForFragment)
+        ft.add(R.id.layout_fragment_container, commentFragment, tagForFragment)
                 .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                 .addToBackStack(tagForFragment)
                 .commit();
