diff --git a/OsmAnd/src/net/osmand/plus/download/LocalIndexesFragment.java b/OsmAnd/src/net/osmand/plus/download/LocalIndexesFragment.java
index d4af2e9..e147562 100644
--- a/OsmAnd/src/net/osmand/plus/download/LocalIndexesFragment.java
+++ b/OsmAnd/src/net/osmand/plus/download/LocalIndexesFragment.java
@@ -391,7 +391,7 @@
 		protected void onPostExecute(String result) {
 			getDownloadActivity().setProgressBarIndeterminateVisibility(false);
 			AccessibleToast.makeText(getDownloadActivity(), result, Toast.LENGTH_LONG).show();
-			if (operation == RESTORE_OPERATION){
+			if (operation == RESTORE_OPERATION || operation == BACKUP_OPERATION){
 				listAdapter.clear();
 				reloadIndexes();
 			}
