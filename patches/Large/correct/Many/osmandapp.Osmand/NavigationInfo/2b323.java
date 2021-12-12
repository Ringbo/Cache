diff --git a/OsmAnd/src/net/osmand/access/NavigationInfo.java b/OsmAnd/src/net/osmand/access/NavigationInfo.java
index 1674659..a039d16 100644
--- a/OsmAnd/src/net/osmand/access/NavigationInfo.java
+++ b/OsmAnd/src/net/osmand/access/NavigationInfo.java
@@ -267,7 +267,7 @@
 
 
     // Show all available info
-	public void show(final LatLon point, Float heading) {
+	public void show(final LatLon point, Float heading, Context ctx) {
 		final List<String> attributes = new ArrayList<String>();
 		String item;
 
@@ -286,7 +286,7 @@
 		if (attributes.isEmpty())
 			attributes.add(getString(R.string.no_info));
 
-		AlertDialog.Builder info = new AlertDialog.Builder(app);
+		AlertDialog.Builder info = new AlertDialog.Builder(ctx);
 		if (point != null)
 			info.setPositiveButton(autoAnnounce ? R.string.auto_announce_off : R.string.auto_announce_on,
 					new DialogInterface.OnClickListener() {
