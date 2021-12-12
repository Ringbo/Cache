diff --git a/OsmAnd/src/net/osmand/plus/audionotes/AudioVideoNotesPlugin.java b/OsmAnd/src/net/osmand/plus/audionotes/AudioVideoNotesPlugin.java
index 61aaf3a..0c85836 100644
--- a/OsmAnd/src/net/osmand/plus/audionotes/AudioVideoNotesPlugin.java
+++ b/OsmAnd/src/net/osmand/plus/audionotes/AudioVideoNotesPlugin.java
@@ -424,7 +424,7 @@
 			}
 		};
 		adapter.item(R.string.layer_recordings).selected(SHOW_RECORDINGS.get()? 1 : 0)
-			.icons(R.drawable.ic_action_audio_dark, R.drawable.ic_action_audio_light).listen(listener).position(7).reg();
+			.icons(R.drawable.ic_action_audio_dark, R.drawable.ic_action_audio_light).listen(listener).position(6).reg();
 	}
 	
 	@Override
