diff --git a/gdx/src/com/badlogic/gdx/audio/analysis/AudioTools.java b/gdx/src/com/badlogic/gdx/audio/analysis/AudioTools.java
index a16481a..4a925ea 100644
--- a/gdx/src/com/badlogic/gdx/audio/analysis/AudioTools.java
+++ b/gdx/src/com/badlogic/gdx/audio/analysis/AudioTools.java
@@ -47,7 +47,7 @@
 	 * @param target the target buffer
 	 * @param numSamples the number of samples
 	 */
-	public static native void convertToShort (FloatBuffer source, FloatBuffer target, int numSamples);
+	public static native void convertToShort (FloatBuffer source, ShortBuffer target, int numSamples);
 
 	/**
 	 * Converts the samples in source which are assumed to be interleaved left/right stereo samples to mono, writting the converted
