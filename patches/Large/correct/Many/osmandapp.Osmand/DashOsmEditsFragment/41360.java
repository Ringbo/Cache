diff --git a/OsmAnd/src/net/osmand/plus/osmedit/DashOsmEditsFragment.java b/OsmAnd/src/net/osmand/plus/osmedit/DashOsmEditsFragment.java
index 2eecbdb..fdcd471 100644
--- a/OsmAnd/src/net/osmand/plus/osmedit/DashOsmEditsFragment.java
+++ b/OsmAnd/src/net/osmand/plus/osmedit/DashOsmEditsFragment.java
@@ -141,7 +141,7 @@
 	// TODO: 9/7/15 Redesign osm notes.
 	private void uploadItem(final OsmPoint point) {
 		AlertDialog.Builder b = new AlertDialog.Builder(getActivity());
-		b.setMessage(getString(R.string.local_osm_changes_upload_all_confirm));
+		b.setMessage(getString(R.string.local_osm_changes_upload_all_confirm), 1);
 		b.setPositiveButton(R.string.shared_string_yes, new DialogInterface.OnClickListener() {
 			@Override
 			public void onClick(DialogInterface dialog, int which) {
