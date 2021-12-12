diff --git a/flexible-adapter-app/src/main/java/eu/davidea/samples/flexibleadapter/MainActivity.java b/flexible-adapter-app/src/main/java/eu/davidea/samples/flexibleadapter/MainActivity.java
index 15c1ca3..e6bb8c4 100644
--- a/flexible-adapter-app/src/main/java/eu/davidea/samples/flexibleadapter/MainActivity.java
+++ b/flexible-adapter-app/src/main/java/eu/davidea/samples/flexibleadapter/MainActivity.java
@@ -405,12 +405,12 @@
 
 	@Override
 	public boolean onQueryTextChange(String newText) {
-		if (!mAdapter.hasSearchText() || mAdapter.hasNewSearchText(newText)) {
+		if (mAdapter.hasNewSearchText(newText)) {
 			Log.d(TAG, "onQueryTextChange newText: " + newText);
 			mAdapter.setSearchText(newText);
 			//Fill and Filter mItems with your custom list and automatically animate the changes
 			//Watch out! The original list must be a copy
-			mAdapter.filterItems(DatabaseService.getInstance().getDatabaseList(), 450L);
+			mAdapter.filterItems(DatabaseService.getInstance().getDatabaseList(), 0L);
 		}
 		//Disable SwipeRefresh if search is active!!
 		mSwipeRefreshLayout.setEnabled(!mAdapter.hasSearchText());
