diff --git a/app/src/main/java/com/kabouzeid/gramophone/lastfm/artist/LastFMArtistThumbnailUrlLoader.java b/app/src/main/java/com/kabouzeid/gramophone/lastfm/artist/LastFMArtistThumbnailUrlLoader.java
index d8cff93..edcd2d8 100644
--- a/app/src/main/java/com/kabouzeid/gramophone/lastfm/artist/LastFMArtistThumbnailUrlLoader.java
+++ b/app/src/main/java/com/kabouzeid/gramophone/lastfm/artist/LastFMArtistThumbnailUrlLoader.java
@@ -20,7 +20,7 @@
     public static final String TAG = LastFMArtistThumbnailUrlLoader.class.getSimpleName();
 
     public static void loadArtistThumbnailUrl(final Context context, String queryArtist, boolean forceDownload, final ArtistThumbnailUrlLoaderCallback callback) {
-        if (queryArtist != null) {
+        if (queryArtist != null && !queryArtist.trim().equals("<unknown>")) {
             String artistJSON = ArtistJSONStore.getInstance(context).getArtistJSON(queryArtist);
             if (artistJSON != null && !forceDownload) {
                 try {
