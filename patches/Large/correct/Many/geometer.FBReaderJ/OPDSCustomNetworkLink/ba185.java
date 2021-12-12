diff --git a/src/org/geometerplus/fbreader/network/opds/OPDSCustomNetworkLink.java b/src/org/geometerplus/fbreader/network/opds/OPDSCustomNetworkLink.java
index e570ba9..330bc31 100644
--- a/src/org/geometerplus/fbreader/network/opds/OPDSCustomNetworkLink.java
+++ b/src/org/geometerplus/fbreader/network/opds/OPDSCustomNetworkLink.java
@@ -131,7 +131,7 @@
 		if (!opensearchDescriptionURLs.isEmpty()) {
 			LinkedList<ZLNetworkRequest> requests = new LinkedList<ZLNetworkRequest>();
 			for (String url: opensearchDescriptionURLs) {
-				requests.add(new ZLNetworkRequest(url) {
+				requests.add(new ZLNetworkRequest(url, quietly) {
 					@Override
 					public void handleStream(InputStream inputStream, int length) throws IOException, ZLNetworkException {
 						new OpenSearchXMLReader(getURL(), descriptions).read(inputStream);
