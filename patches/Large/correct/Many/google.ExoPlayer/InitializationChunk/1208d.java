diff --git a/library/src/main/java/com/google/android/exoplayer/chunk/InitializationChunk.java b/library/src/main/java/com/google/android/exoplayer/chunk/InitializationChunk.java
index 068ece3..ea0c22e 100644
--- a/library/src/main/java/com/google/android/exoplayer/chunk/InitializationChunk.java
+++ b/library/src/main/java/com/google/android/exoplayer/chunk/InitializationChunk.java
@@ -78,7 +78,7 @@
    * Should be called after loading has completed.
    */
   public boolean hasSampleFormat() {
-    return format != null;
+    return sampleFormat != null;
   }
 
   /**
