diff --git a/library/dash/src/main/java/com/google/android/exoplayer2/source/dash/DefaultDashChunkSource.java b/library/dash/src/main/java/com/google/android/exoplayer2/source/dash/DefaultDashChunkSource.java
index 37c9e31..1ea25ec 100644
--- a/library/dash/src/main/java/com/google/android/exoplayer2/source/dash/DefaultDashChunkSource.java
+++ b/library/dash/src/main/java/com/google/android/exoplayer2/source/dash/DefaultDashChunkSource.java
@@ -544,7 +544,7 @@
       long endTimeUs = representationHolder.getSegmentEndTimeUs(firstSegmentNum + segmentCount - 1);
       long periodDurationUs = representationHolder.periodDurationUs;
       long clippedEndTimeUs =
-          periodDurationUs != C.TIME_UNSET && periodDurationUs < endTimeUs
+          periodDurationUs != C.TIME_UNSET && periodDurationUs <= endTimeUs
               ? periodDurationUs
               : C.TIME_UNSET;
       DataSpec dataSpec = new DataSpec(segmentUri.resolveUri(baseUrl),
