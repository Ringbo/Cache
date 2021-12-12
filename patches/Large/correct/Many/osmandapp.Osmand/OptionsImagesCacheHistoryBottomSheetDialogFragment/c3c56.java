diff --git a/OsmAnd/src/net/osmand/plus/wikivoyage/explore/OptionsImagesCacheHistoryBottomSheetDialogFragment.java b/OsmAnd/src/net/osmand/plus/wikivoyage/explore/OptionsImagesCacheHistoryBottomSheetDialogFragment.java
index 6bdfa17..2e803c1 100644
--- a/OsmAnd/src/net/osmand/plus/wikivoyage/explore/OptionsImagesCacheHistoryBottomSheetDialogFragment.java
+++ b/OsmAnd/src/net/osmand/plus/wikivoyage/explore/OptionsImagesCacheHistoryBottomSheetDialogFragment.java
@@ -24,7 +24,7 @@
 
 		items.add(new TitleItem(getString(R.string.shared_string_options)));
 
-		boolean showImages = getMyApplication().getSettings().SHOW_IMAGES.get();
+		boolean showImages = getMyApplication().getSettings().WIKIVOYAGE_SHOW_IMAGES.get();
 
 		BaseBottomSheetItem showWebviewImagesItem = new BottomSheetItemWithCompoundButton.Builder()
 				.setChecked(showImages)
@@ -35,7 +35,7 @@
 					@Override
 					public void onClick(View v) {
 						OsmandSettings settings = getMyApplication().getSettings();
-						settings.SHOW_IMAGES.set(!settings.SHOW_IMAGES.get());
+						settings.WIKIVOYAGE_SHOW_IMAGES.set(!settings.WIKIVOYAGE_SHOW_IMAGES.get());
 						dismiss();
 					}
 				})
@@ -44,7 +44,7 @@
 
 		BaseBottomSheetItem clearCacheItem = new BottomSheetItemWithDescription.Builder()
 				.setDescription(getString(R.string.shared_string_clear))
-				.setTitle(getString(R.string.images_cache))
+				.setTitle(getString(R.string.images_cache)+":")
 				.setLayoutId(R.layout.bottom_sheet_item_with_right_descr)
 				.setOnClickListener(new View.OnClickListener() {
 					@Override
