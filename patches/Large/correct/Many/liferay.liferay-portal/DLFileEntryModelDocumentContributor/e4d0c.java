diff --git a/modules/apps/document-library/document-library-service/src/main/java/com/liferay/document/library/internal/search/DLFileEntryModelDocumentContributor.java b/modules/apps/document-library/document-library-service/src/main/java/com/liferay/document/library/internal/search/DLFileEntryModelDocumentContributor.java
index d5dc344..9e0727f 100644
--- a/modules/apps/document-library/document-library-service/src/main/java/com/liferay/document/library/internal/search/DLFileEntryModelDocumentContributor.java
+++ b/modules/apps/document-library/document-library-service/src/main/java/com/liferay/document/library/internal/search/DLFileEntryModelDocumentContributor.java
@@ -164,7 +164,8 @@
 					CharPool.UNDERLINE));
 			document.addKeyword("path", dlFileEntry.getTitle());
 			document.addKeyword("readCount", dlFileEntry.getReadCount());
-			document.addKeyword("size", dlFileEntry.getSize());
+
+			document.addNumber("size", dlFileEntry.getSize());
 
 			//todo is this necessary? duplicates extractDDMContent
 			addFileEntryTypeAttributes(document, dlFileVersion);
