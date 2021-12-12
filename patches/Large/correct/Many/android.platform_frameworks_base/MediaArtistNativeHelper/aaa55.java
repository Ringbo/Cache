diff --git a/media/java/android/media/videoeditor/MediaArtistNativeHelper.java b/media/java/android/media/videoeditor/MediaArtistNativeHelper.java
index 54db8cd..77b7dc8 100755
--- a/media/java/android/media/videoeditor/MediaArtistNativeHelper.java
+++ b/media/java/android/media/videoeditor/MediaArtistNativeHelper.java
@@ -3946,8 +3946,7 @@
        nativeClearSurface(surface,width,height);
     }
     /**     Native Methods        */
-
-    public native Properties getMediaProperties(String file) throws IllegalArgumentException,
+    native Properties getMediaProperties(String file) throws IllegalArgumentException,
     IllegalStateException, RuntimeException, Exception;
 
     /**
@@ -3957,7 +3956,7 @@
      * @throws RuntimeException if an error occurred
      * @see Version
      */
-    public static native Version getVersion() throws RuntimeException;
+    private static native Version getVersion() throws RuntimeException;
 
     /**
      * Returns the video thumbnail in an array of integers. Output format is
@@ -3974,10 +3973,10 @@
      *             negative
      * @throws RuntimeException on runtime errors in native code
      */
-    public native int nativeGetPixels(String fileName, int[] pixelArray, int width, int height,
+    private native int nativeGetPixels(String fileName, int[] pixelArray, int width, int height,
             long timeMS);
 
-    public native int nativeGetPixelsList(String fileName, int[] pixelArray, int width, int height,
+    private native int nativeGetPixelsList(String fileName, int[] pixelArray, int width, int height,
             int timeMS, int nosofTN, long startTimeMs, long endTimeMs);
 
     /**
@@ -3986,7 +3985,7 @@
      *
      * @throws IllegalStateException if the method could not be called
      */
-    public native void release() throws IllegalStateException, RuntimeException;
+    private native void release() throws IllegalStateException, RuntimeException;
 
     /*
      * Clear the preview surface
@@ -4000,7 +3999,7 @@
      *
      * @throws IllegalStateException if the method could not be called
      */
-    public native void stopEncoding() throws IllegalStateException, RuntimeException;
+    private native void stopEncoding() throws IllegalStateException, RuntimeException;
 
 
 
@@ -4026,12 +4025,12 @@
 
     private native void nativeStopPreview();
 
-    public native int nativeGenerateAudioGraph(String pcmFilePath, String outGraphPath,
+    private native int nativeGenerateAudioGraph(String pcmFilePath, String outGraphPath,
             int frameDuration, int channels, int sampleCount);
 
-    public native int nativeGenerateRawAudio(String InFileName, String PCMFileName);
+    private native int nativeGenerateRawAudio(String InFileName, String PCMFileName);
 
-    public native int nativeGenerateClip(EditSettings editSettings)
+    private native int nativeGenerateClip(EditSettings editSettings)
     throws IllegalArgumentException, IllegalStateException, RuntimeException;
 
 }
