diff --git a/portal-impl/src/com/liferay/portlet/journal/webdav/JournalWebDAVStorageImpl.java b/portal-impl/src/com/liferay/portlet/journal/webdav/JournalWebDAVStorageImpl.java
index 6bd7036..c391b11 100644
--- a/portal-impl/src/com/liferay/portlet/journal/webdav/JournalWebDAVStorageImpl.java
+++ b/portal-impl/src/com/liferay/portlet/journal/webdav/JournalWebDAVStorageImpl.java
@@ -110,7 +110,7 @@
 				if (type.equals(_TYPE_STRUCTURES)) {
 					try {
 						JournalStructure journalStructure =
-							JournalStructureLocalServiceUtil.getStructure(
+							JournalStructureServiceUtil.getStructure(
 								webDavRequest.getGroupId(), journalTypeId,
 								true);
 
@@ -124,7 +124,7 @@
 				else if (type.equals(_TYPE_TEMPLATES)) {
 					try {
 						JournalTemplate journalTemplate =
-							JournalTemplateLocalServiceUtil.getTemplate(
+							JournalTemplateServiceUtil.getTemplate(
 								webDavRequest.getGroupId(), journalTypeId,
 								true);
 
