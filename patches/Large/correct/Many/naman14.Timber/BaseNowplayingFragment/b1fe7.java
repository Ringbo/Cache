diff --git a/app/src/main/java/com/naman14/timber/nowplaying/BaseNowplayingFragment.java b/app/src/main/java/com/naman14/timber/nowplaying/BaseNowplayingFragment.java
index 8dbea64..f537ddd 100644
--- a/app/src/main/java/com/naman14/timber/nowplaying/BaseNowplayingFragment.java
+++ b/app/src/main/java/com/naman14/timber/nowplaying/BaseNowplayingFragment.java
@@ -88,7 +88,7 @@
             ab.setDisplayHomeAsUpEnabled(true);
             ab.setTitle("");
         }
-        if (mPlayPause!=null)
+        if (mPlayPause!=null && getActivity()!=null)
             mPlayPause.setColor(getActivity().getResources().getColor(android.R.color.white));
 
         if (playPauseFloating!=null) {
@@ -105,7 +105,7 @@
     private void setSongDetails(){
         updateSongDetails();
 
-        if (mProgress!=null)
+        if (mProgress!=null && getActivity()!=null)
         mProgress.getThumb().setColorFilter(getActivity().getResources().getColor(R.color.colorAccent), PorterDuff.Mode.SRC_IN);
 
         if (recyclerView!=null)
