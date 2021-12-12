diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/builders/AmenityMenuBuilder.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/builders/AmenityMenuBuilder.java
index a80d0cc..fb0fdd2 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/builders/AmenityMenuBuilder.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/builders/AmenityMenuBuilder.java
@@ -659,7 +659,7 @@
 				}
 			});
 			buttons.add(button);
-			if (buttons.size() > 3) {
+			if (buttons.size() > 3 && categoryTypes.size() > 4) {
 				button.setVisibility(View.GONE);
 			}
 			view.addView(button);
@@ -672,7 +672,7 @@
 			view.addView(button);
 		}
 
-		if (categoryTypes.size() > 3) {
+		if (categoryTypes.size() > 4) {
 			final TextViewEx button = buildButtonInCollapsableView(context, false, true);
 			button.setText(context.getString(R.string.shared_string_show_all));
 			button.setOnClickListener(new View.OnClickListener() {
