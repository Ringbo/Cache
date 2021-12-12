diff --git a/packages/MtpDocumentsProvider/src/com/android/mtp/MtpManager.java b/packages/MtpDocumentsProvider/src/com/android/mtp/MtpManager.java
index 8f254e9..a7de631 100644
--- a/packages/MtpDocumentsProvider/src/com/android/mtp/MtpManager.java
+++ b/packages/MtpDocumentsProvider/src/com/android/mtp/MtpManager.java
@@ -200,7 +200,7 @@
             }
             if (objectInfo.getFormat() != MtpConstants.FORMAT_ASSOCIATION) {
                 if (!device.sendObject(sendObjectInfoResult.getObjectHandle(),
-                        sendObjectInfoResult.getCompressedSize(), source)) {
+                        sendObjectInfoResult.getCompressedSizeLong(), source)) {
                     throw new IOException("Failed to send contents of a document");
                 }
             }
