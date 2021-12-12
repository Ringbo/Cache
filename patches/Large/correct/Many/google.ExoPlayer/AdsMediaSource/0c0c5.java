diff --git a/library/core/src/main/java/com/google/android/exoplayer2/source/ads/AdsMediaSource.java b/library/core/src/main/java/com/google/android/exoplayer2/source/ads/AdsMediaSource.java
index fed3d15..6637082 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/source/ads/AdsMediaSource.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/source/ads/AdsMediaSource.java
@@ -47,7 +47,11 @@
 import java.util.List;
 import java.util.Map;
 
-/** A {@link MediaSource} that inserts ads linearly with a provided content media source. */
+/**
+ * A {@link MediaSource} that inserts ads linearly with a provided content media source. This source
+ * cannot be used as a child source in a composition. It must be the top-level source used to
+ * prepare the player.
+ */
 public final class AdsMediaSource extends CompositeMediaSource<MediaPeriodId> {
 
   /** Factory for creating {@link MediaSource}s to play ad media. */
@@ -315,7 +319,9 @@
       boolean isTopLevelSource,
       @Nullable TransferListener mediaTransferListener) {
     super.prepareSourceInternal(player, isTopLevelSource, mediaTransferListener);
-    Assertions.checkArgument(isTopLevelSource);
+    Assertions.checkArgument(
+        isTopLevelSource,
+        "AdsMediaSource must be the top-level source used to prepare the player.");
     final ComponentListener componentListener = new ComponentListener();
     this.componentListener = componentListener;
     prepareChildSource(DUMMY_CONTENT_MEDIA_PERIOD_ID, contentMediaSource);
