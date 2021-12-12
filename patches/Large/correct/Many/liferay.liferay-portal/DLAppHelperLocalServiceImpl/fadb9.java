diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLAppHelperLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLAppHelperLocalServiceImpl.java
index 1a1eb42..6a0d770 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLAppHelperLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLAppHelperLocalServiceImpl.java
@@ -654,7 +654,7 @@
 			TrashVersion trashVersion =
 				trashVersionLocalService.fetchVersion(
 					trashEntry.getEntryId(), DLFileShortcut.class.getName(),
-					dlFileShortcut.getFolderId());
+					dlFileShortcut.getFileShortcutId());
 
 			int status = WorkflowConstants.STATUS_APPROVED;
 
@@ -921,7 +921,7 @@
 
 				TrashEntry trashEntry = trashEntryLocalService.fetchEntry(
 					DLFileShortcut.class.getName(),
-					dlFileShortcut.getFolderId());
+					dlFileShortcut.getFileShortcutId());
 
 				if (trashEntry != null) {
 					continue;
@@ -930,7 +930,7 @@
 				TrashVersion trashVersion =
 					trashVersionLocalService.fetchVersion(
 						trashEntryId, DLFileShortcut.class.getName(),
-						dlFileShortcut.getFolderId());
+						dlFileShortcut.getFileShortcutId());
 
 				int oldStatus = WorkflowConstants.STATUS_APPROVED;
 
