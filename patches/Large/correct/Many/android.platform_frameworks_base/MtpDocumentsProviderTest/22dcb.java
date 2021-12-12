diff --git a/packages/MtpDocumentsProvider/tests/src/com/android/mtp/MtpDocumentsProviderTest.java b/packages/MtpDocumentsProvider/tests/src/com/android/mtp/MtpDocumentsProviderTest.java
index 9ed15c8..53bccdc 100644
--- a/packages/MtpDocumentsProvider/tests/src/com/android/mtp/MtpDocumentsProviderTest.java
+++ b/packages/MtpDocumentsProvider/tests/src/com/android/mtp/MtpDocumentsProviderTest.java
@@ -561,7 +561,8 @@
     public void testBusyDevice() throws Exception {
         mMtpManager = new TestMtpManager(getContext()) {
             @Override
-            MtpDeviceRecord openDevice(int deviceId) throws IOException {
+            synchronized MtpDeviceRecord openDevice(int deviceId)
+                    throws IOException {
                 throw new BusyDeviceException();
             }
         };
