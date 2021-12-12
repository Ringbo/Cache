diff --git a/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/com/liferay/dynamic/data/mapping/internal/DDMStructureImpl.java b/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/com/liferay/dynamic/data/mapping/internal/DDMStructureImpl.java
index a6535f0..23ef010 100644
--- a/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/com/liferay/dynamic/data/mapping/internal/DDMStructureImpl.java
+++ b/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/com/liferay/dynamic/data/mapping/internal/DDMStructureImpl.java
@@ -97,7 +97,7 @@
 
 	@Override
 	public String getDefinition() {
-		return _ddmStructure.getDescription();
+		return _ddmStructure.getDefinition();
 	}
 
 	@Override
