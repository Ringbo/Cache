diff --git a/OsmAnd/src/net/osmand/plus/activities/FavoritesTreeFragment.java b/OsmAnd/src/net/osmand/plus/activities/FavoritesTreeFragment.java
index 481ba31..27538c9 100644
--- a/OsmAnd/src/net/osmand/plus/activities/FavoritesTreeFragment.java
+++ b/OsmAnd/src/net/osmand/plus/activities/FavoritesTreeFragment.java
@@ -114,7 +114,7 @@
 	}
 
 	private void deleteFavorites() {
-		new AsyncTask<Void, Object, String>() {
+		new AsyncTask<Void, Object, Void>() {
 
 			@Override
 			protected void onPreExecute() {
@@ -122,17 +122,17 @@
 			}
 
 			@Override
-			protected void onPostExecute(String result) {
+			protected void onPostExecute(Void result) {
 				hideProgressBar();
 				favouritesAdapter.synchronizeGroups();
 			}
 
 			@Override
-			protected String doInBackground(Void... params) {
+			protected Void doInBackground(Void... params) {
 				helper.delete(groupsToDelete, getSelectedFavorites());
 				favoritesSelected.clear();
 				groupsToDelete.clear();
-				return getString(R.string.favourites_delete_multiple_succesful);
+				return null;
 			}
 
 		}.execute();
