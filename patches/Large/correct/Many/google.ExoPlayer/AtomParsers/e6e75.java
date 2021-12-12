diff --git a/library/core/src/main/java/com/google/android/exoplayer2/extractor/mp4/AtomParsers.java b/library/core/src/main/java/com/google/android/exoplayer2/extractor/mp4/AtomParsers.java
index 1c4ca99..588282b 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/extractor/mp4/AtomParsers.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/extractor/mp4/AtomParsers.java
@@ -247,7 +247,13 @@
         remainingSamplesAtTimestampDelta--;
         if (remainingSamplesAtTimestampDelta == 0 && remainingTimestampDeltaChanges > 0) {
           remainingSamplesAtTimestampDelta = stts.readUnsignedIntToInt();
-          timestampDeltaInTimeUnits = stts.readUnsignedIntToInt();
+          // The BMFF spec (ISO 14496-12) states that sample deltas should be unsigned integers
+          // in stts boxes, however some streams violate the spec and use signed integers instead.
+          // See https://github.com/google/ExoPlayer/issues/3384. It's safe to always decode sample
+          // deltas as signed integers here, because unsigned integers will still be parsed
+          // correctly (unless their top bit is set, which is never true in practice because sample
+          // deltas are always small).
+          timestampDeltaInTimeUnits = stts.readInt();
           remainingTimestampDeltaChanges--;
         }
 
