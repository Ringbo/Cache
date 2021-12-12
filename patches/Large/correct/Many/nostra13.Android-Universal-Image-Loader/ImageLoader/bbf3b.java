diff --git a/library/src/com/nostra13/universalimageloader/core/ImageLoader.java b/library/src/com/nostra13/universalimageloader/core/ImageLoader.java
index 54c534a..73122d1 100644
--- a/library/src/com/nostra13/universalimageloader/core/ImageLoader.java
+++ b/library/src/com/nostra13/universalimageloader/core/ImageLoader.java
@@ -416,7 +416,7 @@
 	 * @param denyNetworkDownloads pass <b>true</b> - to deny engine to download images from the network; <b>false</b> -
 	 *            to allow engine to download images from network.
 	 */
-	void denyNetworkDownloads(boolean denyNetworkDownloads) {
+	public void denyNetworkDownloads(boolean denyNetworkDownloads) {
 		engine.denyNetworkDownloads(denyNetworkDownloads);
 	}
 
@@ -427,7 +427,7 @@
 	 * @param handleSlowNetwork pass <b>true</b> - to use {@link FlushedInputStream} for network downloads; <b>false</b>
 	 *            - otherwise.
 	 */
-	void handleSlowNetwork(boolean handleSlowNetwork) {
+	public void handleSlowNetwork(boolean handleSlowNetwork) {
 		engine.handleSlowNetwork(handleSlowNetwork);
 	}
 
