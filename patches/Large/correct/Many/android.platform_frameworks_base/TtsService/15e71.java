diff --git a/packages/TtsService/src/android/tts/TtsService.java b/packages/TtsService/src/android/tts/TtsService.java
index ff2254a..b1e6425 100755
--- a/packages/TtsService/src/android/tts/TtsService.java
+++ b/packages/TtsService/src/android/tts/TtsService.java
@@ -148,7 +148,7 @@
 
 
     private void setDefaultSettings() {
-        setLanguage(this.getDefaultLanguage(), getDefaultLanguage(), getDefaultLocVariant());
+        setLanguage(this.getDefaultLanguage(), getDefaultCountry(), getDefaultLocVariant());
 
         // speech rate
         setSpeechRate(getDefaultRate());
