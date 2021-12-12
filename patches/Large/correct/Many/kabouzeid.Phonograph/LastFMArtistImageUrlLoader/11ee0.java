diff --git a/app/src/main/java/com/kabouzeid/gramophone/lastfm/artist/LastFMArtistImageUrlLoader.java b/app/src/main/java/com/kabouzeid/gramophone/lastfm/artist/LastFMArtistImageUrlLoader.java
index 1f40b02..ff0ce65 100644
--- a/app/src/main/java/com/kabouzeid/gramophone/lastfm/artist/LastFMArtistImageUrlLoader.java
+++ b/app/src/main/java/com/kabouzeid/gramophone/lastfm/artist/LastFMArtistImageUrlLoader.java
@@ -16,7 +16,7 @@
     public static final String TAG = LastFMArtistImageUrlLoader.class.getSimpleName();
 
     public static void loadArtistImageUrl(final Context context, String queryArtist, boolean forceDownload, final ArtistImageUrlLoaderCallback callback) {
-        if (queryArtist != null) {
+        if (queryArtist != null && !queryArtist.trim().equals("<unknown>")) {
             String artistJSON = ArtistJSONStore.getInstance(context).getArtistJSON(queryArtist);
             if (artistJSON != null && !forceDownload) {
                 try {
