diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/store/S3Store.java b/portal-impl/src/com/liferay/portlet/documentlibrary/store/S3Store.java
index 13ba346..f342ceb 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/store/S3Store.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/store/S3Store.java
@@ -568,7 +568,7 @@
 	protected String getKey(
 		long companyId, long repositoryId, String fileName) {
 
-		StringBundler sb = new StringBundler(6);
+		StringBundler sb = new StringBundler(4);
 
 		sb.append(companyId);
 		sb.append(StringPool.SLASH);
@@ -582,7 +582,7 @@
 		long companyId, long repositoryId, String fileName,
 		String versionLabel) {
 
-		StringBundler sb = new StringBundler(7);
+		StringBundler sb = new StringBundler(6);
 
 		sb.append(companyId);
 		sb.append(StringPool.SLASH);
