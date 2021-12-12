diff --git a/src/de/danoeh/antennapod/service/PlaybackService.java b/src/de/danoeh/antennapod/service/PlaybackService.java
index 450f7f6..a30b40c 100644
--- a/src/de/danoeh/antennapod/service/PlaybackService.java
+++ b/src/de/danoeh/antennapod/service/PlaybackService.java
@@ -1005,7 +1005,9 @@
 
 	public void seek(int i) {
 		saveCurrentPosition();
-		if (status == PlayerStatus.INITIALIZED) {
+		if (status == PlayerStatus.INITIALIZED
+				|| status == PlayerStatus.INITIALIZING
+				|| status == PlayerStatus.PREPARING) {
 			media.setPosition(i);
 			setStartWhenPrepared(true);
 			prepare();
