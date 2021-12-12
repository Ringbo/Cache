diff --git a/lib/src/main/java/app/philm/in/controllers/MovieController.java b/lib/src/main/java/app/philm/in/controllers/MovieController.java
index 688b316..d8328f7 100644
--- a/lib/src/main/java/app/philm/in/controllers/MovieController.java
+++ b/lib/src/main/java/app/philm/in/controllers/MovieController.java
@@ -212,7 +212,7 @@
     @Subscribe
     public void onMovieWatchingChanged(MoviesState.WatchlistChangedEvent event) {
         WatchingMovie watching = mMoviesState.getWatchingMovie();
-        if (watching.movie != null) {
+        if (watching != null && watching.movie != null) {
             fetchDetailMovieIfNeeded(0, watching.movie.getImdbId());
         }
     }
