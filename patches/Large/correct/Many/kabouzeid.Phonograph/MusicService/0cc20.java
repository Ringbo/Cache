diff --git a/app/src/main/java/com/kabouzeid/gramophone/service/MusicService.java b/app/src/main/java/com/kabouzeid/gramophone/service/MusicService.java
index 84dc7e1..5c0acc3 100644
--- a/app/src/main/java/com/kabouzeid/gramophone/service/MusicService.java
+++ b/app/src/main/java/com/kabouzeid/gramophone/service/MusicService.java
@@ -886,7 +886,7 @@
     }
 
     public void back(boolean force) {
-        if (getSongProgressMillis() > 2000) {
+        if (getSongProgressMillis() > 5000) {
             seek(0);
         } else {
             playPreviousSong(force);
