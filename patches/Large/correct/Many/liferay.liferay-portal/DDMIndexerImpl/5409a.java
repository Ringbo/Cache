diff --git a/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/main/java/com/liferay/dynamic/data/mapping/internal/util/DDMIndexerImpl.java b/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/main/java/com/liferay/dynamic/data/mapping/internal/util/DDMIndexerImpl.java
index 7ad91943..7125630 100644
--- a/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/main/java/com/liferay/dynamic/data/mapping/internal/util/DDMIndexerImpl.java
+++ b/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/main/java/com/liferay/dynamic/data/mapping/internal/util/DDMIndexerImpl.java
@@ -78,7 +78,7 @@
 				String indexType = ddmStructure.getFieldProperty(
 					field.getName(), "indexType");
 
-				if (Validator.isNull(indexType)) {
+				if (Validator.isNull(indexType) || indexType.equals("none")) {
 					continue;
 				}
 
