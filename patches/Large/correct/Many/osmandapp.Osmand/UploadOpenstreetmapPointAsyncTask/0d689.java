diff --git a/OsmAnd/src/net/osmand/plus/osmedit/UploadOpenstreetmapPointAsyncTask.java b/OsmAnd/src/net/osmand/plus/osmedit/UploadOpenstreetmapPointAsyncTask.java
index 9477428..86fd7d8 100644
--- a/OsmAnd/src/net/osmand/plus/osmedit/UploadOpenstreetmapPointAsyncTask.java
+++ b/OsmAnd/src/net/osmand/plus/osmedit/UploadOpenstreetmapPointAsyncTask.java
@@ -96,7 +96,7 @@
 	@Override
 	protected void onPostExecute(Map<OsmPoint, String> loadErrorsMap) {
 		if (progress != null) {
-			progress.dismiss();
+			progress.dismissAllowingStateLoss();
 		}
 		listener.uploadEnded(loadErrorsMap);
 	}
