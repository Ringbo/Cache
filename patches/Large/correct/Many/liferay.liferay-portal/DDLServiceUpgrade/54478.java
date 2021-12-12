diff --git a/modules/apps/dynamic-data-lists/dynamic-data-lists-service/src/com/liferay/dynamic/data/lists/upgrade/DDLServiceUpgrade.java b/modules/apps/dynamic-data-lists/dynamic-data-lists-service/src/com/liferay/dynamic/data/lists/upgrade/DDLServiceUpgrade.java
index b7c5a1c..aa1254f 100644
--- a/modules/apps/dynamic-data-lists/dynamic-data-lists-service/src/com/liferay/dynamic/data/lists/upgrade/DDLServiceUpgrade.java
+++ b/modules/apps/dynamic-data-lists/dynamic-data-lists-service/src/com/liferay/dynamic/data/lists/upgrade/DDLServiceUpgrade.java
@@ -54,7 +54,7 @@
 		upgradeProcesses.add(new UpgradeLastPublishDate());
 
 		_releaseLocalService.updateRelease(
-			"com.liferay.dynamic.data.lists.service", upgradeProcesses, 1, 0,
+			"com.liferay.dynamic.data.lists.service", upgradeProcesses, 1, 1,
 			false);
 	}
 
