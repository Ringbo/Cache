diff --git a/portal-kernel/src/com/liferay/portal/kernel/upgrade/BaseUpgradePortletId.java b/portal-kernel/src/com/liferay/portal/kernel/upgrade/BaseUpgradePortletId.java
index ce2fc63..f437f1b 100644
--- a/portal-kernel/src/com/liferay/portal/kernel/upgrade/BaseUpgradePortletId.java
+++ b/portal-kernel/src/com/liferay/portal/kernel/upgrade/BaseUpgradePortletId.java
@@ -60,7 +60,7 @@
 		String oldStagingPortletId = StagingUtil.getStagedPortletId(
 			oldRootPortletId);
 
-		if (!typeSettingsProperties.containsKey(oldRootPortletId)) {
+		if (!typeSettingsProperties.containsKey(oldStagingPortletId)) {
 			return typeSettings;
 		}
 
