diff --git a/OsmAnd/src/net/osmand/plus/activities/NavigatePointFragment.java b/OsmAnd/src/net/osmand/plus/activities/NavigatePointFragment.java
index ce36ba4..86a70c7 100644
--- a/OsmAnd/src/net/osmand/plus/activities/NavigatePointFragment.java
+++ b/OsmAnd/src/net/osmand/plus/activities/NavigatePointFragment.java
@@ -208,13 +208,13 @@
 			public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
 				int newFormat = currentFormat;
 				String itm = (String) format.getItemAtPosition(position);
-				if (PointDescription.formatToHumanString(v.getContext(), PointDescription.FORMAT_DEGREES).equals(itm)) {
+				if (PointDescription.formatToHumanString(NavigatePointFragment.this.getContext(), PointDescription.FORMAT_DEGREES).equals(itm)) {
 					newFormat = PointDescription.FORMAT_DEGREES;
-				} else if (PointDescription.formatToHumanString(v.getContext(), PointDescription.FORMAT_MINUTES).equals(itm)) {
+				} else if (PointDescription.formatToHumanString(NavigatePointFragment.this.getContext(), PointDescription.FORMAT_MINUTES).equals(itm)) {
 					newFormat = PointDescription.FORMAT_MINUTES;
-				} else if (PointDescription.formatToHumanString(v.getContext(), PointDescription.FORMAT_SECONDS).equals(itm)) {
+				} else if (PointDescription.formatToHumanString(NavigatePointFragment.this.getContext(), PointDescription.FORMAT_SECONDS).equals(itm)) {
 					newFormat = PointDescription.FORMAT_SECONDS;
-				} else if (PointDescription.formatToHumanString(v.getContext(), PointDescription.UTM_FORMAT).equals(itm)) {
+				} else if (PointDescription.formatToHumanString(NavigatePointFragment.this.getContext(), PointDescription.UTM_FORMAT).equals(itm)) {
 					newFormat = PointDescription.UTM_FORMAT;
 				}
 				try { 
