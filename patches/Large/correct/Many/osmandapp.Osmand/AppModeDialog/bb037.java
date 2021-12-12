diff --git a/OsmAnd/src/net/osmand/plus/activities/actions/AppModeDialog.java b/OsmAnd/src/net/osmand/plus/activities/actions/AppModeDialog.java
index c83aca5..7dfd4ae 100644
--- a/OsmAnd/src/net/osmand/plus/activities/actions/AppModeDialog.java
+++ b/OsmAnd/src/net/osmand/plus/activities/actions/AppModeDialog.java
@@ -102,7 +102,7 @@
 		newButtons[buttons.length] = tb;
 		tb.setTextOn("");
 		tb.setTextOff("");
-		int left = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, a.getResources().getDisplayMetrics());
+		int left = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2, a.getResources().getDisplayMetrics());
 		int metrics = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 64, a.getResources().getDisplayMetrics());
 		tb.setButtonDrawable(R.drawable.ic_other_modes);
 		LayoutParams lp = new LayoutParams(metrics, metrics);
@@ -238,7 +238,7 @@
 	static private ToggleButton createToggle(Context ctx, LinearLayout layout, ApplicationMode mode, boolean drawer){
 		int margin = 0;
 		if (drawer) {
-			margin = 5;
+			margin = 2;
 		} else {
 			margin = 10;
 		}
