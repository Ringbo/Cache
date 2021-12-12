diff --git a/OsmAnd/src/net/osmand/activities/DownloadIndexActivity.java b/OsmAnd/src/net/osmand/activities/DownloadIndexActivity.java
index 542a486..620fc65 100644
--- a/OsmAnd/src/net/osmand/activities/DownloadIndexActivity.java
+++ b/OsmAnd/src/net/osmand/activities/DownloadIndexActivity.java
@@ -627,21 +627,21 @@
 				boolean f = true;
 				String lowerCase = e.getValue().toLowerCase();
 				if (lowerCase.contains("map")) { //$NON-NLS-1$
-					if (f) {
+					if (!f) {
 						s += ", "; //$NON-NLS-1$
 						f = false;
 					}
 					s += getString(R.string.map_index);
 				}
 				if (lowerCase.contains("transport")) { //$NON-NLS-1$
-					if (f) {
+					if (!f) {
 						s += ", "; //$NON-NLS-1$
 						f = false;
 					}
 					s += getString(R.string.transport);
 				}
 				if (lowerCase.contains("address")) { //$NON-NLS-1$
-					if (f) {
+					if (!f) {
 						s += ", "; //$NON-NLS-1$
 						f = false;
 					}
