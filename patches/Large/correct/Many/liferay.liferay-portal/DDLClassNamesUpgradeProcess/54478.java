diff --git a/modules/apps/dynamic-data-lists/dynamic-data-lists-service/src/com/liferay/dynamic/data/lists/upgrade/v1_0_0/DDLClassNamesUpgradeProcess.java b/modules/apps/dynamic-data-lists/dynamic-data-lists-service/src/com/liferay/dynamic/data/lists/upgrade/v1_0_0/DDLClassNamesUpgradeProcess.java
index cdb97ac..c617044 100644
--- a/modules/apps/dynamic-data-lists/dynamic-data-lists-service/src/com/liferay/dynamic/data/lists/upgrade/v1_0_0/DDLClassNamesUpgradeProcess.java
+++ b/modules/apps/dynamic-data-lists/dynamic-data-lists-service/src/com/liferay/dynamic/data/lists/upgrade/v1_0_0/DDLClassNamesUpgradeProcess.java
@@ -40,7 +40,7 @@
 		upgradeDDLClassName(classNameDependencies);
 		upgradeDDLRecordClassName(classNameDependencies);
 		upgradeDDLRecordSetClassName(classNameDependencies);
-		upgradeDDLRecordSetClassName(classNameDependencies);
+		upgradeDDLRecordVersionClassName(classNameDependencies);
 	}
 
 	protected void upgradeDDLClassName(
