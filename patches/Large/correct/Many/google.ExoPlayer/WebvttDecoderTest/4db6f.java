diff --git a/library/src/androidTest/java/com/google/android/exoplayer2/text/webvtt/WebvttDecoderTest.java b/library/src/androidTest/java/com/google/android/exoplayer2/text/webvtt/WebvttDecoderTest.java
index 013e82b..6ed0518 100644
--- a/library/src/androidTest/java/com/google/android/exoplayer2/text/webvtt/WebvttDecoderTest.java
+++ b/library/src/androidTest/java/com/google/android/exoplayer2/text/webvtt/WebvttDecoderTest.java
@@ -116,7 +116,7 @@
         Alignment.ALIGN_CENTER, 0.45f, Cue.LINE_TYPE_FRACTION, Cue.ANCHOR_TYPE_END, Cue.DIMEN_UNSET,
         Cue.TYPE_UNSET, 0.35f);
     assertCue(subtitle, 6, 6000000, 7000000, "This is the fourth subtitle.",
-        Alignment.ALIGN_CENTER, -10f, Cue.LINE_TYPE_NUMBER, Cue.TYPE_UNSET, Cue.DIMEN_UNSET,
+        Alignment.ALIGN_CENTER, -11f, Cue.LINE_TYPE_NUMBER, Cue.TYPE_UNSET, Cue.DIMEN_UNSET,
         Cue.TYPE_UNSET, Cue.DIMEN_UNSET);
     assertCue(subtitle, 8, 7000000, 8000000, "This is the fifth subtitle.",
         Alignment.ALIGN_OPPOSITE, Cue.DIMEN_UNSET, Cue.TYPE_UNSET, Cue.TYPE_UNSET, 0.1f,
