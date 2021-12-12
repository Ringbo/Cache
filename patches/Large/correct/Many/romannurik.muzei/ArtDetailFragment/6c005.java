diff --git a/main/src/main/java/com/google/android/apps/muzei/ArtDetailFragment.java b/main/src/main/java/com/google/android/apps/muzei/ArtDetailFragment.java
index 26caa91..b38cb1e 100644
--- a/main/src/main/java/com/google/android/apps/muzei/ArtDetailFragment.java
+++ b/main/src/main/java/com/google/android/apps/muzei/ArtDetailFragment.java
@@ -110,10 +110,10 @@
                 bylineFont = R.font.alegreya_italic;
             }
 
-            mTitleView.setTypeface(ResourcesCompat.getFont(getContext(), titleFont));
+            mTitleView.setTypeface(ResourcesCompat.getFont(requireContext(), titleFont));
             mTitleView.setText(currentArtwork.title);
 
-            mBylineView.setTypeface(ResourcesCompat.getFont(getContext(), bylineFont));
+            mBylineView.setTypeface(ResourcesCompat.getFont(requireContext(), bylineFont));
             mBylineView.setText(currentArtwork.byline);
 
             String attribution = currentArtwork.attribution;
@@ -302,7 +302,7 @@
 
         view.findViewById(R.id.image_error_retry_button).setOnClickListener(v -> {
             showNextFakeLoading();
-            getContext().startService(TaskQueueService.getDownloadCurrentArtworkIntent(getContext()));
+            requireContext().startService(TaskQueueService.getDownloadCurrentArtworkIntent(getContext()));
         });
 
         EventBus.getDefault().register(this);
@@ -374,7 +374,7 @@
                     | View.SYSTEM_UI_FLAG_FULLSCREEN
                     | View.SYSTEM_UI_FLAG_IMMERSIVE;
         }
-        getActivity().getWindow().getDecorView().setSystemUiVisibility(flags);
+        requireActivity().getWindow().getDecorView().setSystemUiVisibility(flags);
     }
 
     @Subscribe
