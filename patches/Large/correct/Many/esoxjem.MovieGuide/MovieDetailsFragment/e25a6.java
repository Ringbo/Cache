diff --git a/app/src/main/java/com/esoxjem/movieguide/details/MovieDetailsFragment.java b/app/src/main/java/com/esoxjem/movieguide/details/MovieDetailsFragment.java
index 435d62d..9d45a30 100644
--- a/app/src/main/java/com/esoxjem/movieguide/details/MovieDetailsFragment.java
+++ b/app/src/main/java/com/esoxjem/movieguide/details/MovieDetailsFragment.java
@@ -185,7 +185,7 @@
             {
                 View thumbContainer = inflater.inflate(R.layout.video, this.trailers, false);
                 ImageView thumbView = ButterKnife.findById(thumbContainer, R.id.video_thumb);
-                thumbView.setTag(Video.getUrl(trailer));
+                thumbView.setTag(R.id.glide_tag, Video.getUrl(trailer));
                 thumbView.requestLayout();
                 thumbView.setOnClickListener(this);
                 Glide.with(getContext())
@@ -271,7 +271,7 @@
 
     private void onThumbnailClick(View view)
     {
-        String videoUrl = (String) view.getTag();
+        String videoUrl = (String) view.getTag(R.id.glide_tag);
         Intent playVideoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoUrl));
         startActivity(playVideoIntent);
     }
