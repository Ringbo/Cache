diff --git a/underfs/gcs/src/main/java/alluxio/underfs/gcs/GCSOutputStream.java b/underfs/gcs/src/main/java/alluxio/underfs/gcs/GCSOutputStream.java
index 283c9c6..5e94192 100644
--- a/underfs/gcs/src/main/java/alluxio/underfs/gcs/GCSOutputStream.java
+++ b/underfs/gcs/src/main/java/alluxio/underfs/gcs/GCSOutputStream.java
@@ -120,7 +120,7 @@
       obj.setBucketName(mBucketName);
       obj.setDataInputFile(mFile);
       obj.setContentLength(mFile.length());
-      obj.setContentEncoding(Mimetypes.MIMETYPE_BINARY_OCTET_STREAM);
+      obj.setContentType(Mimetypes.MIMETYPE_BINARY_OCTET_STREAM);
       if (mHash != null) {
         obj.setMd5Hash(mHash.digest());
       } else {
