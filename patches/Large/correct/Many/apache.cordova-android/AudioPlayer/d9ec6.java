diff --git a/framework/src/com/phonegap/AudioPlayer.java b/framework/src/com/phonegap/AudioPlayer.java
index 0f8c060..e2f1068 100755
--- a/framework/src/com/phonegap/AudioPlayer.java
+++ b/framework/src/com/phonegap/AudioPlayer.java
@@ -313,7 +313,7 @@
 	 * @return					T=streaming, F=local
 	 */
 	public boolean isStreaming(String file) {
-		if (file.contains("http://")) {
+		if (file.contains("http://") || file.contains("https://")) {
 			return true;
 		} 
 		else {
