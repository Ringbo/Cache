diff --git a/src/de/danoeh/antennapod/preferences/PlaybackPreferences.java b/src/de/danoeh/antennapod/preferences/PlaybackPreferences.java
index b93b2e0..82a6df1 100644
--- a/src/de/danoeh/antennapod/preferences/PlaybackPreferences.java
+++ b/src/de/danoeh/antennapod/preferences/PlaybackPreferences.java
@@ -136,7 +136,7 @@
 
 		} else if (key.equals(PREF_AUTO_DELETE_MEDIA_PLAYBACK_COMPLETED)) {
 			autoDeleteMediaPlaybackCompleted = sp.getBoolean(
-					PREF_AUTODELETE_MEDIA_ID, false);
+					PREF_AUTO_DELETE_MEDIA_PLAYBACK_COMPLETED, false);
 		} else if (key.equals(PREF_AUTODELETE_MEDIA_ID)) {
 			autoDeleteMediaId = sp.getLong(PREF_AUTODELETE_MEDIA_ID, -1);
 		} else if (key.equals(PREF_CURRENTLY_PLAYING_FEEDMEDIA_ID)) {
