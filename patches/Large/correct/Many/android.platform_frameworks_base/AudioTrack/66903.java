diff --git a/media/java/android/media/AudioTrack.java b/media/java/android/media/AudioTrack.java
index aaf7dd7..1268c6f 100644
--- a/media/java/android/media/AudioTrack.java
+++ b/media/java/android/media/AudioTrack.java
@@ -3222,7 +3222,7 @@
                                                 int offsetInFloats, int sizeInFloats, int format,
                                                 boolean isBlocking);
 
-    private native final int native_write_native_bytes(Object audioData,
+    private native final int native_write_native_bytes(ByteBuffer audioData,
             int positionInBytes, int sizeInBytes, int format, boolean blocking);
 
     private native final int native_reload_static();
