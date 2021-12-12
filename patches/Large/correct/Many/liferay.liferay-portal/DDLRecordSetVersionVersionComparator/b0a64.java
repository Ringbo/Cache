diff --git a/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-api/src/main/java/com/liferay/dynamic/data/lists/util/comparator/DDLRecordSetVersionVersionComparator.java b/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-api/src/main/java/com/liferay/dynamic/data/lists/util/comparator/DDLRecordSetVersionVersionComparator.java
index 0e60711..bebe07d 100644
--- a/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-api/src/main/java/com/liferay/dynamic/data/lists/util/comparator/DDLRecordSetVersionVersionComparator.java
+++ b/modules/apps/forms-and-workflow/dynamic-data-lists/dynamic-data-lists-api/src/main/java/com/liferay/dynamic/data/lists/util/comparator/DDLRecordSetVersionVersionComparator.java
@@ -39,7 +39,7 @@
 		DDLRecordSetVersion recordSetVersion2) {
 
 		return _versionNumberComparator.compare(
-			recordSetVersion1.getVersion(), recordSetVersion1.getVersion());
+			recordSetVersion1.getVersion(), recordSetVersion2.getVersion());
 	}
 
 	public boolean isAscending() {
