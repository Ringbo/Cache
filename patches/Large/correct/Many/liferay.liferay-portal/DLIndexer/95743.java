diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/util/DLIndexer.java b/portal-impl/src/com/liferay/portlet/documentlibrary/util/DLIndexer.java
index fa09b1e..6078bdd 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/util/DLIndexer.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/util/DLIndexer.java
@@ -481,7 +481,7 @@
 	protected void doReindex(Object obj) throws Exception {
 		DLFileEntry dlFileEntry = (DLFileEntry)obj;
 
-		DLFileVersion dlFileVersion = dlFileEntry.getLatestFileVersion(true);
+		DLFileVersion dlFileVersion = dlFileEntry.getFileVersion();
 
 		if (!dlFileVersion.isApproved()) {
 			return;
