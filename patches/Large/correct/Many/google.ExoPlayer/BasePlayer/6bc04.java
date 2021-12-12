diff --git a/library/core/src/main/java/com/google/android/exoplayer2/BasePlayer.java b/library/core/src/main/java/com/google/android/exoplayer2/BasePlayer.java
index f1b5415..eb3bd4f 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/BasePlayer.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/BasePlayer.java
@@ -62,7 +62,7 @@
 
   @Override
   public final void next() {
-    int nextWindowIndex = getPreviousWindowIndex();
+    int nextWindowIndex = getNextWindowIndex();
     if (nextWindowIndex != C.INDEX_UNSET) {
       seekToDefaultPosition(nextWindowIndex);
     }
