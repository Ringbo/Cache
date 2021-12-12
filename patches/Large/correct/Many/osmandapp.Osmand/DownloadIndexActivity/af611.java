diff --git a/OsmAnd/src/net/osmand/activities/DownloadIndexActivity.java b/OsmAnd/src/net/osmand/activities/DownloadIndexActivity.java
index b6d5932..852ab8b 100644
--- a/OsmAnd/src/net/osmand/activities/DownloadIndexActivity.java
+++ b/OsmAnd/src/net/osmand/activities/DownloadIndexActivity.java
@@ -565,7 +565,7 @@
 		
 	}
 	
-	protected final int TRIES_TO_DOWNLOAD = 20;
+	protected final int TRIES_TO_DOWNLOAD = 15;
 	protected final long TIMEOUT_BETWEEN_DOWNLOADS = 8000;
 	private boolean interruptDownloading = false;
 	
@@ -596,7 +596,8 @@
 					}
 					conn.setConnectTimeout(30000);
 					log.info(conn.getResponseMessage() + " " + conn.getResponseCode()); //$NON-NLS-1$
-					if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
+					if (conn.getResponseCode() != HttpURLConnection.HTTP_PARTIAL  && 
+							conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
 						conn.disconnect();
 						triesDownload--;
 						continue;
