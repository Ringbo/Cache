diff --git a/modules/apps/sharing/sharing-web/src/main/java/com/liferay/sharing/web/internal/portlet/action/ShareEntryMVCActionCommand.java b/modules/apps/sharing/sharing-web/src/main/java/com/liferay/sharing/web/internal/portlet/action/ShareEntryMVCActionCommand.java
index 610a3c8..d9a60ca 100644
--- a/modules/apps/sharing/sharing-web/src/main/java/com/liferay/sharing/web/internal/portlet/action/ShareEntryMVCActionCommand.java
+++ b/modules/apps/sharing/sharing-web/src/main/java/com/liferay/sharing/web/internal/portlet/action/ShareEntryMVCActionCommand.java
@@ -86,7 +86,7 @@
 				themeDisplay.getCompanyId(), curUserEmailAddresses);
 
 			if (user != null) {
-				_sharingEntryService.addSharingEntry(
+				_sharingEntryService.addOrUpdateSharingEntry(
 					user.getUserId(), classNameId, classPK,
 					themeDisplay.getScopeGroupId(), shareable,
 					sharingEntryPermissionDisplayActionKey.
