diff --git a/core/java/android/speech/tts/TextToSpeech.java b/core/java/android/speech/tts/TextToSpeech.java
index 6823b73..7d596df 100755
--- a/core/java/android/speech/tts/TextToSpeech.java
+++ b/core/java/android/speech/tts/TextToSpeech.java
@@ -499,7 +499,7 @@
         String defaultEngine = getDefaultEngine();
         String engine = defaultEngine;
         if (!areDefaultsEnforced() && !TextUtils.isEmpty(mRequestedEngine)
-                && mEnginesHelper.isEngineEnabled(engine)) {
+                && mEnginesHelper.isEngineEnabled(mRequestedEngine)) {
             engine = mRequestedEngine;
         }
 
