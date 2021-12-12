diff --git a/WordPress/src/main/java/org/wordpress/android/ui/comments/CommentsListFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/comments/CommentsListFragment.java
index 1b88f28..36b404b 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/comments/CommentsListFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/comments/CommentsListFragment.java
@@ -179,7 +179,7 @@
             mEmptyViewMessageType = EmptyViewMessageType.NO_CONTENT;
         }
 
-        if (!NetworkUtils.isNetworkAvailable(getActivity())) {
+        if (!NetworkUtils.checkConnection(getActivity())) {
             updateEmptyView(EmptyViewMessageType.NETWORK_ERROR);
             return;
         }
