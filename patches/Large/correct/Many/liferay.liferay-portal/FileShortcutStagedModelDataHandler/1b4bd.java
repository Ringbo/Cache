diff --git a/modules/apps/document-library/document-library-service/src/com/liferay/document/library/lar/FileShortcutStagedModelDataHandler.java b/modules/apps/document-library/document-library-service/src/com/liferay/document/library/lar/FileShortcutStagedModelDataHandler.java
index be6976f..03decc1 100644
--- a/modules/apps/document-library/document-library-service/src/com/liferay/document/library/lar/FileShortcutStagedModelDataHandler.java
+++ b/modules/apps/document-library/document-library-service/src/com/liferay/document/library/lar/FileShortcutStagedModelDataHandler.java
@@ -124,7 +124,7 @@
 
 	@Override
 	public String getDisplayName(FileShortcut fileShortcut) {
-		return fileShortcut.getToTitle();
+		return fileShortcut.getUuid();
 	}
 
 	@Override
