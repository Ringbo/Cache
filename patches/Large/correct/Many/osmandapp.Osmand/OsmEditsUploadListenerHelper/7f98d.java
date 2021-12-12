diff --git a/OsmAnd/src/net/osmand/plus/osmedit/OsmEditsUploadListenerHelper.java b/OsmAnd/src/net/osmand/plus/osmedit/OsmEditsUploadListenerHelper.java
index 1379af6..37c47e8 100644
--- a/OsmAnd/src/net/osmand/plus/osmedit/OsmEditsUploadListenerHelper.java
+++ b/OsmAnd/src/net/osmand/plus/osmedit/OsmEditsUploadListenerHelper.java
@@ -94,7 +94,7 @@
 	}
 
 	private static void showUploadItemsProgressDialog(Fragment fragment, OsmPoint[] toUpload) {
-		MapActivity activity = (MapActivity) fragment.getActivity();
+		FragmentActivity activity = fragment.getActivity();
 		OsmEditingPlugin plugin = OsmandPlugin.getEnabledPlugin(OsmEditingPlugin.class);
 		OsmEditsUploadListenerHelper helper = new OsmEditsUploadListenerHelper(activity,
 				activity.getResources().getString(R.string.local_openstreetmap_were_uploaded));
