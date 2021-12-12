diff --git a/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/com/liferay/dynamic/data/mapping/internal/DDMStructureManagerImpl.java b/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/com/liferay/dynamic/data/mapping/internal/DDMStructureManagerImpl.java
index f1a114e..19caaed 100644
--- a/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/com/liferay/dynamic/data/mapping/internal/DDMStructureManagerImpl.java
+++ b/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/com/liferay/dynamic/data/mapping/internal/DDMStructureManagerImpl.java
@@ -218,7 +218,7 @@
 		throws PortalException {
 
 		com.liferay.portlet.dynamicdatamapping.model.DDMStructure ddmStructure =
-			_ddmStructureLocalService.getStructure(structureId);
+			_ddmStructureLocalService.fetchDDMStructure(structureId);
 
 		return DDMUtil.getDDMFormFieldsJSONArray(ddmStructure, script);
 	}
