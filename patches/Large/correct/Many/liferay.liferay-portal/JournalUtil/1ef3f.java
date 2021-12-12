diff --git a/portal-impl/src/com/liferay/portlet/journal/util/JournalUtil.java b/portal-impl/src/com/liferay/portlet/journal/util/JournalUtil.java
index 003618b..71cf08b 100644
--- a/portal-impl/src/com/liferay/portlet/journal/util/JournalUtil.java
+++ b/portal-impl/src/com/liferay/portlet/journal/util/JournalUtil.java
@@ -310,7 +310,7 @@
 			if (folder.getFolderId() !=
 				JournalFolderConstants.DEFAULT_PARENT_FOLDER_ID) {
 
-				JournalFolder unescapedFolder = folder.toEscapedModel();
+				JournalFolder unescapedFolder = folder.toUnescapedModel();
 
 				Map<String, Object> data = new HashMap<String, Object>();
 
