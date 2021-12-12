diff --git a/packages/MtpDocumentsProvider/tests/src/com/android/mtp/PipeManagerTest.java b/packages/MtpDocumentsProvider/tests/src/com/android/mtp/PipeManagerTest.java
index 006ab5c..cfb8b04 100644
--- a/packages/MtpDocumentsProvider/tests/src/com/android/mtp/PipeManagerTest.java
+++ b/packages/MtpDocumentsProvider/tests/src/com/android/mtp/PipeManagerTest.java
@@ -59,13 +59,13 @@
         mtpManager.setDocument(0, 1, new MtpDocument(1, 0, "", new Date(), 0, 0, false));
 
         // Upload testing bytes.
-        final ParcelFileDescriptor descriptor = pipeManager.writeDocument(
+        final ParcelFileDescriptor descriptor = mPipeManager.writeDocument(
                 getContext(), mtpManager, new Identifier(0, 0, 1));
         final ParcelFileDescriptor.AutoCloseOutputStream outputStream =
                 new ParcelFileDescriptor.AutoCloseOutputStream(descriptor);
         outputStream.write(HELLO_BYTES, 0, HELLO_BYTES.length);
         outputStream.close();
-        executor.awaitTermination(1000, TimeUnit.MILLISECONDS);
+        mExecutor.awaitTermination(1000, TimeUnit.MILLISECONDS);
 
         // Check if the placeholder file is removed.
         try {
