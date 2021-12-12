diff --git a/media/java/android/media/MediaSync.java b/media/java/android/media/MediaSync.java
index b7ef95c..d9e554c 100644
--- a/media/java/android/media/MediaSync.java
+++ b/media/java/android/media/MediaSync.java
@@ -49,7 +49,7 @@
  * sync.setAudioTrack(audioTrack);
  * sync.setCallback(new MediaSync.Callback() {
  *     {@literal @Override}
- *     public void onAudioBufferConsumed(MediaSync sync, ByteBuffer audioBuffer, int bufferIndex) {
+ *     public void onAudioBufferConsumed(MediaSync sync, ByteBuffer audioBuffer, int bufferId) {
  *         ...
  *     }
  * }, null);
@@ -62,8 +62,8 @@
  *   // videoDecoder.releaseOutputBuffer(videoOutputBufferIx, videoPresentationTimeNs);
  *   // More details are available as below.
  *   ...
- *   sync.queueAudio(audioByteBuffer, bufferIndex, audioPresentationTimeUs); // non-blocking.
- *   // The audioByteBuffer and bufferIndex will be returned via callback.
+ *   sync.queueAudio(audioByteBuffer, bufferId, audioPresentationTimeUs); // non-blocking.
+ *   // The audioByteBuffer and bufferId will be returned via callback.
  *   // More details are available as below.
  *   ...
  *     ...
@@ -75,22 +75,22 @@
  * // The following code snippet illustrates how video/audio raw frames are created by
  * // MediaCodec's, how they are fed to MediaSync and how they are returned by MediaSync.
  * // This is the callback from MediaCodec.
- * onOutputBufferAvailable(MediaCodec codec, int bufferIndex, BufferInfo info) {
+ * onOutputBufferAvailable(MediaCodec codec, int bufferId, BufferInfo info) {
  *     // ...
  *     if (codec == videoDecoder) {
  *         // surface timestamp must contain media presentation time in nanoseconds.
- *         codec.releaseOutputBuffer(bufferIndex, 1000 * info.presentationTime);
+ *         codec.releaseOutputBuffer(bufferId, 1000 * info.presentationTime);
  *     } else {
- *         ByteBuffer audioByteBuffer = codec.getOutputBuffer(bufferIndex);
- *         sync.queueByteBuffer(audioByteBuffer, bufferIndex, info.size, info.presentationTime);
+ *         ByteBuffer audioByteBuffer = codec.getOutputBuffer(bufferId);
+ *         sync.queueByteBuffer(audioByteBuffer, bufferId, info.size, info.presentationTime);
  *     }
  *     // ...
  * }
  *
  * // This is the callback from MediaSync.
- * onAudioBufferConsumed(MediaSync sync, ByteBuffer buffer, int bufferIndex) {
+ * onAudioBufferConsumed(MediaSync sync, ByteBuffer buffer, int bufferId) {
  *     // ...
- *     audioDecoder.releaseBuffer(bufferIndex, false);
+ *     audioDecoder.releaseBuffer(bufferId, false);
  *     // ...
  * }
  *
@@ -123,10 +123,11 @@
          *
          * @param sync The MediaSync object.
          * @param audioBuffer The returned audio buffer.
-         * @param bufferIndex The index associated with the audio buffer
+         * @param bufferId The ID associated with audioBuffer as passed into
+         *     {@link MediaSync#queueAudio}.
          */
         public abstract void onAudioBufferConsumed(
-                @NonNull MediaSync sync, @NonNull ByteBuffer audioBuffer, int bufferIndex);
+                @NonNull MediaSync sync, @NonNull ByteBuffer audioBuffer, int bufferId);
     }
 
     /** Audio track failed.
@@ -172,10 +173,10 @@
         public int mBufferIndex;
         long mPresentationTimeUs;
 
-        public AudioBuffer(@NonNull ByteBuffer byteBuffer, int bufferIndex,
+        public AudioBuffer(@NonNull ByteBuffer byteBuffer, int bufferId,
                            long presentationTimeUs) {
             mByteBuffer = byteBuffer;
-            mBufferIndex = bufferIndex;
+            mBufferIndex = bufferId;
             mPresentationTimeUs = presentationTimeUs;
         }
     }
@@ -563,22 +564,23 @@
      * Queues the audio data asynchronously for playback (AudioTrack must be in streaming mode).
      * @param audioData the buffer that holds the data to play. This buffer will be returned
      *     to the client via registered callback.
-     * @param bufferIndex the buffer index used to identify audioData. It will be returned to
-     *     the client along with audioData. This helps applications to keep track of audioData.
+     * @param bufferId an integer used to identify audioData. It will be returned to
+     *     the client along with audioData. This helps applications to keep track of audioData,
+     *     e.g., it can be used to store the output buffer index used by the audio codec.
      * @param presentationTimeUs the presentation timestamp in microseconds for the first frame
      *     in the buffer.
      * @throws IllegalStateException if audio track is not set or internal configureation
      *     has not been done correctly.
      */
     public void queueAudio(
-            @NonNull ByteBuffer audioData, int bufferIndex, long presentationTimeUs) {
+            @NonNull ByteBuffer audioData, int bufferId, long presentationTimeUs) {
         if (mAudioTrack == null || mAudioThread == null) {
             throw new IllegalStateException(
                     "AudioTrack is NOT set or audio thread is not created");
         }
 
         synchronized(mAudioLock) {
-            mAudioBuffers.add(new AudioBuffer(audioData, bufferIndex, presentationTimeUs));
+            mAudioBuffers.add(new AudioBuffer(audioData, bufferId, presentationTimeUs));
         }
 
         if (mPlaybackRate != 0.0) {
