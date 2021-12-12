diff --git a/app/src/main/java/app/philm/in/model/PhilmMovie.java b/app/src/main/java/app/philm/in/model/PhilmMovie.java
index fd4e224..63adc75 100644
--- a/app/src/main/java/app/philm/in/model/PhilmMovie.java
+++ b/app/src/main/java/app/philm/in/model/PhilmMovie.java
@@ -111,7 +111,7 @@
         year = unbox(year, movie.year);
         inCollection = unbox(inCollection, movie.inCollection);
         inWatchlist = unbox(inWatchlist, movie.inWatchlist);
-        watched = unbox(inWatchlist, movie.watched);
+        watched = unbox(watched, movie.watched);
         plays = unbox(plays, movie.plays);
         releasedTime = unbox(releasedTime, movie.released);
 
@@ -134,7 +134,7 @@
     }
 
     public boolean isWatched() {
-        return watched;
+        return watched || plays > 0;
     }
 
     public void setWatched(boolean watched) {
