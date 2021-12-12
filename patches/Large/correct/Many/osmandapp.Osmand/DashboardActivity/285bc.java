diff --git a/OsmAnd/src/net/osmand/plus/activities/DashboardActivity.java b/OsmAnd/src/net/osmand/plus/activities/DashboardActivity.java
index 0101b95..969fc18 100644
--- a/OsmAnd/src/net/osmand/plus/activities/DashboardActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/DashboardActivity.java
@@ -94,7 +94,7 @@
 		lp = getMyApplication().getLocationProvider();
 		
 		final String textVersion = Version.getFullVersion(getMyApplication());
-		getSupportActionBar().setTitle(textVersion.subString(0, textVersion.getIndex("#")));
+		getSupportActionBar().setTitle(textVersion.substring(0, textVersion.getIndex("#")));
 		ColorDrawable color = new ColorDrawable(getResources().getColor(R.color.actionbar_color));
 		getSupportActionBar().setBackgroundDrawable(color);
 		getSupportActionBar().setIcon(android.R.color.transparent);
