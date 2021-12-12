diff --git a/DataExtractionOSM/src/net/osmand/data/index/DownloaderIndexFromGoogleCode.java b/DataExtractionOSM/src/net/osmand/data/index/DownloaderIndexFromGoogleCode.java
index 90669b0..84d171b 100644
--- a/DataExtractionOSM/src/net/osmand/data/index/DownloaderIndexFromGoogleCode.java
+++ b/DataExtractionOSM/src/net/osmand/data/index/DownloaderIndexFromGoogleCode.java
@@ -35,7 +35,7 @@
 	 * @throws IOException 
 	 */
 	public static void main(String[] args) throws URISyntaxException, IOException {
-		Map<String, String> files = DownloaderIndexFromGoogleCode.getIndexFiles(new LinkedHashMap<String, String>(),
+		Map<String, String> files = DownloaderIndexFromGoogleCode.getContent(new LinkedHashMap<String, String>(),
 				BINARY_MAP_VERSION + BINARY_MAP_INDEX_EXT,
 				BINARY_MAP_VERSION + BINARY_MAP_INDEX_EXT_ZIP,
 				VOICE_VERSION + VOICE_INDEX_EXT_ZIP);
