diff --git a/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-test/src/testIntegration/java/com/liferay/dynamic/data/mapping/upgrade/v1_0_0/test/UpgradeDynamicDataMappingTest.java b/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-test/src/testIntegration/java/com/liferay/dynamic/data/mapping/upgrade/v1_0_0/test/UpgradeDynamicDataMappingTest.java
index 413f635..86682bd 100644
--- a/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-test/src/testIntegration/java/com/liferay/dynamic/data/mapping/upgrade/v1_0_0/test/UpgradeDynamicDataMappingTest.java
+++ b/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-test/src/testIntegration/java/com/liferay/dynamic/data/mapping/upgrade/v1_0_0/test/UpgradeDynamicDataMappingTest.java
@@ -1097,7 +1097,7 @@
 			String definition, String storageType)
 		throws Exception {
 
-		StringBundler sb = new StringBundler(6);
+		StringBundler sb = new StringBundler(7);
 
 		sb.append("insert into DDMStructure (structureId, groupId, ");
 		sb.append("companyId, userId, userName, versionUserId, ");
