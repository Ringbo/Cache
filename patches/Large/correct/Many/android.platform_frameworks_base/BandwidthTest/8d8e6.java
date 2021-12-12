diff --git a/core/tests/bandwidthtests/src/com/android/bandwidthtest/BandwidthTest.java b/core/tests/bandwidthtests/src/com/android/bandwidthtest/BandwidthTest.java
index feea364..a781472 100644
--- a/core/tests/bandwidthtests/src/com/android/bandwidthtest/BandwidthTest.java
+++ b/core/tests/bandwidthtests/src/com/android/bandwidthtest/BandwidthTest.java
@@ -142,7 +142,7 @@
      * Ensure that uploading on wifi reports reasonable stats.
      */
     @LargeTest
-    public void testWifiUpload() {
+    public void testWifiUpload() throws Exception {
         assertTrue(setDeviceWifiAndAirplaneMode(mSsid));
         uploadFile();
     }
@@ -196,7 +196,7 @@
      * accounting still goes to the app making the call and that the numbers still make sense.
      */
     @LargeTest
-    public void testWifiDownloadWithDownloadManager() {
+    public void testWifiDownloadWithDownloadManager() throws Exception {
         assertTrue(setDeviceWifiAndAirplaneMode(mSsid));
         downloadFileUsingDownloadManager();
     }
