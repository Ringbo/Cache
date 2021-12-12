diff --git a/library/src/main/java/com/google/android/exoplayer2/trackselection/BaseTrackSelection.java b/library/src/main/java/com/google/android/exoplayer2/trackselection/BaseTrackSelection.java
index 57811ef..c81ffb4 100644
--- a/library/src/main/java/com/google/android/exoplayer2/trackselection/BaseTrackSelection.java
+++ b/library/src/main/java/com/google/android/exoplayer2/trackselection/BaseTrackSelection.java
@@ -138,7 +138,7 @@
     long nowMs = SystemClock.elapsedRealtime();
     boolean canBlacklist = isBlacklisted(index, nowMs);
     for (int i = 0; i < length && !canBlacklist; i++) {
-      canBlacklist = i != index && !isBlacklisted(index, nowMs);
+      canBlacklist = i != index && !isBlacklisted(i, nowMs);
     }
     if (!canBlacklist) {
       return false;
