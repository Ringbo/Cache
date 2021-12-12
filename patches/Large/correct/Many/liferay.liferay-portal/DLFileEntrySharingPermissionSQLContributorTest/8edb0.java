diff --git a/modules/apps/sharing/sharing-document-library-test/src/testIntegration/java/com/liferay/sharing/document/library/internal/security/permission/contributor/test/DLFileEntrySharingPermissionSQLContributorTest.java b/modules/apps/sharing/sharing-document-library-test/src/testIntegration/java/com/liferay/sharing/document/library/internal/security/permission/contributor/test/DLFileEntrySharingPermissionSQLContributorTest.java
index 69fc53b..503f6a2 100644
--- a/modules/apps/sharing/sharing-document-library-test/src/testIntegration/java/com/liferay/sharing/document/library/internal/security/permission/contributor/test/DLFileEntrySharingPermissionSQLContributorTest.java
+++ b/modules/apps/sharing/sharing-document-library-test/src/testIntegration/java/com/liferay/sharing/document/library/internal/security/permission/contributor/test/DLFileEntrySharingPermissionSQLContributorTest.java
@@ -142,7 +142,7 @@
 			_sharingEntryLocalService.addSharingEntry(
 				TestPropsValues.getUserId(), _groupUser.getUserId(),
 				classNameId, _fileEntry.getFileEntryId(), _group.getGroupId(),
-				Collections.singletonList(SharingEntryActionKey.VIEW),
+				true, Collections.singletonList(SharingEntryActionKey.VIEW),
 				serviceContext);
 
 			Assert.assertEquals(
