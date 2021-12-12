diff --git a/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/com/liferay/dynamic/data/mapping/util/impl/DDMIndexerImpl.java b/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/com/liferay/dynamic/data/mapping/util/impl/DDMIndexerImpl.java
index 8412c0c..6c7d173 100644
--- a/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/com/liferay/dynamic/data/mapping/util/impl/DDMIndexerImpl.java
+++ b/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/com/liferay/dynamic/data/mapping/util/impl/DDMIndexerImpl.java
@@ -217,7 +217,7 @@
 		String[] ddmStructureFieldNameParts = StringUtil.split(
 			ddmStructureFieldName, DDMIndexer.DDM_FIELD_SEPARATOR);
 
-		DDMStructure structure = DDMStructureLocalServiceUtil.getStructure(
+		DDMStructure structure = _ddmStructureLocalService.getStructure(
 			GetterUtil.getLong(ddmStructureFieldNameParts[2]));
 
 		String fieldName = StringUtil.replaceLast(
