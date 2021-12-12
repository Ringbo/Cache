diff --git a/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-service/src/main/java/com/liferay/dynamic/data/mapping/internal/upgrade/v1_1_0/UpgradeCheckboxFieldToCheckboxMultipleField.java b/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-service/src/main/java/com/liferay/dynamic/data/mapping/internal/upgrade/v1_1_0/UpgradeCheckboxFieldToCheckboxMultipleField.java
index 7f4537a..3d7385d 100644
--- a/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-service/src/main/java/com/liferay/dynamic/data/mapping/internal/upgrade/v1_1_0/UpgradeCheckboxFieldToCheckboxMultipleField.java
+++ b/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-service/src/main/java/com/liferay/dynamic/data/mapping/internal/upgrade/v1_1_0/UpgradeCheckboxFieldToCheckboxMultipleField.java
@@ -179,7 +179,7 @@
 	protected void updateRecords(DDMForm ddmForm, long recordSetId)
 		throws Exception {
 
-		StringBundler sb = new StringBundler(7);
+		StringBundler sb = new StringBundler(5);
 
 		sb.append("select DDLRecordVersion.ddmStorageId, DDMContent.data_ ");
 		sb.append("from DDLRecordVersion inner join DDLRecordSet on ");
