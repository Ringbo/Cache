diff --git a/OsmAnd/src/net/osmand/plus/voice/AbstractPrologCommandPlayer.java b/OsmAnd/src/net/osmand/plus/voice/AbstractPrologCommandPlayer.java
index b6f78a1..b3c5f10 100644
--- a/OsmAnd/src/net/osmand/plus/voice/AbstractPrologCommandPlayer.java
+++ b/OsmAnd/src/net/osmand/plus/voice/AbstractPrologCommandPlayer.java
@@ -288,7 +288,7 @@
 		}
 	}
 
-	private synchronized AudioFocusHelper getAudioFocus() {
+	private AudioFocusHelper getAudioFocus() {
 		try {
 			return new net.osmand.plus.api.AudioFocusHelperImpl();
 		} catch (Exception e) {
@@ -297,7 +297,7 @@
 		return null;
 	}
 	
-	protected void abandonAudioFocus() {
+	protected synchronized void abandonAudioFocus() {
 		log.debug("abandonAudioFocus");
 		if ((ctx.getSettings().AUDIO_STREAM_GUIDANCE.get() == 0) || (btScoStatus == true)) {
 			toggleBtSco(false);
@@ -317,7 +317,7 @@
 
 	private synchronized boolean toggleBtSco(boolean on) {
 	// Hardy, 2016-07-03: Establish a low quality BT SCO (Synchronous Connection-Oriented) link to interrupt e.g. a car stereo FM radio
-		if (on=true) {
+		if (on) {
 			try {
 				AudioManager mAudioManager = (AudioManager) ctx.getSystemService(Context.AUDIO_SERVICE);
 				if (mAudioManager == null || !mAudioManager.isBluetoothScoAvailableOffCall()) {
