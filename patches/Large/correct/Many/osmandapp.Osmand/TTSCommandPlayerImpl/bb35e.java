diff --git a/OsmAnd/src/net/osmand/plus/voice/TTSCommandPlayerImpl.java b/OsmAnd/src/net/osmand/plus/voice/TTSCommandPlayerImpl.java
index 3dc0896..6f897cb 100644
--- a/OsmAnd/src/net/osmand/plus/voice/TTSCommandPlayerImpl.java
+++ b/OsmAnd/src/net/osmand/plus/voice/TTSCommandPlayerImpl.java
@@ -101,7 +101,7 @@
 										R.string.tts_missing_language_data_title,
 										R.string.tts_missing_language_data,
 										new IntentStarter(
-												ctx,
+												act,
 												TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA),
 										act);
 									builder.show();
@@ -118,7 +118,7 @@
 											R.string.tts_language_not_supported_title,
 											R.string.tts_language_not_supported,
 											new IntentStarter(
-													ctx,
+													act,
 													Intent.ACTION_VIEW, Uri.parse("market://search?q=text to speech engine"
 														)),
 											act);
