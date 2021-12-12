diff --git a/library/core/src/main/java/com/google/android/exoplayer2/source/SingleSampleMediaSource.java b/library/core/src/main/java/com/google/android/exoplayer2/source/SingleSampleMediaSource.java
index dc46b12..1ac6207 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/source/SingleSampleMediaSource.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/source/SingleSampleMediaSource.java
@@ -287,7 +287,8 @@
     this.durationUs = durationUs;
     this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
     this.treatLoadErrorsAsEndOfStream = treatLoadErrorsAsEndOfStream;
-    dataSpec = new DataSpec(uri);
+    dataSpec =
+        new DataSpec(uri, DataSpec.FLAG_ALLOW_GZIP | DataSpec.FLAG_ALLOW_CACHING_UNKNOWN_LENGTH);
     timeline =
         new SinglePeriodTimeline(durationUs, /* isSeekable= */ true, /* isDynamic= */ false, tag);
   }
