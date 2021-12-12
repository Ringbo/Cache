diff --git a/OsmAnd/src/net/osmand/plus/mapmarkers/MapMarkersDbHelper.java b/OsmAnd/src/net/osmand/plus/mapmarkers/MapMarkersDbHelper.java
index defcfbf..2d7ba24 100644
--- a/OsmAnd/src/net/osmand/plus/mapmarkers/MapMarkersDbHelper.java
+++ b/OsmAnd/src/net/osmand/plus/mapmarkers/MapMarkersDbHelper.java
@@ -214,7 +214,7 @@
 	}
 
 	public void removeMarkersGroup(String id) {
-		SQLiteConnection db = openConnection(true);
+		SQLiteConnection db = openConnection(false);
 		if (db != null) {
 			try {
 				db.execSQL("DELETE FROM " + GROUPS_TABLE_NAME + " WHERE " + GROUPS_COL_ID + " = ?", new Object[]{id});
@@ -225,7 +225,7 @@
 	}
 
 	public void removeActiveMarkersFromGroup(String groupId) {
-		SQLiteConnection db = openConnection(true);
+		SQLiteConnection db = openConnection(false);
 		if (db != null) {
 			try {
 				db.execSQL("DELETE FROM " + MARKERS_TABLE_NAME +
@@ -562,7 +562,7 @@
 	}
 
 	public void removeMarker(MapMarker marker) {
-		SQLiteConnection db = openConnection(true);
+		SQLiteConnection db = openConnection(false);
 		if (db != null) {
 			try {
 				db.execSQL("DELETE FROM " + MARKERS_TABLE_NAME +
