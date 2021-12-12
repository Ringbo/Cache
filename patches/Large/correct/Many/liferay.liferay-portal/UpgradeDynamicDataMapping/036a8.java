diff --git a/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-service/src/main/java/com/liferay/dynamic/data/mapping/internal/upgrade/v1_0_0/UpgradeDynamicDataMapping.java b/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-service/src/main/java/com/liferay/dynamic/data/mapping/internal/upgrade/v1_0_0/UpgradeDynamicDataMapping.java
index 0d07546..84bbc7a 100644
--- a/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-service/src/main/java/com/liferay/dynamic/data/mapping/internal/upgrade/v1_0_0/UpgradeDynamicDataMapping.java
+++ b/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-service/src/main/java/com/liferay/dynamic/data/mapping/internal/upgrade/v1_0_0/UpgradeDynamicDataMapping.java
@@ -1024,7 +1024,7 @@
 
 	protected void upgradeExpandoStorageAdapter() throws Exception {
 		try (LoggingTimer loggingTimer = new LoggingTimer()) {
-			StringBundler sb1 = new StringBundler(6);
+			StringBundler sb1 = new StringBundler(5);
 
 			sb1.append("select DDMStructure.*, DDMStorageLink.* from ");
 			sb1.append("DDMStorageLink inner join DDMStructure on ");
