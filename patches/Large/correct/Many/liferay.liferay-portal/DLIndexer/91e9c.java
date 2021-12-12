diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/util/DLIndexer.java b/portal-impl/src/com/liferay/portlet/documentlibrary/util/DLIndexer.java
index 49d362b..402dabe 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/util/DLIndexer.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/util/DLIndexer.java
@@ -225,7 +225,7 @@
 
 		List<DLFileEntryMetadata> dlFileEntryMetadatas =
 			DLFileEntryMetadataLocalServiceUtil.
-				getFileEntryMetadataByFileVersionId(
+				getFileVersionFileEntryMetadatas(
 					dlFileVersion.getFileVersionId());
 
 		for (DLFileEntryMetadata dlFileEntryMetadata : dlFileEntryMetadatas) {
