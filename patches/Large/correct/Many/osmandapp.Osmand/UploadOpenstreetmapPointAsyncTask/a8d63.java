diff --git a/OsmAnd/src/net/osmand/plus/osmedit/UploadOpenstreetmapPointAsyncTask.java b/OsmAnd/src/net/osmand/plus/osmedit/UploadOpenstreetmapPointAsyncTask.java
index 3c58892..58f1e72 100644
--- a/OsmAnd/src/net/osmand/plus/osmedit/UploadOpenstreetmapPointAsyncTask.java
+++ b/OsmAnd/src/net/osmand/plus/osmedit/UploadOpenstreetmapPointAsyncTask.java
@@ -95,7 +95,7 @@
 
 	@Override
 	protected void onPostExecute(Map<OsmPoint, String> loadErrorsMap) {
-		if (progress != null) {
+		if (progress != null && progress.isResumed()) {
 			progress.dismissAllowingStateLoss();
 		}
 		listener.uploadEnded(loadErrorsMap);
