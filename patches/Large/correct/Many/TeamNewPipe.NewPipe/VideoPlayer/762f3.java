diff --git a/app/src/main/java/org/schabi/newpipe/player/VideoPlayer.java b/app/src/main/java/org/schabi/newpipe/player/VideoPlayer.java
index 67e4e69..40b7df2 100644
--- a/app/src/main/java/org/schabi/newpipe/player/VideoPlayer.java
+++ b/app/src/main/java/org/schabi/newpipe/player/VideoPlayer.java
@@ -391,10 +391,10 @@
         // Create subtitle sources
         for (final Subtitles subtitle : info.getSubtitles()) {
             final String mimeType = PlayerHelper.mimeTypesOf(subtitle.getFileType());
-            if (mimeType == null) continue;
+            if (mimeType == null || context == null) continue;
 
             final Format textFormat = Format.createTextSampleFormat(null, mimeType,
-                    SELECTION_FLAG_AUTOSELECT, PlayerHelper.captionLanguageOf(subtitle));
+                    SELECTION_FLAG_AUTOSELECT, PlayerHelper.captionLanguageOf(context, subtitle));
             final MediaSource textSource = new SingleSampleMediaSource(
                     Uri.parse(subtitle.getURL()), cacheDataSourceFactory, textFormat, TIME_UNSET);
             mediaSources.add(textSource);
