diff --git a/lib/src/main/java/app/philm/in/tasks/FetchTraktDetailMovieRunnable.java b/lib/src/main/java/app/philm/in/tasks/FetchTraktDetailMovieRunnable.java
index b5678fe..9335506 100644
--- a/lib/src/main/java/app/philm/in/tasks/FetchTraktDetailMovieRunnable.java
+++ b/lib/src/main/java/app/philm/in/tasks/FetchTraktDetailMovieRunnable.java
@@ -34,7 +34,7 @@
 
     @Override
     public void onError(RetrofitError re) {
-        if (re.getResponse().getStatus() == 404) {
+        if (re != null && re.getResponse().getStatus() == 404) {
             PhilmMovie movie = mMoviesState.getMovie(mId);
             if (movie != null) {
                 movie.setLoadedFromTrakt(false);
