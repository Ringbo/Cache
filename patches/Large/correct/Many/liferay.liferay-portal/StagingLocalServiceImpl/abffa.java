diff --git a/portal-impl/src/com/liferay/portal/service/impl/StagingLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/StagingLocalServiceImpl.java
index aac1e11..528f1fc 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/StagingLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/StagingLocalServiceImpl.java
@@ -241,7 +241,7 @@
 		}
 
 		groupLocalService.updateGroup(
-			liveGroup.getGroupId(), typeSettingsProperties.toString());
+			liveGroup.getGroupId(), typeSettingsProperties.toSortedString());
 	}
 
 	@Override
@@ -269,7 +269,7 @@
 			liveGroup, typeSettingsProperties, serviceContext);
 
 		groupLocalService.updateGroup(
-			liveGroup.getGroupId(), typeSettingsProperties.toString());
+			liveGroup.getGroupId(), typeSettingsProperties.toSortedString());
 
 		if (!liveGroup.hasStagingGroup()) {
 			serviceContext.setAttribute("staging", String.valueOf(true));
@@ -367,7 +367,7 @@
 			liveGroup, typeSettingsProperties, serviceContext);
 
 		groupLocalService.updateGroup(
-			liveGroup.getGroupId(), typeSettingsProperties.toString());
+			liveGroup.getGroupId(), typeSettingsProperties.toSortedString());
 
 		updateStagedPortlets(remoteURL, remoteGroupId, typeSettingsProperties);
 
@@ -538,7 +538,7 @@
 
 		return groupLocalService.updateGroup(
 			stagingGroup.getGroupId(),
-			stagingTypeSettingsProperties.toString());
+			stagingTypeSettingsProperties.toSortedString());
 	}
 
 	protected void clearLastPublishDate(long groupId, boolean privateLayout)
