diff --git a/documentlibrary-impl/src/com/liferay/documentlibrary/util/S3Hook.java b/documentlibrary-impl/src/com/liferay/documentlibrary/util/S3Hook.java
index ce76dd6..42c532d 100644
--- a/documentlibrary-impl/src/com/liferay/documentlibrary/util/S3Hook.java
+++ b/documentlibrary-impl/src/com/liferay/documentlibrary/util/S3Hook.java
@@ -115,7 +115,7 @@
 
 		try {
 			S3Object[] s3Objects = _s3Service.listObjects(
-				_s3Bucket, getKey(companyId, repositoryId), null);
+				_s3Bucket, getKey(companyId, repositoryId, dirName), null);
 
 			for (int i = 0; i < s3Objects.length; i++) {
 				S3Object s3Object = s3Objects[i];
