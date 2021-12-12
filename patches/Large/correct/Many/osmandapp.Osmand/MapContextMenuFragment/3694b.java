diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenuFragment.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenuFragment.java
index 5a49f19..4b1d174 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenuFragment.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/MapContextMenuFragment.java
@@ -138,7 +138,7 @@
 		TextView line2 = (TextView) view.findViewById(R.id.context_menu_line2);
 		line2.setText(MapContextMenu.getInstance().getLocationStr());
 
-		final ImageButton buttonNavigate = (ImageButton) view.findViewById(R.id.context_menu_route_button);
+		final ImageView buttonNavigate = (ImageView) view.findViewById(R.id.context_menu_route_button);
 		buttonNavigate.setOnClickListener(new View.OnClickListener() {
 			@Override
 			public void onClick(View v) {
@@ -146,7 +146,7 @@
 			}
 		});
 
-		final ImageButton buttonFavorite = (ImageButton) view.findViewById(R.id.context_menu_fav_button);
+		final ImageView buttonFavorite = (ImageView) view.findViewById(R.id.context_menu_fav_button);
 		buttonFavorite.setOnClickListener(new View.OnClickListener() {
 			@Override
 			public void onClick(View v) {
@@ -154,7 +154,7 @@
 			}
 		});
 
-		final ImageButton buttonShare = (ImageButton) view.findViewById(R.id.context_menu_share_button);
+		final ImageView buttonShare = (ImageView) view.findViewById(R.id.context_menu_share_button);
 		buttonShare.setOnClickListener(new View.OnClickListener() {
 			@Override
 			public void onClick(View v) {
@@ -162,7 +162,7 @@
 			}
 		});
 
-		final ImageButton buttonMore = (ImageButton) view.findViewById(R.id.context_menu_more_button);
+		final ImageView buttonMore = (ImageView) view.findViewById(R.id.context_menu_more_button);
 		buttonMore.setOnClickListener(new View.OnClickListener() {
 			@Override
 			public void onClick(View v) {
