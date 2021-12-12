diff --git a/WordPress/src/main/java/org/wordpress/android/ui/posts/PostsListFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/posts/PostsListFragment.java
index ef435d8..b376e3b 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/posts/PostsListFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/posts/PostsListFragment.java
@@ -759,7 +759,7 @@
     public void onEventMainThread(UploadService.UploadMediaSuccessEvent event) {
         if (event.mediaModelList != null && !event.mediaModelList.isEmpty()) {
             UploadUtils.onMediaUploadedSnackbarHandler(getActivity(),
-                    getActivity().findViewById(R.id.coordinator), true,
+                    getActivity().findViewById(R.id.coordinator), false,
                     event.mediaModelList, event.successMessage);
         }
     }
