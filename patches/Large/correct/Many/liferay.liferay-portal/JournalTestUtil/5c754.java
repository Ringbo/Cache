diff --git a/portal-impl/test/integration/com/liferay/portlet/journal/util/JournalTestUtil.java b/portal-impl/test/integration/com/liferay/portlet/journal/util/JournalTestUtil.java
index b076f05..ca1a4fa 100644
--- a/portal-impl/test/integration/com/liferay/portlet/journal/util/JournalTestUtil.java
+++ b/portal-impl/test/integration/com/liferay/portlet/journal/util/JournalTestUtil.java
@@ -454,7 +454,7 @@
 		throws Exception {
 
 		JournalFolder folder = JournalFolderLocalServiceUtil.fetchFolder(
-			serviceContext.getScopeGroupId(), name);
+			serviceContext.getScopeGroupId(), parentFolderId, name);
 
 		if (folder != null) {
 			return folder;
