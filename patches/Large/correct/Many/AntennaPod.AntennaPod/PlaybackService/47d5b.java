diff --git a/src/de/danoeh/antennapod/service/PlaybackService.java b/src/de/danoeh/antennapod/service/PlaybackService.java
index bf90cf9..6c76194 100644
--- a/src/de/danoeh/antennapod/service/PlaybackService.java
+++ b/src/de/danoeh/antennapod/service/PlaybackService.java
@@ -1524,21 +1524,21 @@
 	}
 
 	public boolean canSetSpeed() {
-		if (media.getMediaType() == MediaType.AUDIO) {
+		if (media != null && media.getMediaType() == MediaType.AUDIO) {
 			return ((AudioPlayer) player).canSetSpeed();
 		}
 		return false;
 	}
 
 	public boolean canSetPitch() {
-		if (media.getMediaType() == MediaType.AUDIO) {
+		if (media != null && media.getMediaType() == MediaType.AUDIO) {
 			return ((AudioPlayer) player).canSetPitch();
 		}
 		return false;
 	}
 
 	public void setSpeed(double speed) {
-		if (media.getMediaType() == MediaType.AUDIO) {
+		if (media != null && media.getMediaType() == MediaType.AUDIO) {
 			AudioPlayer audioPlayer = (AudioPlayer) player;
 			if (audioPlayer.canSetSpeed()) {
 				audioPlayer.setPlaybackSpeed((float) speed);
@@ -1551,7 +1551,7 @@
 	}
 
 	public void setPitch(double pitch) {
-		if (media.getMediaType() == MediaType.AUDIO) {
+		if (media != null && media.getMediaType() == MediaType.AUDIO) {
 			AudioPlayer audioPlayer = (AudioPlayer) player;
 			if (audioPlayer.canSetPitch()) {
 				audioPlayer.setPlaybackPitch((float) pitch);
