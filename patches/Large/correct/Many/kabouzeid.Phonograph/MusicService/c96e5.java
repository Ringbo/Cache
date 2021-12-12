diff --git a/app/src/main/java/com/kabouzeid/gramophone/service/MusicService.java b/app/src/main/java/com/kabouzeid/gramophone/service/MusicService.java
index 2042778..dbabf5e 100644
--- a/app/src/main/java/com/kabouzeid/gramophone/service/MusicService.java
+++ b/app/src/main/java/com/kabouzeid/gramophone/service/MusicService.java
@@ -796,7 +796,7 @@
         //to let other apps know whats playing. i.E. last.fm (scrobbling) or musixmatch
         final Intent intent = new Intent(what);
         final int position = getPosition();
-        if(position >= 0) {
+        if (position >= 0 && !playingQueue.isEmpty()) {
             final Song currentSong = playingQueue.get(position);
             intent.putExtra("id", currentSong.id);
             intent.putExtra("artist", currentSong.artistName);
