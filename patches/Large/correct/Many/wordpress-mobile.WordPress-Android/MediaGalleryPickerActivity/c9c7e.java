diff --git a/WordPress/src/main/java/org/wordpress/android/ui/media/MediaGalleryPickerActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/media/MediaGalleryPickerActivity.java
index b2634af..7d18318 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/media/MediaGalleryPickerActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/media/MediaGalleryPickerActivity.java
@@ -78,7 +78,7 @@
         if (savedInstanceState != null) {
             mSite = (SiteModel) savedInstanceState.getSerializable(WordPress.SITE);
             mIsSelectOneItem = savedInstanceState.getBoolean(STATE_IS_SELECT_ONE_ITEM, mIsSelectOneItem);
-            if (savedInstanceState.containsKey(STATE_FILTERED_ITEMS)) {
+            if (savedInstanceState.containsKey(STATE_SELECTED_ITEMS)) {
                 ArrayList<Integer> list = ListUtils.fromIntArray(savedInstanceState.getIntArray(STATE_SELECTED_ITEMS));
                 selectedItems.addAll(list);
             }
