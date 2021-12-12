diff --git a/OsmAnd/src/net/osmand/plus/voice/AbstractPrologCommandPlayer.java b/OsmAnd/src/net/osmand/plus/voice/AbstractPrologCommandPlayer.java
index ddc605c..4239368 100644
--- a/OsmAnd/src/net/osmand/plus/voice/AbstractPrologCommandPlayer.java
+++ b/OsmAnd/src/net/osmand/plus/voice/AbstractPrologCommandPlayer.java
@@ -283,7 +283,7 @@
 			mAudioFocusHelper.requestFocus(ctx, streamType);
 		}
 		// If AudioManager.STREAM_VOICE_CALL try using BT SCO:
-		if (ctx.getSettings().AUDIO_STREAM_GUIDANCE.get() == 0) {
+		if (ctx != null && ctx.getSettings().AUDIO_STREAM_GUIDANCE.get() == 0) {
 			startBtSco();
 		}
 	}
