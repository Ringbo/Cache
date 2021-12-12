diff --git a/modules/apps/collaboration/document-library/document-library-repository-cmis-impl/src/main/java/com/liferay/document/library/repository/cmis/internal/model/CMISFileEntry.java b/modules/apps/collaboration/document-library/document-library-repository-cmis-impl/src/main/java/com/liferay/document/library/repository/cmis/internal/model/CMISFileEntry.java
index 7fce555..97e2665 100644
--- a/modules/apps/collaboration/document-library/document-library-repository-cmis-impl/src/main/java/com/liferay/document/library/repository/cmis/internal/model/CMISFileEntry.java
+++ b/modules/apps/collaboration/document-library/document-library-repository-cmis-impl/src/main/java/com/liferay/document/library/repository/cmis/internal/model/CMISFileEntry.java
@@ -405,12 +405,12 @@
 
 	@Override
 	public Class<?> getModelClass() {
-		return CMISFileEntry.class;
+		return FileEntry.class;
 	}
 
 	@Override
 	public String getModelClassName() {
-		return CMISFileEntry.class.getName();
+		return FileEntry.class.getName();
 	}
 
 	@Override
