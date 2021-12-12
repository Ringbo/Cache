diff --git a/modules/apps/dynamic-data-lists/dynamic-data-lists-web/src/com/liferay/dynamic/data/lists/web/upgrade/DDLDisplayWebUpgrade.java b/modules/apps/dynamic-data-lists/dynamic-data-lists-web/src/com/liferay/dynamic/data/lists/web/upgrade/DDLDisplayWebUpgrade.java
index d19c593..d7a7e7f 100644
--- a/modules/apps/dynamic-data-lists/dynamic-data-lists-web/src/com/liferay/dynamic/data/lists/web/upgrade/DDLDisplayWebUpgrade.java
+++ b/modules/apps/dynamic-data-lists/dynamic-data-lists-web/src/com/liferay/dynamic/data/lists/web/upgrade/DDLDisplayWebUpgrade.java
@@ -62,7 +62,7 @@
 
 		_releaseLocalService.updateRelease(
 			"com.liferay.dynamic.data.lists.web",
-			Collections.<UpgradeProcess>singletonList(upgradePortletId), 1, 0,
+			Collections.<UpgradeProcess>singletonList(upgradePortletId), 1, 1,
 			false);
 	}
 
