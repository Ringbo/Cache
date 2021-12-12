diff --git a/portal-impl/test/integration/com/liferay/portlet/journal/service/persistence/JournalFolderFinderTest.java b/portal-impl/test/integration/com/liferay/portlet/journal/service/persistence/JournalFolderFinderTest.java
index 42a7598..a306685b 100644
--- a/portal-impl/test/integration/com/liferay/portlet/journal/service/persistence/JournalFolderFinderTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/journal/service/persistence/JournalFolderFinderTest.java
@@ -85,7 +85,7 @@
 		queryDefinition.setStatus(WorkflowConstants.STATUS_IN_TRASH);
 
 		Assert.assertEquals(
-			2,
+			1,
 			JournalFolderFinderUtil.countF_A_ByG_F(
 				_group.getGroupId(), _folder1.getFolderId(), queryDefinition));
 
@@ -130,7 +130,7 @@
 		results = JournalFolderFinderUtil.findF_A_ByG_F(
 			_group.getGroupId(), _folder1.getFolderId(), queryDefinition);
 
-		Assert.assertEquals(2, results.size());
+		Assert.assertEquals(1, results.size());
 
 		for (Object result : results) {
 			if (result instanceof JournalFolder) {
