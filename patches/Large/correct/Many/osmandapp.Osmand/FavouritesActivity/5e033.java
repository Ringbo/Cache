diff --git a/OsmAnd/src/net/osmand/plus/activities/FavouritesActivity.java b/OsmAnd/src/net/osmand/plus/activities/FavouritesActivity.java
index 11c448c..6d9bc5e 100644
--- a/OsmAnd/src/net/osmand/plus/activities/FavouritesActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/FavouritesActivity.java
@@ -282,7 +282,7 @@
 		if (aItem.getItemId() == DELETE_ITEM) {
 			final Resources resources = this.getResources();
 			Builder builder = new AlertDialog.Builder(this);
-			builder.setMessage(getString(R.string.favourites_remove_dialog_msg, info.getName()));
+			builder.setMessage(getString(R.string.favourites_remove_dialog_msg, point.getName()));
 			builder.setNegativeButton(R.string.default_buttons_no, null);
 			builder.setPositiveButton(R.string.default_buttons_yes, new DialogInterface.OnClickListener() {
 				@Override
