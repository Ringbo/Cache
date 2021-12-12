diff --git a/core/java/android/bluetooth/le/ScanRecord.java b/core/java/android/bluetooth/le/ScanRecord.java
index f8aaba9..04dd060 100644
--- a/core/java/android/bluetooth/le/ScanRecord.java
+++ b/core/java/android/bluetooth/le/ScanRecord.java
@@ -117,7 +117,7 @@
      */
     @Nullable
     public byte[] getServiceData(ParcelUuid serviceDataUuid) {
-        if (serviceDataUuid == null) {
+        if (serviceDataUuid == null || mServiceData == null) {
             return null;
         }
         return mServiceData.get(serviceDataUuid);
