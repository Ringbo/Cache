diff --git a/media/java/android/mtp/MtpStorage.java b/media/java/android/mtp/MtpStorage.java
index 9cf65a3..e20eabc 100644
--- a/media/java/android/mtp/MtpStorage.java
+++ b/media/java/android/mtp/MtpStorage.java
@@ -39,7 +39,7 @@
         mStorageId = volume.getStorageId();
         mPath = volume.getPath();
         mDescription = context.getResources().getString(volume.getDescriptionId());
-        mReserveSpace = volume.getMtpReserveSpace() * 1024 * 1024;
+        mReserveSpace = volume.getMtpReserveSpace() * 1024L * 1024L;
         mRemovable = volume.isRemovable();
         mMaxFileSize = volume.getMaxFileSize();
     }
