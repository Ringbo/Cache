diff --git a/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java
index dc23f04..5780140 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java
@@ -519,7 +519,7 @@
     public void onEventMainThread(UploadService.UploadMediaSuccessEvent event) {
         if (event.mediaModelList != null && !event.mediaModelList.isEmpty()) {
             UploadUtils.onMediaUploadedSnackbarHandler(getActivity(),
-                    getActivity().findViewById(R.id.coordinator), true,
+                    getActivity().findViewById(R.id.coordinator), false,
                     event.mediaModelList, event.successMessage);
         }
     }
