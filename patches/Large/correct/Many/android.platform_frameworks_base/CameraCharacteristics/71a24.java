diff --git a/core/java/android/hardware/camera2/CameraCharacteristics.java b/core/java/android/hardware/camera2/CameraCharacteristics.java
index 96d043c..a2ed8b4 100644
--- a/core/java/android/hardware/camera2/CameraCharacteristics.java
+++ b/core/java/android/hardware/camera2/CameraCharacteristics.java
@@ -341,7 +341,7 @@
      */
     @SuppressWarnings({"unchecked"})
     public List<CaptureRequest.Key<?>> getAvailablePhysicalCameraRequestKeys() {
-        if (mAvailableSessionKeys == null) {
+        if (mAvailablePhysicalRequestKeys == null) {
             Object crKey = CaptureRequest.Key.class;
             Class<CaptureRequest.Key<?>> crKeyTyped = (Class<CaptureRequest.Key<?>>)crKey;
 
@@ -1793,11 +1793,7 @@
      * The respective value of such request key can be obtained by calling
      * {@link CaptureRequest.Builder#getPhysicalCameraKey }. Capture requests that contain
      * individual physical device requests must be built via
-     * {@link android.hardware.camera2.CameraDevice#createCaptureRequest(int, Set)}.
-     * Such extended capture requests can be passed only to
-     * {@link CameraCaptureSession#capture } or {@link CameraCaptureSession#captureBurst } and
-     * not to {@link CameraCaptureSession#setRepeatingRequest } or
-     * {@link CameraCaptureSession#setRepeatingBurst }.</p>
+     * {@link android.hardware.camera2.CameraDevice#createCaptureRequest(int, Set)}.</p>
      * <p><b>Optional</b> - This value may be {@code null} on some devices.</p>
      * <p><b>Limited capability</b> -
      * Present on all camera devices that report being at least {@link CameraCharacteristics#INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED HARDWARE_LEVEL_LIMITED} devices in the
