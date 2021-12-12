diff --git a/app/src/main/java/com/naman14/timber/activities/SearchActivity.java b/app/src/main/java/com/naman14/timber/activities/SearchActivity.java
index 17f779a..85051fd 100644
--- a/app/src/main/java/com/naman14/timber/activities/SearchActivity.java
+++ b/app/src/main/java/com/naman14/timber/activities/SearchActivity.java
@@ -129,7 +129,7 @@
         }
         queryString = newText;
         if (!queryString.trim().equals("")) {
-            this.searchResults = new ArrayList<>();
+            this.searchResults = new ArrayList<>(27);
             List<Song> songList = SongLoader.searchSongs(this, queryString, 10);
             List<Album> albumList = AlbumLoader.getAlbums(this, queryString, 7);
             List<Artist> artistList = ArtistLoader.getArtists(this, queryString, 7);
