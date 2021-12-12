diff --git a/DataExtractionOSM/src/net/osmand/data/index/DownloaderIndexFromGoogleCode.java b/DataExtractionOSM/src/net/osmand/data/index/DownloaderIndexFromGoogleCode.java
index c1c9e99..ae68789 100644
--- a/DataExtractionOSM/src/net/osmand/data/index/DownloaderIndexFromGoogleCode.java
+++ b/DataExtractionOSM/src/net/osmand/data/index/DownloaderIndexFromGoogleCode.java
@@ -94,7 +94,7 @@
 	}
 	
 	public static Map<String, String> getIndexFiles(Map<String, String> files){
-		return getContent(files, ".obf", ".zip");
+		return getContent(files, ".obf", ".zip", ".zip-1", ".zip-2", ".zip-3", ".zip-4");
 	}
 	
 	public static URL getInputStreamToLoadIndex(String indexName) throws IOException{
