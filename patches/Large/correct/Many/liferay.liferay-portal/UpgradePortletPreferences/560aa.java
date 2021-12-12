diff --git a/modules/apps/announcements/announcements-web/src/main/java/com/liferay/announcements/web/internal/upgrade/v1_0_4/UpgradePortletPreferences.java b/modules/apps/announcements/announcements-web/src/main/java/com/liferay/announcements/web/internal/upgrade/v1_0_4/UpgradePortletPreferences.java
index 7f51ff8..f5a68f8 100644
--- a/modules/apps/announcements/announcements-web/src/main/java/com/liferay/announcements/web/internal/upgrade/v1_0_4/UpgradePortletPreferences.java
+++ b/modules/apps/announcements/announcements-web/src/main/java/com/liferay/announcements/web/internal/upgrade/v1_0_4/UpgradePortletPreferences.java
@@ -36,12 +36,12 @@
 				StringBundler.concat(
 					"select companyId, preferences from PortletPreferences ",
 					"where portletId = '", _PORTLET_ID, "' AND ownerType = ",
-					PortletKeys.PREFS_OWNER_TYPE_COMPANY, ";"));
+					PortletKeys.PREFS_OWNER_TYPE_COMPANY));
 			PreparedStatement ps2 = connection.prepareStatement(
 				StringBundler.concat(
 					"select portletPreferencesId, preferences from ",
 					"PortletPreferences where companyId = ? AND portletId = ",
-					"'?' AND ownerType = ?;"));
+					"? AND ownerType = ?"));
 			PreparedStatement ps3 = AutoBatchPreparedStatementUtil.autoBatch(
 				connection.prepareStatement(
 					"update PortletPreferences set preferences = ? where " +
