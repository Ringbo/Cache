diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/builders/AmenityMenuBuilder.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/builders/AmenityMenuBuilder.java
index 8d1bdee..176404f 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/builders/AmenityMenuBuilder.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/builders/AmenityMenuBuilder.java
@@ -104,13 +104,13 @@
 		// Icon
 		LinearLayout llIcon = new LinearLayout(view.getContext());
 		llIcon.setOrientation(LinearLayout.HORIZONTAL);
-		llIcon.setLayoutParams(new LinearLayout.LayoutParams(dpToPx(72f), dpToPx(48f)));
+		llIcon.setLayoutParams(new LinearLayout.LayoutParams(dpToPx(64f), dpToPx(48f)));
 		llIcon.setGravity(Gravity.CENTER_VERTICAL);
 		ll.addView(llIcon);
 
 		ImageView iconView = new ImageView(view.getContext());
 		LinearLayout.LayoutParams llIconParams = new LinearLayout.LayoutParams(dpToPx(24f), dpToPx(24f));
-		llIconParams.setMargins(dpToPx(16f), dpToPx(12f), dpToPx(32f), dpToPx(12f));
+		llIconParams.setMargins(dpToPx(16f), dpToPx(12f), dpToPx(24f), dpToPx(12f));
 		llIconParams.gravity = Gravity.CENTER_VERTICAL;
 		iconView.setLayoutParams(llIconParams);
 		iconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
@@ -175,7 +175,7 @@
 			ll.addView(llIconCollapse);
 
 			LinearLayout.LayoutParams llIconCollapseParams = new LinearLayout.LayoutParams(dpToPx(24f), dpToPx(24f));
-			llIconCollapseParams.setMargins(0, dpToPx(12f), dpToPx(32f), dpToPx(12f));
+			llIconCollapseParams.setMargins(0, dpToPx(12f), dpToPx(24f), dpToPx(12f));
 			llIconCollapseParams.gravity = Gravity.CENTER_VERTICAL;
 			iconViewCollapse.setLayoutParams(llIconCollapseParams);
 			iconViewCollapse.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
