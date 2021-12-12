diff --git a/library/core/src/main/java/com/google/android/exoplayer2/audio/DefaultAudioSink.java b/library/core/src/main/java/com/google/android/exoplayer2/audio/DefaultAudioSink.java
index a23dd44..2ec3f28 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/audio/DefaultAudioSink.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/audio/DefaultAudioSink.java
@@ -1146,7 +1146,7 @@
 
     // Workaround for Nexus Player not reporting support for mono passthrough.
     // (See [Internal: b/34268671].)
-    if (Util.SDK_INT <= 25 && "fugu".equals(Util.DEVICE) && !isInputPcm && channelCount == 1) {
+    if (Util.SDK_INT <= 26 && "fugu".equals(Util.DEVICE) && !isInputPcm && channelCount == 1) {
       channelCount = 2;
     }
 
