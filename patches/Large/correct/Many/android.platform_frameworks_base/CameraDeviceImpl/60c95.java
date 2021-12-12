diff --git a/core/java/android/hardware/camera2/impl/CameraDeviceImpl.java b/core/java/android/hardware/camera2/impl/CameraDeviceImpl.java
index d9f3af4..f1ce061 100644
--- a/core/java/android/hardware/camera2/impl/CameraDeviceImpl.java
+++ b/core/java/android/hardware/camera2/impl/CameraDeviceImpl.java
@@ -435,7 +435,7 @@
      * starting and stopping repeating request and flushing.
      *
      * <p>If lastFrameNumber is NO_FRAMES_CAPTURED, it means that the request was never
-     * sent to HAL. Then onCaptureSequenceCompleted is immediately triggered.
+     * sent to HAL. Then onCaptureSequenceAborted is immediately triggered.
      * If lastFrameNumber is non-negative, then the requestId and lastFrameNumber pair
      * is added to the list mFrameNumberRequestPairs.</p>
      *
@@ -446,7 +446,7 @@
     private void checkEarlyTriggerSequenceComplete(
             final int requestId, final long lastFrameNumber) {
         // lastFrameNumber being equal to NO_FRAMES_CAPTURED means that the request
-        // was never sent to HAL. Should trigger onCaptureSequenceCompleted immediately.
+        // was never sent to HAL. Should trigger onCaptureSequenceAborted immediately.
         if (lastFrameNumber == CaptureListener.NO_FRAMES_CAPTURED) {
             final CaptureListenerHolder holder;
             int index = mCaptureListenerMap.indexOfKey(requestId);
@@ -463,7 +463,7 @@
 
             if (holder != null) {
                 if (DEBUG) {
-                    Log.v(TAG, "immediately trigger onCaptureSequenceCompleted because"
+                    Log.v(TAG, "immediately trigger onCaptureSequenceAborted because"
                             + " request did not reach HAL");
                 }
 
@@ -480,10 +480,9 @@
                                     || lastFrameNumber > Integer.MAX_VALUE) {
                                 throw new AssertionError(lastFrameNumber + " cannot be cast to int");
                             }
-                            holder.getListener().onCaptureSequenceCompleted(
+                            holder.getListener().onCaptureSequenceAborted(
                                     CameraDeviceImpl.this,
-                                    requestId,
-                                    lastFrameNumber);
+                                    requestId);
                         }
                     }
                 };
