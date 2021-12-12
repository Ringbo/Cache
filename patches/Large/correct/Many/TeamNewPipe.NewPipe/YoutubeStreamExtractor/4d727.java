diff --git a/app/src/main/java/org/schabi/newpipe/extractor/services/youtube/YoutubeStreamExtractor.java b/app/src/main/java/org/schabi/newpipe/extractor/services/youtube/YoutubeStreamExtractor.java
index 384df67..1f9e65d 100644
--- a/app/src/main/java/org/schabi/newpipe/extractor/services/youtube/YoutubeStreamExtractor.java
+++ b/app/src/main/java/org/schabi/newpipe/extractor/services/youtube/YoutubeStreamExtractor.java
@@ -386,7 +386,7 @@
         Vector<VideoInfo.AudioStream> audioStreams = new Vector<>();
         try{
             String encoded_url_map;
-            if (videoInfoPage == null) {
+            if (playerArgs == null) {
                 encoded_url_map = videoInfoPage.get("adaptive_fmts");
             } else {
                 encoded_url_map = playerArgs.getString("adaptive_fmts");
