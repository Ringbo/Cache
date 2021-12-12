diff --git a/OsmAnd/src/net/osmand/plus/myplaces/AvailableGPXFragment.java b/OsmAnd/src/net/osmand/plus/myplaces/AvailableGPXFragment.java
index 83510a1..b5f4dbd 100644
--- a/OsmAnd/src/net/osmand/plus/myplaces/AvailableGPXFragment.java
+++ b/OsmAnd/src/net/osmand/plus/myplaces/AvailableGPXFragment.java
@@ -648,7 +648,8 @@
 			if (getActivity() != null) {
 				((ActionBarActivity) getActivity()).setSupportProgressBarIndeterminateVisibility(false);
 			}
-			if (allGpxAdapter.getGroupCount() > 0) {
+			if (allGpxAdapter.getGroupCount() > 0 && 
+					allGpxAdapter.isShowingSelection()) {
 				getExpandableListView().expandGroup(0);
 			}
 		}
@@ -919,7 +920,7 @@
 			return isShowingSelection() && groupPosition == 0;
 		}
 
-		private boolean isShowingSelection() {
+		public boolean isShowingSelection() {
 			return selected.size() > 0 && !selectionMode;
 		}
 
