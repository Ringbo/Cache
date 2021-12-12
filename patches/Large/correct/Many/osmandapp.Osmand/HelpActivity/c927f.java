diff --git a/OsmAnd/src/net/osmand/plus/activities/HelpActivity.java b/OsmAnd/src/net/osmand/plus/activities/HelpActivity.java
index a33be02..3df7b7d 100644
--- a/OsmAnd/src/net/osmand/plus/activities/HelpActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/HelpActivity.java
@@ -176,7 +176,7 @@
 
 			String releasedate = "";
 			if (!this.getString(R.string.app_edition).equals("")) {
-				releasedate = ", " + this.getString(R.string.shared_string_release).toLowercase() + ": " + this.getString(R.string.app_edition);
+				releasedate = ", " + this.getString(R.string.shared_string_release).toLowerCase() + ": " + this.getString(R.string.app_edition);
 			}
 			String version = Version.getFullVersion(getOsmandApplication()) + " " + releasedate;
 			ShowArticleOnTouchListener listener = new ShowArticleOnTouchListener(
