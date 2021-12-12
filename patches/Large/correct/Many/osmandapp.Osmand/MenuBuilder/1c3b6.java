diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/MenuBuilder.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/MenuBuilder.java
index cd919da..6c069d5 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/MenuBuilder.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/MenuBuilder.java
@@ -450,13 +450,13 @@
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
@@ -508,7 +508,7 @@
 			ll.addView(llIconCollapse);
 
 			LinearLayout.LayoutParams llIconCollapseParams = new LinearLayout.LayoutParams(dpToPx(24f), dpToPx(24f));
-			llIconCollapseParams.setMargins(0, dpToPx(12f), dpToPx(32f), dpToPx(12f));
+			llIconCollapseParams.setMargins(0, dpToPx(12f), dpToPx(24f), dpToPx(12f));
 			llIconCollapseParams.gravity = Gravity.CENTER_VERTICAL;
 			iconViewCollapse.setLayoutParams(llIconCollapseParams);
 			iconViewCollapse.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
@@ -610,7 +610,7 @@
 		LinearLayout.LayoutParams llHorLineParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dpToPx(1f));
 		llHorLineParams.gravity = Gravity.BOTTOM;
 		if (!matchWidth) {
-			llHorLineParams.setMargins(dpToPx(72f), 0, 0, 0);
+			llHorLineParams.setMargins(dpToPx(64f), 0, 0, 0);
 		}
 		horizontalLine.setLayoutParams(llHorLineParams);
 		horizontalLine.setBackgroundColor(app.getResources().getColor(light ? R.color.ctx_menu_info_divider_light : R.color.ctx_menu_info_divider_dark));
@@ -672,7 +672,7 @@
 		final TextViewEx textView = new TextViewEx(context);
 		textView.setVisibility(collapsed ? View.GONE : View.VISIBLE);
 		LinearLayout.LayoutParams llTextDescParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
-		llTextDescParams.setMargins(dpToPx(72f), 0, dpToPx(40f), dpToPx(13f));
+		llTextDescParams.setMargins(dpToPx(64f), 0, dpToPx(40f), dpToPx(13f));
 		textView.setLayoutParams(llTextDescParams);
 		textView.setTypeface(FontCache.getRobotoRegular(context));
 		textView.setTextSize(16);
@@ -690,7 +690,7 @@
 		view.setOrientation(LinearLayout.VERTICAL);
 		view.setVisibility(collapsed ? View.GONE : View.VISIBLE);
 		LinearLayout.LayoutParams llParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
-		llParams.setMargins(dpToPx(68f), 0, dpToPx(12f), 0);
+		llParams.setMargins(dpToPx(64f), 0, dpToPx(12f), 0);
 		view.setLayoutParams(llParams);
 
 		ColorStateList buttonColorStateList = new ColorStateList(
