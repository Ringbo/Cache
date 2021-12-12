diff --git a/underfs/s3a/src/main/java/alluxio/underfs/s3a/S3AOutputStream.java b/underfs/s3a/src/main/java/alluxio/underfs/s3a/S3AOutputStream.java
index 72fa3fa..f1cff5b 100644
--- a/underfs/s3a/src/main/java/alluxio/underfs/s3a/S3AOutputStream.java
+++ b/underfs/s3a/src/main/java/alluxio/underfs/s3a/S3AOutputStream.java
@@ -142,7 +142,7 @@
         meta.setContentMD5(new String(Base64.encode(mHash.digest())));
       }
       meta.setContentLength(mFile.length());
-      meta.setContentEncoding(Mimetypes.MIMETYPE_OCTET_STREAM);
+      meta.setContentType(Mimetypes.MIMETYPE_OCTET_STREAM);
 
       // Generate the put request and wait for the transfer manager to complete the upload, then
       // delete the temporary file on the local machine
