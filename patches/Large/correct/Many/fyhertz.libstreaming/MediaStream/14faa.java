diff --git a/src/net/majorkernelpanic/streaming/MediaStream.java b/src/net/majorkernelpanic/streaming/MediaStream.java
index 5d114dc..e295fa1 100644
--- a/src/net/majorkernelpanic/streaming/MediaStream.java
+++ b/src/net/majorkernelpanic/streaming/MediaStream.java
@@ -43,13 +43,13 @@
 
 	protected static final String TAG = "MediaStream";
 
-	/** MediaStream forwards data to a packetizer through a LocalSocket. */
+	/** Raw audio/video will be encoded using the MediaRecorder API. */
 	public static final byte MODE_MEDIARECORDER_API = 0x01;
 
-	/** MediaStream uses the new MediaCodec API introduced in JB 4.1 to stream audio/video. */
+	/** Raw audio/video will be encoded using the MediaCodec API with buffers. */
 	public static final byte MODE_MEDIACODEC_API = 0x02;
 
-	/** MediaStream uses the new features of the MediaCodec API introduced in JB 4.3 to stream audio/video. */
+	/** Raw audio/video will be encoded using the MediaCode API with a surface. */
 	public static final byte MODE_MEDIACODEC_API_2 = 0x05;
 
 	/** Prefix that will be used for all shared preferences saved by libstreaming */
@@ -157,11 +157,20 @@
 	}
 
 	/**
-	 * Sets the mode of the {@link MediaStream}.
-	 * If the mode is set to {@link #MODE_MEDIARECORDER_API}, video is forwarded to a UDP socket.
-	 * @param mode Either {@link #MODE_MEDIARECORDER_API} or {@link #MODE_MEDIACODEC_API} 
+	 * Sets the streaming method that will be used.
+	 * 
+	 * If the mode is set to {@link #MODE_MEDIARECORDER_API}, raw audio/video will be encoded 
+	 * using the MediaRecorder API. <br />
+	 * 
+	 * If the mode is set to {@link #MODE_MEDIACODEC_API} or to {@link #MODE_MEDIACODEC_API_2}, 
+	 * audio/video will be encoded with using the MediaCodec. <br />
+	 * 
+	 * The {@link #MODE_MEDIACODEC_API_2} mode only concerns {@link VideoStream}, it makes 
+	 * use of the createInputSurface() method of the MediaCodec API (Android 4.3 is needed there). <br />
+	 * 
+	 * @param mode Can be {@link #MODE_MEDIARECORDER_API}, {@link #MODE_MEDIACODEC_API} or {@link #MODE_MEDIACODEC_API_2} 
 	 */
-	public void setStreamingMethod(byte mode) throws IllegalStateException {
+	public void setStreamingMethod(byte mode) {
 		mRequestedMode = mode;
 	}
 
