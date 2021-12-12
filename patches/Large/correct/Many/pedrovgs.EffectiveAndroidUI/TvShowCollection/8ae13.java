diff --git a/app/src/main/java/com/github/pedrovgs/effectiveandroidui/ui/renderer/tvshow/TvShowCollection.java b/app/src/main/java/com/github/pedrovgs/effectiveandroidui/ui/renderer/tvshow/TvShowCollection.java
index 3d1411b..2d4e05e 100644
--- a/app/src/main/java/com/github/pedrovgs/effectiveandroidui/ui/renderer/tvshow/TvShowCollection.java
+++ b/app/src/main/java/com/github/pedrovgs/effectiveandroidui/ui/renderer/tvshow/TvShowCollection.java
@@ -65,7 +65,7 @@
   }
 
   @Override public void removeAll(Collection<TvShow> tvShows) {
-    this.tvShows.addAll(tvShows);
+    this.tvShows.removeAll(tvShows);
   }
 
   public void clear() {
