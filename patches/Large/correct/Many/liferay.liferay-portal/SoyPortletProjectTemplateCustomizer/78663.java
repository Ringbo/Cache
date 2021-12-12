diff --git a/modules/sdk/project-templates/project-templates-soy-portlet/src/main/java/com/liferay/project/templates/soy/portlet/internal/SoyPortletProjectTemplateCustomizer.java b/modules/sdk/project-templates/project-templates-soy-portlet/src/main/java/com/liferay/project/templates/soy/portlet/internal/SoyPortletProjectTemplateCustomizer.java
index b806b48..b1fc752 100644
--- a/modules/sdk/project-templates/project-templates-soy-portlet/src/main/java/com/liferay/project/templates/soy/portlet/internal/SoyPortletProjectTemplateCustomizer.java
+++ b/modules/sdk/project-templates/project-templates-soy-portlet/src/main/java/com/liferay/project/templates/soy/portlet/internal/SoyPortletProjectTemplateCustomizer.java
@@ -44,7 +44,7 @@
 			Path destinationDirPath = destinationDir.toPath();
 
 			Path projectPath = destinationDirPath.resolve(
-				_projectTemplateArgs.getName());
+				projectTemplatesArgs.getName());
 
 			Path gulpfileJsPath = projectPath.resolve("gulpfile.js");
 
