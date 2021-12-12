diff --git a/core/server/proxy/src/main/java/alluxio/proxy/s3/ListBucketResult.java b/core/server/proxy/src/main/java/alluxio/proxy/s3/ListBucketResult.java
index 89e597f..12e08d1 100644
--- a/core/server/proxy/src/main/java/alluxio/proxy/s3/ListBucketResult.java
+++ b/core/server/proxy/src/main/java/alluxio/proxy/s3/ListBucketResult.java
@@ -75,7 +75,7 @@
     mName = bucketName;
     mKeyCount = 0;
     if (options.getMaxKeys() != null) {
-      mMaxKeys = Integer.valueOf(options.getMaxKeys());
+      mMaxKeys = Integer.parseInt(options.getMaxKeys());
     }
     mContents = new ArrayList<>();
     mContinuationToken = options.getContinuationToken();
