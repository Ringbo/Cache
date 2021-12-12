diff --git a/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/main/java/com/liferay/dynamic/data/mapping/service/impl/DDMTemplateServiceImpl.java b/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/main/java/com/liferay/dynamic/data/mapping/service/impl/DDMTemplateServiceImpl.java
index 1d88d2e..f9fd214 100644
--- a/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/main/java/com/liferay/dynamic/data/mapping/service/impl/DDMTemplateServiceImpl.java
+++ b/modules/apps/dynamic-data-mapping/dynamic-data-mapping-service/src/main/java/com/liferay/dynamic/data/mapping/service/impl/DDMTemplateServiceImpl.java
@@ -352,7 +352,7 @@
 		long resourceClassNameId, int status) {
 
 		return getTemplates(
-			companyId, new long[] {groupId}, resourceClassNameId, 0,
+			companyId, new long[] {groupId}, classNameId, 0,
 			resourceClassNameId, null, null, status);
 	}
 
