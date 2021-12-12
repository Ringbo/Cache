diff --git a/OsmAnd/src/net/osmand/plus/ContextMenuAdapter.java b/OsmAnd/src/net/osmand/plus/ContextMenuAdapter.java
index 96b4c70..55570ce 100644
--- a/OsmAnd/src/net/osmand/plus/ContextMenuAdapter.java
+++ b/OsmAnd/src/net/osmand/plus/ContextMenuAdapter.java
@@ -351,7 +351,7 @@
 				if (layoutId == R.layout.simple_list_menu_item) {
 					float density = activity.getResources().getDisplayMetrics().density;
 					int paddingInPixels = (int) (24 * density);
-					int drawableSizeInPixels = (int) (32 * density); // 32
+					int drawableSizeInPixels = (int) (24 * density); // 32
 					imageId.setBounds(0, 0, drawableSizeInPixels, drawableSizeInPixels);
 					tv.setCompoundDrawables(imageId, null, null, null);
 					tv.setCompoundDrawablePadding(paddingInPixels);
