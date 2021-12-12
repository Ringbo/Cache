diff --git a/app/src/main/java/app/philm/in/controllers/MovieController.java b/app/src/main/java/app/philm/in/controllers/MovieController.java
index 609fbe8..48aa5ed 100644
--- a/app/src/main/java/app/philm/in/controllers/MovieController.java
+++ b/app/src/main/java/app/philm/in/controllers/MovieController.java
@@ -389,17 +389,17 @@
 
     @Subscribe
     public void onLibraryChanged(MoviesState.LibraryChangedEvent event) {
-        populateLibraryUi();
+        populateUi();
     }
 
     @Subscribe
     public void onTrendingChanged(MoviesState.TrendingChangedEvent event) {
-        populateTrendingUi();
+        populateUi();
     }
 
     @Subscribe
     public void onWatchlistChanged(MoviesState.WatchlistChangedEvent event) {
-        populateWatchlistUi();
+        populateUi();
     }
 
     @Subscribe
