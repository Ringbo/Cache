diff --git a/portal-impl/src/com/liferay/portlet/dynamicdatamapping/service/impl/DDMTemplateLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/dynamicdatamapping/service/impl/DDMTemplateLocalServiceImpl.java
index 66c118e..77d8ac5 100644
--- a/portal-impl/src/com/liferay/portlet/dynamicdatamapping/service/impl/DDMTemplateLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/dynamicdatamapping/service/impl/DDMTemplateLocalServiceImpl.java
@@ -293,7 +293,7 @@
 		DDMTemplate template = ddmTemplatePersistence.fetchByG_T(
 			groupId, templateKey);
 
-		if (!includeGlobalTemplates) {
+		if (!includeGlobalTemplates || (template != null)) {
 			return template;
 		}
 
