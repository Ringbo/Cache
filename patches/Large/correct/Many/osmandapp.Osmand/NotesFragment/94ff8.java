diff --git a/OsmAnd/src/net/osmand/plus/audionotes/NotesFragment.java b/OsmAnd/src/net/osmand/plus/audionotes/NotesFragment.java
index f05b14a..73c4266 100644
--- a/OsmAnd/src/net/osmand/plus/audionotes/NotesFragment.java
+++ b/OsmAnd/src/net/osmand/plus/audionotes/NotesFragment.java
@@ -292,7 +292,7 @@
 		} else {
 			selected.addAll(getRecordingsByType(type));
 		}
-		listAdapter.notifyDataSetInvalidated();
+		listAdapter.notifyDataSetChanged();
 	}
 
 	private void deselectAll(int type) {
@@ -301,7 +301,7 @@
 		} else {
 			selected.removeAll(getRecordingsByType(type));
 		}
-		listAdapter.notifyDataSetInvalidated();
+		listAdapter.notifyDataSetChanged();
 	}
 
 	private List<Recording> sortItemsByDateDescending(List<Recording> recs) {
@@ -405,7 +405,7 @@
 
 	private void updateSelectionMode(ActionMode m) {
 		updateSelectionTitle(m);
-		listAdapter.notifyDataSetInvalidated();
+		listAdapter.notifyDataSetChanged();
 	}
 
 	private void deleteItems(final Set<Recording> selected) {
